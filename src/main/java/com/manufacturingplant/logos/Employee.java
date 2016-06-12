package com.manufacturingplant.logos;

/**
 * Created by VYA on 07.05.2016.
 */
public class Employee {

    private int id;
    private String name;
    private String lastName;
    private String midlName;
    private String adress;
    private String dateOfBirdth;
    private String phoneNumber;
    private String type; // Enginner or worker
    private String position;
    private String workplace; //departament or workshop
    private String startDate;
    private int salary;

    public Employee() {
    }

    public Employee(int id, String name, String lastName,
                    String midlName, String adress, String dateOfBirdth, String phoneNumber,
                    String type, String position, String workplace, String startDate, int salary) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.midlName = midlName;
        this.adress = adress;
        this.dateOfBirdth = dateOfBirdth;
        this.phoneNumber = phoneNumber;
        this.type = type;
        this.position = position;
        this.workplace = workplace;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
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

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", midlName='" + midlName + '\'' +
                ", adress='" + adress + '\'' +
                ", dateOfBirdth='" + dateOfBirdth + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", type='" + type + '\'' +
                ", position='" + position + '\'' +
                ", workplace='" + workplace + '\'' +
                ", startDate='" + startDate + '\'' +
                ", salary=" + salary +
                '}';
    }
}
