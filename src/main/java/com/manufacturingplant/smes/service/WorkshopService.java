package com.manufacturingplant.smes.service;

import com.manufacturingplant.smes.entity.Workshop;

import java.util.List;

/**
 * Created by VYA on 28.05.2016.
 */
public interface WorkshopService {

    public void addWorkshop(String workshopName, String chairman);

//    public void removeWorkshop(int id, String workshopName, String chairman);

    public List<Workshop> findAll();



}
