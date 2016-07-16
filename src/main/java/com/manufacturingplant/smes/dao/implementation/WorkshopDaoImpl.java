package com.manufacturingplant.smes.dao.implementation;

import com.manufacturingplant.smes.dao.WorkshopDao;
import com.manufacturingplant.smes.entity.Workshop;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by VYA on 28.05.2016.
 */
@Repository
public class WorkshopDaoImpl implements WorkshopDao {

    @PersistenceContext(unitName = "Main")
    private EntityManager entityManager;


    @Transactional
    public void addWorkshop(Workshop workshop) {
        entityManager.persist(workshop);

    }

//    @Transactional
//    public void removeWorkshop(Workshop workshop) {
//        entityManager.remove(workshop);
//    }

    @Transactional
    public List<Workshop> findAll() {
        return entityManager.createQuery("from Workshop ").getResultList();
    }




}
