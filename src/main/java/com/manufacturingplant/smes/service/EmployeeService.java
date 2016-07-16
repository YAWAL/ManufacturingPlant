package com.manufacturingplant.smes.service;

import com.manufacturingplant.smes.entity.Employee;

import java.util.List;

/**
 * Created by VYA on 28.05.2016.
 */
public interface EmployeeService {

    public void addEmployee(String name, String lastName, String midlName, String adress, String dateOfBirdth,
                            String phoneNumber, String position, String startDate, int salary);

//    public void removeEmployee(int id, String name, String lastName, String midlName, String adress, String dateOfBirdth,
//                               String phoneNumber, String position, String startDate, int salary);

    public List<Employee> findAll();


}
