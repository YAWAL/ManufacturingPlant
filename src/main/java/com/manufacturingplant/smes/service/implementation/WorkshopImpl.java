package com.manufacturingplant.smes.service.implementation;

import com.manufacturingplant.smes.dao.WorkshopDao;
import com.manufacturingplant.smes.entity.Workshop;
import com.manufacturingplant.smes.service.WorkshopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by VYA on 28.05.2016.
 */
@Service
public class WorkshopImpl implements WorkshopService {

    @Autowired
    private WorkshopDao workshopDao;


    @Transactional
    public void addWorkshop(String workshopName, String chairman) {
        Workshop workshop = new Workshop();
        workshopDao.addWorkshop(workshop);
    }

    @Transactional
    public List<Workshop> findAll() {
        return workshopDao.findAll();
    }
}
