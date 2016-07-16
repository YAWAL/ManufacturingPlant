package com.manufacturingplant.smes.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by VYA on 11.05.2016.
 */

@Entity
public class Workshop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int workshopId;

    @Column
    private String workshopName;

    @Column
    private String chairman;

//    @Column
//    private int employeeQuantity;

//    @Column
//    private int equipmentProdQuantity;          // quantity of production equipments in workshop
//
//    @Column
//    private int equipmentNonprodQuantity;       // quantity of nonproduction equipments in workshop
//
//    @Column
//    private int toolQuantity;                   // quantity of tools


    @OneToMany(fetch = FetchType.LAZY, mappedBy = "workshop")
    private List<Employee> employeeList;


//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "workshop")
//    private List<Tool> tools;
//
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "workshop")
//    private List<ProductionEquipment> productionEquipments;
//
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "workshop")
//    private List<NonProductionEquipment> nonProductionEquipments;
//
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "workshop")
//    private List<Material> materials;


    public Workshop() {
    }

    public Workshop(String workshopName, String chairman, int employeeQuantity, int equipmentProdQuantity, int equipmentNonprodQuantity, int toolQuantity) {
        this.workshopName = workshopName;
        this.chairman = chairman;
//        this.employeeQuantity = employeeQuantity;
//        this.equipmentProdQuantity = equipmentProdQuantity;
//        this.equipmentNonprodQuantity = equipmentNonprodQuantity;
//        this.toolQuantity = toolQuantity;
    }

    public int getWorkshopId() {
        return workshopId;
    }

    public void setWorkshopId(int workshopId) {
        this.workshopId = workshopId;
    }

    public String getWorkshopName() {
        return workshopName;
    }

    public void setWorkshopName(String workshopName) {
        this.workshopName = workshopName;
    }

    public String getChairman() {
        return chairman;
    }

    public void setChairman(String chairman) {
        this.chairman = chairman;
    }

//    public int getEmployeeQuantity() {
//        return employeeQuantity;
//    }
//
//    public void setEmployeeQuantity(int employeeQuantity) {
//        this.employeeQuantity = employeeQuantity;
//    }
//
//    public int getEquipmentProdQuantity() {
//        return equipmentProdQuantity;
//    }
//
//    public void setEquipmentProdQuantity(int equipmentProdQuantity) {
//        this.equipmentProdQuantity = equipmentProdQuantity;
//    }

//    public int getEquipmentNonprodQuantity() {
//        return equipmentNonprodQuantity;
//    }
//
//    public void setEquipmentNonprodQuantity(int equipmentNonprodQuantity) {
//        this.equipmentNonprodQuantity = equipmentNonprodQuantity;
//    }
//
//    public int getToolQuantity() {
//        return toolQuantity;
//    }
//
//    public void setToolQuantity(int toolQuantity) {
//        this.toolQuantity = toolQuantity;
//    }


}
