package atmwithspringioc;

public class ATM {

    private CashDispenser dispenser1;
    private CashDispenser dispenser2;

    public ATM(CashDispenser dispenser1,CashDispenser dispenser2){
        this.dispenser1=dispenser1;
        this.dispenser2=dispenser2;
    }

    public void displayDispenserDetaila(){
        System.out.println("Dispenser1"+dispenser1+hashCode());
        System.out.println("Dispenser2"+dispenser2+hashCode());
    }

}
