package manytomany;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Test {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("hibernateDemo");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        Laptop laptop= new Laptop();
        laptop.setId(1);
        laptop.setName("Apple");

        Student student=new Student();
        student.setId(96);
        student.setName("Sahitya");

        laptop.getStudent().add(student);

        student.getLaptop().add(laptop);

        entityManager.persist(student);
        entityManager.persist(laptop);

        entityManager.getTransaction().commit();
        System.out.println();

    }
}
