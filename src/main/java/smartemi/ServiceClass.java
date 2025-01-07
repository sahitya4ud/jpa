package smartemi;

import java.util.ArrayList;
import java.util.List;

public class ServiceClass {
    public List<SmartEmi> emis(Transactions transactions,int noOfMonths){
        List<SmartEmi> smartEmiList=new ArrayList<>();
        double totalAmount=transactions.getTransactionAmount();
        double amountPerMonth=totalAmount/noOfMonths;
        double remainingAmount=totalAmount;
        for(int i = 0;i<noOfMonths;i++){
            SmartEmi smartEmi= new SmartEmi();
            smartEmi.setAmount(totalAmount);
            smartEmi.setAmount(amountPerMonth);
            remainingAmount-=amountPerMonth;
            smartEmi.setAmountLeft(remainingAmount);
            smartEmiList.add(smartEmi);

        }
        return smartEmiList;
    }
}
