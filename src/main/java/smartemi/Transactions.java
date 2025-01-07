package smartemi;

import jakarta.persistence.*;

import java.util.Date;
@Entity
public class Transactions {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int transactionId;
    @Column
    private Date transactionDate;
    @Column
    private double transactionAmount;
    @ManyToOne
    @JoinColumn(name="cardId")


    private Card creditCard;

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public Card getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(Card creditCard) {
        this.creditCard = creditCard;
    }
}
