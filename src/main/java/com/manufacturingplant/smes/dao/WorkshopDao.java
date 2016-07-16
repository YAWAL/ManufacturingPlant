package com.manufacturingplant.smes.dao;

import com.manufacturingplant.smes.entity.Workshop;

import java.util.List;

/**
 * Created by VYA on 28.05.2016.
 */
public interface WorkshopDao {

    public void addWorkshop(Workshop workshop); // registration of new workshop

//    public void removeWorkshop(Workshop workshop); // reorganization of workshop

    public List<Workshop>findAll();





}
