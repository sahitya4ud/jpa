package com.example.jpa.jpaonemanyinserts;

import com.example.jpa.dto.Employee;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Table(name = "Project_latest_jpa" , schema = "sonar")


public class Project {

    public Project(){
        //default constructor required by jpa
    }


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
        private List<com.example.jpa.dto.Employee> employeeList;


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

        public List<com.example.jpa.dto.Employee> getEmployeeList() {
            return employeeList;
        }

        public void setEmployeeList(List<Employee> employeeList) {
            this.employeeList = employeeList;
        }
    }


