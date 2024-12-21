package com.example.jpa.dto;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

//@Entity
@Table

public class Project {
    @Id
    @Column(name="id")
    private int id;
    @Column(name="pname")
    private String pname;
    @Column(name="startdate")
    private Date startdate;
    @Column(name="enddate")
    private Date enddate;
    @OneToMany(mappedBy = "projectEntity",cascade=CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Employee> employeeList;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
