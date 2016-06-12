package com.manufacturingplant.logos;

/**
 * Created by VYA on 11.05.2016.
 */
public class Workshop {

    private int id;
    private String workshopName;
    private String chairman;
    private int employeeQuantity;
    private int equipmentProdQuantity;          // quantity of production equipments in workshop
    private int equipmentNonprodQuantity;       // quantity of nonproduction equipments in workshop
    private int toolQuantity;                   // quantity of tools

    public Workshop() {
    }

    public Workshop(int id, String workshopName, String chairman, int employeeQuantity,
                    int equipmentProdQuantity, int equipmentNonprodQuantity, int toolQuantity) {
        this.id = id;
        this.workshopName = workshopName;
        this.chairman = chairman;
        this.employeeQuantity = employeeQuantity;
        this.equipmentProdQuantity = equipmentProdQuantity;
        this.equipmentNonprodQuantity = equipmentNonprodQuantity;
        this.toolQuantity = toolQuantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getEmployeeQuantity() {
        return employeeQuantity;
    }

    public void setEmployeeQuantity(int employeeQuantity) {
        this.employeeQuantity = employeeQuantity;
    }

    public int getEquipmentProdQuantity() {
        return equipmentProdQuantity;
    }

    public void setEquipmentProdQuantity(int equipmentProdQuantity) {
        this.equipmentProdQuantity = equipmentProdQuantity;
    }

    public int getEquipmentNonprodQuantity() {
        return equipmentNonprodQuantity;
    }

    public void setEquipmentNonprodQuantity(int equipmentNonprodQuantity) {
        this.equipmentNonprodQuantity = equipmentNonprodQuantity;
    }

    public int getToolQuantity() {
        return toolQuantity;
    }

    public void setToolQuantity(int toolQuantity) {
        this.toolQuantity = toolQuantity;
    }

    @Override
    public String toString() {
        return "Workshop{" +
                "id=" + id +
                ", workshopName='" + workshopName + '\'' +
                ", chairman='" + chairman + '\'' +
                ", employeeQuantity=" + employeeQuantity +
                ", equipmentProdQuantity=" + equipmentProdQuantity +
                ", equipmentNonprodQuantity=" + equipmentNonprodQuantity +
                ", toolQuantity=" + toolQuantity +
                '}';
    }
}
