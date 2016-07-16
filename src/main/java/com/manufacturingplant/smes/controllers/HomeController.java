package com.manufacturingplant.smes.controllers;

import com.manufacturingplant.smes.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by VYA on 10.06.2016.
 */
@Controller
public class HomeController {

    @Autowired
    private EmployeeService employeeService;

//    @Autowired
//    private DepartmentService departmentService;

    @Autowired
    private WorkshopService workshopService;

//    @Autowired
//    private ProductionEquipmentService productionEquipmentService;
//
//    @Autowired
//    private NonProductionEquipmentService nonProductionEquipmentService;
//
//    @Autowired
//    private ToolService toolService;
//
//    @Autowired
//    private Material material;






}
