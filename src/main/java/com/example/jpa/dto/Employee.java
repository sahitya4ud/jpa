package com.example.jpa.dto;

import jakarta.persistence.*;

//@Entity
@Table
public class Employee {
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

//    public int getMid() {
//        return mid;
//    }
//
//    public void setMid(int mid) {
//        this.mid = mid;
//    }
//
    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public Project getProjectEntity() {
        return projectEntity;
    }

    public void setProjectEntity(Project projectEntity) {
        this.projectEntity = projectEntity;
    }
}
