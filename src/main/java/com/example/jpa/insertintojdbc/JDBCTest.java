package com.example.jpa.insertintojdbc;

import com.example.jpa.dto.Employee;
import com.example.jpa.dto.Project;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JDBCTest {
    public static void main(String[] args) {
        List<Project> projectList = new ArrayList<>();

        Project avoota = new Project();
        avoota.setPname("avoota");
        avoota.setStartdate(new Date());
        avoota.setEnddate(new Date());

        Employee nani = new Employee();
        nani.setDept("IT");
        nani.setSalary(40000);
        nani.setName("nani");

        avoota.getEmployeeList().add(nani);


        Employee manisha = new Employee();
        manisha.setDept("IT");
        manisha.setSalary(20000);
        manisha.setName("manisha");

        avoota.getEmployeeList().add(manisha);

        Employee uday = new Employee();
        uday.setDept("IT");
        uday.setSalary(10000);
        uday.setName("uday");

        avoota.getEmployeeList().add(uday);


        Project GOOGLE = new Project();
        GOOGLE.setPname("GOOGLE");
        GOOGLE.setStartdate(new Date());
        GOOGLE.setEnddate(new Date());

        Employee reeti = new Employee();
        reeti.setDept("IT");
        reeti.setSalary(50000);
        reeti.setName("reeti");

        avoota.getEmployeeList().add(reeti);

        Employee vamshi = new Employee();
        vamshi.setDept("IT");
        vamshi.setSalary(10000);
        vamshi.setName("vamshi");

        avoota.getEmployeeList().add(vamshi);

        Employee sowmi = new Employee();
        sowmi.setDept("IT");
        sowmi.setSalary(20000);
        sowmi.setName("sowmi");

        avoota.getEmployeeList().add(sowmi);

        projectList.add(avoota);
        projectList.add(GOOGLE);


        System.out.println(projectList);
        JDBCParentChildInsertService jdbcParentChildInsertService=new JDBCParentChildInsertService();
        //  System.out.println(jdbcParentChildInsertService.saveProjectEmp(projectList));

        jdbcParentChildInsertService.saveProjectEmp(projectList);

}
}

