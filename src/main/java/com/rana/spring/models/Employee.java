package com.rana.spring.models;

import javax.persistence.Entity;
import javax.persistence.Id;

public class Employee extends Person {

    private String empId;
    private String company;
    private double salary;
    private String designation;

    public Employee(){}

    public Employee(String personId, String lastName, String firstName, int age, Gender gender, String empId, String company, double salary, String designation) {
        super(personId, lastName, firstName, age, gender);
        this.empId = empId;
        this.company = company;
        this.salary = salary;
        this.designation = designation;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId='" + empId + '\'' +
                ", company='" + company + '\'' +
                ", salary=" + salary +
                ", designation='" + designation + '\'' +
                '}';
    }
}
