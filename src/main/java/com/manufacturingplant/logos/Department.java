package com.manufacturingplant.logos;

/**
 * Created by VYA on 11.05.2016.
 */
public class Department {

    private int id;
    private String departmentName;
    private String chairman;
    private int employeeQuantity;
    private int equipmentNonprodQuantity; // quantity of nonproduction equipments in department


    public Department() {
    }

    public Department(int id, String departmentName, String chairman, int employeeQuantity, int equipmentNonprodQuantity) {
        this.id = id;
        this.departmentName = departmentName;
        this.chairman = chairman;
        this.employeeQuantity = employeeQuantity;
        this.equipmentNonprodQuantity = equipmentNonprodQuantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
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

    public int getEquipmentNonprodQuantity() {
        return equipmentNonprodQuantity;
    }

    public void setEquipmentNonprodQuantity(int equipmentNonprodQuantity) {
        this.equipmentNonprodQuantity = equipmentNonprodQuantity;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", departmentName='" + departmentName + '\'' +
                ", chairman='" + chairman + '\'' +
                ", employeeQuantity=" + employeeQuantity +
                ", equipmentNonprodQuantity=" + equipmentNonprodQuantity +
                '}';
    }
}
