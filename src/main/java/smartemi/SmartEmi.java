package smartemi;

import jakarta.persistence.*;

@Entity
public class SmartEmi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private double amount;
    @Column
    private int noOfMonths;
    @Column
    private double interest;
    @Column
    private double amountLeft;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getNoOfMonths() {
        return noOfMonths;
    }

    public void setNoOfMonths(int noOfMonths) {
        this.noOfMonths = noOfMonths;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmountLeft() {
        return amountLeft;
    }

    public void setAmountLeft(double amountLeft) {
        this.amountLeft = amountLeft;
    }
}
