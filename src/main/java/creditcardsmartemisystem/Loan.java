package creditcardsmartemisystem;

import jakarta.persistence.*;

@Entity
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int loanId;
    @Column
    private double emiAmount;
    @Column
    private int emiTenureMonths;
    @Column
    private double interestRate;
    @OneToOne
    @JoinColumn
    private Transaction transaction;

    public int getLoanId() {
        return loanId;
    }

    public void setLoanId(int loanId) {
        this.loanId = loanId;
    }

    public double getEmiAmount() {
        return emiAmount;
    }

    public void setEmiAmount(double emiAmount) {
        this.emiAmount = emiAmount;
    }

    public int getEmiTenureMonths() {
        return emiTenureMonths;
    }

    public void setEmiTenureMonths(int emiTenureMonths) {
        this.emiTenureMonths = emiTenureMonths;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
