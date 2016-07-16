package com.manufacturingplant.smes.dao;

import com.manufacturingplant.smes.entity.Employee;

import java.util.List;

/**
 * Created by VYA on 28.05.2016.
 */
public interface EmployeeDao {

    public void addEmployee(Employee employee); // addUser data about employee

//    public void removeEmployee(Employee employee); // remove data about employee

    public List<Employee>findAll(); // show all employee

}
