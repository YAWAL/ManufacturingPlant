package com.manufacturingplant.smes.entity;

import javax.persistence.*;

/**
 * Created by VYA on 07.05.2016.
 */

@Entity

@NamedQueries({
        @NamedQuery(name="Employee.findByName", query = "SELECT e FROM Employee e WHERE e.name like :name")
})

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column(length = 20)
    private String name;

    @Column(length = 30)
    private String lastName;

    @Column(length = 30)
    private String midlName;

    @Column(length = 100)
    private String adress;

    @Column(length = 40)
    private String dateOfBirdth;

    @Column(length = 20)
    private String phoneNumber;

    @Column(length = 20)
    private String position;

//future release
//    @Column(length = 15)
//    private String type; // Enginner or worker

//future release
//    @Column
//    private String workplace; //departament or workshop

    @Column(length = 10)
    private String startDate;

    @Column
    private int salary;

    @OneToOne(fetch = FetchType.LAZY)
    private Users users;

//    @ManyToOne(fetch = FetchType.LAZY)
//    private Department department;

    @ManyToOne(fetch = FetchType.LAZY)
    private Workshop workshop;



    public Employee() {
    }

    public Employee(String name, String lastName,
                    String midlName, String adress, String dateOfBirdth, String phoneNumber, String position, String startDate, int salary) {
        this.name = name;
        this.lastName = lastName;
        this.midlName = midlName;
        this.adress = adress;
        this.dateOfBirdth = dateOfBirdth;
        this.phoneNumber = phoneNumber;
        this.position = position;
        this.startDate = startDate;
        this.salary = salary;
    }

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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMidlName() {
        return midlName;
    }

    public void setMidlName(String midlName) {
        this.midlName = midlName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getDateOfBirdth() {
        return dateOfBirdth;
    }

    public void setDateOfBirdth(String dateOfBirdth) {
        this.dateOfBirdth = dateOfBirdth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

   public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }




}
