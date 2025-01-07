package smartemi;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("hibernateDemo");

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        List<Transactions> transactionsList= new ArrayList<>();
        Card card=new Card();
        card.setHolderName("sahitya");
        Transactions transactions=new Transactions();
        transactions.setTransactionDate(new Date());
        transactions.setTransactionAmount(100.80);

        transactions.setCreditCard(card);

        Transactions transactions1=new Transactions();
        transactions1.setTransactionAmount(200.90);
        transactions.setCreditCard(card);

       // transactions1.setTransactionDate();
        Date currentDate = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        transactions1.setTransactionDate(calendar.getTime());
        transactionsList.add(transactions);
        transactionsList.add(transactions1);
        card.setTransactions(transactionsList);

        entityManager.persist(card);
        entityManager.persist(transactions);
        entityManager.persist(transactions1);

        ServiceClass e=new ServiceClass();
       List<SmartEmi> r= e.emis(transactions1,5);
        //r.forEach(smartEmi -> smartEmi.getAmountLeft());
        //System.out.println(r.forEach(smartEmi -> smartEmi.getAmountLeft()));
        for(SmartEmi s:r){
            System.out.println("amountLeft "+s.getAmountLeft()+" totalAmount "+s.getAmount());

        }
        entityManager.getTransaction().commit();


    }
}
