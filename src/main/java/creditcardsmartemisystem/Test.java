package creditcardsmartemisystem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Test {
    public static void main(String[] args) throws Exception {
        ApplicationContext context = new AnnotationConfigApplicationContext("creditcardsmartemisystem");
        EmiService emiService = context.getBean(EmiService.class);
        BillService billService = context.getBean(BillService.class);

        CreditCard card = new CreditCard();
        card.setCardNumber("1234");

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Transaction t1= new Transaction();
        t1.setTransactionAmount(100);
        //t1.setTransactionDate(new SimpleDateFormat("yyyy-MM-dd").parse("2024-12-12"));
        t1.setTransactionDate(sdf.parse("2024-12-12"));
        t1.setTransactionType("Shopping");
        card.addTransaction(t1);

        Transaction t2= new Transaction();
        t1.setTransactionAmount(100);
       // t1.setTransactionDate(new SimpleDateFormat("yyyy-MM-dd").parse("2024-12-13"));
        t1.setTransactionDate(sdf.parse("2024-12-13"));
        t1.setTransactionType("Donation");
        card.addTransaction(t2);

        Transaction t3= new Transaction();
        t1.setTransactionAmount(100);
        t1.setTransactionDate(sdf.parse("2024-12-14"));
        t1.setTransactionType("Shopping");
        card.addTransaction(t3);

        Transaction t4= new Transaction();
        t1.setTransactionAmount(100);
        t1.setTransactionDate(sdf.parse("2024-12-15"));
        t1.setTransactionType("Shopping");
        card.addTransaction(t4);

        Transaction t5= new Transaction();
        t1.setTransactionAmount(100);
        t1.setTransactionDate(sdf.parse("2024-12-16"));
        t1.setTransactionType("Shopping");
        card.addTransaction(t5);

        Transaction t6= new Transaction();
        t1.setTransactionAmount(100);
        t1.setTransactionDate(sdf.parse("2024-12-17"));
        t1.setTransactionType("Shopping");
        card.addTransaction(t6);

        Transaction t7= new Transaction();
        t1.setTransactionAmount(100);
        t1.setTransactionDate(sdf.parse("2024-12-18"));
        t1.setTransactionType("Shopping");
        card.addTransaction(t7);

        Transaction t8= new Transaction();
        t1.setTransactionAmount(100);
        t1.setTransactionDate(sdf.parse("2024-12-19"));
        t1.setTransactionType("Shopping");
        card.addTransaction(t8);

        Transaction t9= new Transaction();
        t1.setTransactionAmount(100);
        t1.setTransactionDate(sdf.parse("2024-12-20"));
        t1.setTransactionType("Shopping");
        card.addTransaction(t9);

        Transaction t10= new Transaction();
        t1.setTransactionAmount(1000);
        t1.setTransactionDate(sdf.parse("2024-12-21"));
        t1.setTransactionType("Shopping");
        card.addTransaction(t10);

        //convert transaction to smart Emi
        emiService.convertToSmartEmi(t1,12,1.5);


        //Generate bill for december
        Date fromDate = sdf.parse("2024-12-01");
        Date toDate = sdf.parse("2024-12-31");

        List<Transaction> bill = billService.generateCardBill(card,fromDate,toDate);


        System.out.println("Card Bill for december ");
        bill.forEach(System.out::println);




    }
}
