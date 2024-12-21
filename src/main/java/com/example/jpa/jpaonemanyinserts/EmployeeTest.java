package com.example.jpa.jpaonemanyinserts;
import jakarta.persistence.*;


@Table(schema = "sonar", name= "employee_latest_jpa")
public class EmployeeTest {


        @Id
        @Column(name="id")
        private int id;
        @Column(name="name")
        private String name;
        @Column(name="dept")
        private String dept;
        @Column(name="salary")
        private double salary;
        @Column(name="state")
        private String state;
        //    @Column(name="mid",nullable = false)
//    private int mid;
        @Column(name="pid",insertable = false,updatable = false)
        private int pid;
        @JoinColumn(name="pid",referencedColumnName = "id")
        @ManyToOne
        private Project projectEntity;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDept() {
            return dept;
        }

        public void setDept(String dept) {
            this.dept = dept;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

    }
