package com.manufacturingplant.smes.dao.implementation;

import com.manufacturingplant.smes.dao.UsersDao;
import com.manufacturingplant.smes.entity.Users;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by VYA on 28.05.2016.
 */
@Repository
public class UsersDaoImpl implements UsersDao {

    @PersistenceContext(unitName = "Main")
    private EntityManager entityManager;

    @Transactional
    public void addUser(Users users) {
        entityManager.persist(users);

    }

    @Transactional
    public Users findUserByEmail(String email) {
        return entityManager.createNamedQuery("Users.findUserByEmail", Users.class).setParameter(email, email).getSingleResult();
    }



    @Transactional
    public Users findUserByID(int userId) {
        return entityManager.find(Users.class, userId);
    }




}
