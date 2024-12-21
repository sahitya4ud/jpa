package manytomany;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("hibernateDemo");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        Laptop laptop= new Laptop();
        laptop.setId(2);
        laptop.setName("Apple");
       List<Student> student1=new ArrayList<>();
        Student student=new Student();
        student.setId(70);
        student.setName("Sahitya");
        student1.add(student);
        laptop.getStudent().add(student);

        student.getLaptop().add(laptop);

        entityManager.persist(student);
        entityManager.persist(laptop);

        entityManager.getTransaction().commit();

        System.out.println(Singleton.getInstance().listOfStudents("Apple",student1));
    }
}
