package com.manufacturingplant.smes.dao.implementation;

import com.manufacturingplant.smes.dao.EmployeeDao;
import com.manufacturingplant.smes.entity.Employee;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by VYA on 28.05.2016.
 */
@Repository
public class EmployeeDaoImpl implements EmployeeDao {

    @PersistenceContext(unitName = "Main")
    private EntityManager entityManager;

    @Transactional
    public void addEmployee(Employee employee) {
        entityManager.persist(employee);

    }

//    @Transactional
//    public void removeEmployee(Employee employee) {
//        entityManager.remove(employee);
//    }

    @Transactional
    public List<Employee> findAll() {
        return entityManager.createQuery("from Employee ").getResultList();
    }



}
