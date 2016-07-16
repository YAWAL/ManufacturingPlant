package com.manufacturingplant.smes.service.implementation;

import com.manufacturingplant.smes.dao.EmployeeDao;
import com.manufacturingplant.smes.dao.WorkshopDao;
import com.manufacturingplant.smes.entity.Employee;
import com.manufacturingplant.smes.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by VYA on 28.05.2016.
 */
@Service
public class EmployeeImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

//    @Autowired
//    private DepartmentDao departmentDao;

    @Autowired
    private WorkshopDao workshopDao;


    @Transactional
    public void addEmployee(String name, String lastName, String midlName, String adress, String dateOfBirdth,
                            String phoneNumber, String position, String startDate, int salary) {
        Employee employee = new Employee(name, lastName, midlName, adress, dateOfBirdth, phoneNumber, position,
                startDate, salary);
        employeeDao.addEmployee(employee);
    }

    @Override
    public List<Employee> findAll() {
        return employeeDao.findAll();
    }


}
