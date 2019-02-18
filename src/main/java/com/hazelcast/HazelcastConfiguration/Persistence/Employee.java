package com.hazelcast.HazelcastConfiguration.Persistence;

import javax.persistence.*;

@Entity
@Table(name="App_Employee_Details")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    @Column(name="Employee_Id")
    private Integer empId;





    @Column(name="Employee_Name")
    private String employeeName;

    @Column(name="Address")
    private String address;

    @Column(name="CompanyName")
    private String companyName;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }




}
