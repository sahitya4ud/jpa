package creditcardtransaction;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.transaction.Transaction;

import java.util.List;

@Entity
public class CreditCard {
    @Id
    @Column
    private String creditCardNumber;
    @Column
    private  String creditCardExpiration;
    @Column
    private String creditCardCvv;

    @OneToMany(mappedBy = "creditCard")
    private List<Transaction> transactionList;

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getCreditCardExpiration() {
        return creditCardExpiration;
    }

    public void setCreditCardExpiration(String creditCardExpiration) {
        this.creditCardExpiration = creditCardExpiration;
    }

    public String getCreditCardCvv() {
        return creditCardCvv;
    }

    public List<Transaction> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(List<Transaction> transactionList) {
        this.transactionList = transactionList;
    }

    public void setCreditCardCvv(String creditCardCvv) {
        this.creditCardCvv = creditCardCvv;


    }
}
