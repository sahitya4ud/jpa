package com.example.jpa.jpaonemanyinserts;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDto {

    public void savejpa(Project project){

        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("hibernateDemo");

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        Project projectEntity = new Project();
        projectEntity.setPname(project.getPname());

        projectEntity.setStartdate(project.getStartdate());
        projectEntity.setEnddate(project.getEnddate());

        List<EmployeeTest> employeeList = new ArrayList<>();


//        for(int i=0;i<project.getEmployeeList().size();i++){
//           //
//            // Employee employee = project.getEmployeeList().get(i);
//
//          EmployeeTest employeeTest = project.getEmployeeList().get(i);
//            EmployeeTest employeeEntity = new EmployeeTest();
//            employeeEntity.setName(employeeTest.getName());
//            employeeEntity.setDept(employeeTest.getDept());
//            employeeEntity.setState(employeeTest.getState());
//            employeeEntity.setSalary(employeeTest.getSalary());
//            employeeList.add(employeeTest);
//
//
//
//
//        }
//
//
//        projectEntity.setEmployeeList(employeeList);
//
//        entityManager.persist(project);
//        entityManager.getTransaction().commit();
//    }

//    public static void EmployeeData(){
//        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("hibernateDemo");
//
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        entityManager.getTransaction().begin();
//        //Query query=entityManager.createQuery("select e from Employee e");
//        // select * from sonar.Project1 p inner join sonar.Employee e on p.id=e.pid;
//        //select distinct(p) from ProjectEntity p join fetch p.employee
//        // Query query1=entityManager.createQuery("select p from Project p  join fetch Employee e on p.id=e.pid");
//        Query query1=entityManager.createQuery("select distinct(p) from Project p  join fetch Employee e on p.id=e.pid");
//        // List<Employee> employee= query.getResultList();
//        List<com.example.jpa.dto.Project> projectEntity= query1.getResultList();
//        entityManager.getTransaction().commit();


//        for(Employee employee1:employee){
//            System.out.println(employee1.getName());
//
//        }
//        for(Project projectEntity1:projectEntity){
//            System.out.println(projectEntity1.getPname());
//            System.out.println(projectEntity1.getEmployeeList());
//        }




    }



}

