package creditcardsmartemisystem;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class CreditCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cardId;
    @Column
    private String cardNumber;

    @OneToMany(mappedBy = "creditCard")
    private List<Transaction> transactions = new ArrayList<>();

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    //Method to create and add a transaction
    public void addTransaction(Transaction transaction){
       // System.out.println("Adding Transaction:" + transaction);

       // if(transaction.getTransactionDate()==null){

                                          transaction.setTransactionDate(new Date());

          // throw new IllegalArgumentException("Transaction date cannot be null");
       // }
         //if(transaction.getTransactionAmount() <= 0) {
            // throw new IllegalArgumentException("Transaction amount must be greater than zero");
        // }
        //if(transaction.getTransactionDate()==null || transaction.getTransactionType().isEmpty()){
           // throw new IllegalArgumentException("Transaction date cannot be null or empty");
       // }
        transactions.add(transaction);
        transaction.setCreditCard(this);
    }
//    public Transaction createTransaction(double amount, String type, Date date) {
//
//        if(amount<= 0){
//            throw new IllegalArgumentException("Transaction amount must be positive");
//        }
//
//        Transaction transaction = new Transaction();
//        transaction.setTransactionAmount(amount);
//        transaction.setTransactionType(type);
//        transaction.setTransactionDate(date);
//
//        transactions.add(transaction);
//        transaction.setCreditCard(this);
//
//        return transaction;
//    }
}

