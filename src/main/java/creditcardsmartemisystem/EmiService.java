package creditcardsmartemisystem;

import org.springframework.stereotype.Service;

@Service
public class EmiService {
    public Loan convertToSmartEmi(Transaction transaction,int tenureMonths,double interestRate){
        double principal = transaction.getTransactionAmount();
        double emi = calculateEmi(principal,tenureMonths,interestRate);

        Loan loan = new Loan();
        loan.setEmiTenureMonths(tenureMonths);
        loan.setInterestRate(interestRate);
        loan.setEmiAmount(emi);

        transaction.setLoan(loan);
        return loan;
    }
    private double calculateEmi(double principal,int months,double rate) {
        double monthlyRate = rate / 100.0;
        return (principal* monthlyRate* Math.pow(1+monthlyRate,months)) / (Math.pow(1+monthlyRate,months)-1);

    }
}
