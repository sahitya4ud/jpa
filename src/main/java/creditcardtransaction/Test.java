package creditcardtransaction;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("hibernateDemo");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        CreditCard creditCard=new CreditCard();
        creditCard.setCreditCardNumber("1234");
        creditCard.setCreditCardCvv("123");
        creditCard.setCreditCardExpiration("12/25");

        Transaction t1= new Transaction();
        t1.setTransactionAmount(100);
        t1.setTransactionId(1);
        t1.setTransactionDate(new Date());
        t1.setTransactionType("shopping");

        Transaction t2= new Transaction();
        t1.setTransactionAmount(100);
        t1.setTransactionId(2);
        t1.setTransactionDate(new Date());
        t1.setTransactionType("Dining");

        Transaction t3= new Transaction();
        t1.setTransactionAmount(100);
        t1.setTransactionId(3);
        t1.setTransactionDate(new Date());
        t1.setTransactionType("shopping");

        Transaction t4= new Transaction();
        t1.setTransactionAmount(100);
        t1.setTransactionId(4);
        t1.setTransactionDate(new Date());
        t1.setTransactionType("shopping");

        Transaction t5= new Transaction();
        t1.setTransactionAmount(100);
        t1.setTransactionId(5);
        t1.setTransactionDate(new Date());
        t1.setTransactionType("shopping");

        Transaction t6= new Transaction();
        t1.setTransactionAmount(100);
        t1.setTransactionId(6);
        t1.setTransactionDate(new Date());
        t1.setTransactionType("shopping");

        Transaction t7= new Transaction();
        t1.setTransactionAmount(100);
        t1.setTransactionId(7);
        t1.setTransactionDate(new Date());
        t1.setTransactionType("shopping");

        Transaction t8= new Transaction();
        t1.setTransactionAmount(100);
        t1.setTransactionId(8);
        t1.setTransactionDate(new Date());
        t1.setTransactionType("shopping");

        Transaction t9= new Transaction();
        t1.setTransactionAmount(100);
        t1.setTransactionId(9);
        t1.setTransactionDate(new Date());
        t1.setTransactionType("shopping");

        Transaction t10= new Transaction();
        t1.setTransactionAmount(100);
        t1.setTransactionId(10);
        t1.setTransactionDate(new Date());
        t1.setTransactionType("shopping");

        creditCard.setTransactionList(Arrays.asList(t1,t2,t3,t4,t5));
        entityManager.persist(creditCard);
        entityManager.getTransaction().commit();

        System.out.println("display data");
    }
}
