package com.manufacturingplant.logos;

/**
 * Created by VYA on 11.05.2016.
 */
public class Tool {

    private int id;
    private String toolName;
    private String workshopName;    // workshop name which tool is belong to
    private int quantity;           // quantity of tools exist in determined workshop
    private String description;     // brief description of tool
    private String manufacturer;    // maybe toolworkshop
    private String vendor;          // maybe toolworkshop
    private String productionYear;  // year when tool was produced
    private String startDate;       // date when equipment started work
    private int cost;            // equipment cost in UAH

    public Tool() {
    }

    public Tool(int id, String toolName, String workshopName, int quantity, String description, String manufacturer,
                String vendor, String productionYear, String startDate, int cost) {
        this.id = id;
        this.toolName = toolName;
        this.workshopName = workshopName;
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

    public String getToolName() {
        return toolName;
    }

    public void setToolName(String toolName) {
        this.toolName = toolName;
    }

    public String getWorkshopName() {
        return workshopName;
    }

    public void setWorkshopName(String workshopName) {
        this.workshopName = workshopName;
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
        return "Tool{" +
                "id=" + id +
                ", toolName='" + toolName + '\'' +
                ", workshopName='" + workshopName + '\'' +
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
