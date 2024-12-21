package stock;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.Date;

public class TestClass {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("hibernateDemo");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        FutureStock futureStock = new FutureStock();
        futureStock.setEpirationDate(new Date());
        futureStock.setComName("geico");
        futureStock.setTickerSymbol("String");

        OptionalStock optionalStock= new OptionalStock();
        optionalStock.setOptionType("call");
        optionalStock.setComName("geico");
        optionalStock.setTickerSymbol("String");


       RestrictedStock restrictedStock= new RestrictedStock();
        restrictedStock.setVestingPeriod(2);
        restrictedStock.setComName("geico");
        restrictedStock.setTickerSymbol("String");

        entityManager.persist(futureStock);
        entityManager.persist(optionalStock);
        entityManager.persist(restrictedStock);

        entityManager.getTransaction().commit();


    }
}
