package com.manufacturingplant.logos;

/**
 * Created by VYA on 12.05.2016.
 */
public class NonProductionEquipment {

    private int id;
    private String nonProdEquipName;     // nonproduction equipment name, f.e. "light" , "pump", etc.
    private String workPlaceName;        // place where equipment is installed - workshop name or department name
    private int quantity;                // quantity of equipments installed in determined workshop
    private String description;          // brief description of equipment
    private String manufacturer;
    private String vendor;
    private String productionYear;       // year when equipment was produced
    private String startDate;            // date when equipment started work
    private int cost;                 // equipment cost in UAH

    public NonProductionEquipment() {
    }

    public NonProductionEquipment(int id, String nonProdEquipName, String workPlaceName, int quantity,
                                  String description, String manufacturer, String vendor, String productionYear,
                                  String startDate, int cost) {
        this.id = id;
        this.nonProdEquipName = nonProdEquipName;
        this.workPlaceName = workPlaceName;
        this.quantity = quantity;
        this.description = description;
        this.manufacturer = manufacturer;
        this.vendor = vendor;
        this.productionYear = productionYear;
        this.startDate = startDate;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNonProdEquipName() {
        return nonProdEquipName;
    }

    public void setNonProdEquipName(String nonProdEquipName) {
        this.nonProdEquipName = nonProdEquipName;
    }

    public String getWorkPlaceName() {
        return workPlaceName;
    }

    public void setWorkPlaceName(String workPlaceName) {
        this.workPlaceName = workPlaceName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(String productionYear) {
        this.productionYear = productionYear;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "NonProductionEquipment{" +
                "id=" + id +
                ", nonProdEquipName='" + nonProdEquipName + '\'' +
                ", workPlaceName='" + workPlaceName + '\'' +
                ", quantity=" + quantity +
                ", description='" + description + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", vendor='" + vendor + '\'' +
                ", productionYear='" + productionYear + '\'' +
                ", startDate='" + startDate + '\'' +
                ", cost=" + cost +
                '}';
    }
}
