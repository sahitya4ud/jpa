package atmwithspringioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("atmwithspringioc");

        ATM atm= context.getBean(ATM.class);
         ATM atm1 = context.getBean(ATM.class);
        atm.displayDispenserDetaila();

        CashDispenser newDispenser = context.getBean(CashDispenser.class);
        CashDispenser newDispenser1 = context.getBean(CashDispenser.class);
        System.out.println("Test class dispenser 1"+newDispenser1.hashCode());
        System.out.println("Test class dispenser 1"+newDispenser.hashCode());
        System.out.println("Test class atm"+atm.hashCode());
        System.out.println("Test class atm1"+atm1.hashCode());
        System.out.println("New Cash Dispenser"+ newDispenser);
    }
}
