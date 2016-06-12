package com.manufacturingplant.logos;

/**
 * Created by VYA on 12.05.2016.
 */
public class MaterialNonMetal {

    private int id;
    private String type;
    private String materialName;
    private String description;
    private String standard;
    private String manufacturer;
    private String manufacturerAdress;
    private String vendor;
    private String vendorAdress;
    private int weight;

    public MaterialNonMetal() {
    }

    public MaterialNonMetal(int id, String type, String materialName, String description, String standard,
                            String manufacturer, String manufacturerAdress, String vendor, String vendorAdress, int weight) {
        this.id = id;
        this.type = type;
        this.materialName = materialName;
        this.description = description;
        this.standard = standard;
        this.manufacturer = manufacturer;
        this.manufacturerAdress = manufacturerAdress;
        this.vendor = vendor;
        this.vendorAdress = vendorAdress;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturerAdress() {
        return manufacturerAdress;
    }

    public void setManufacturerAdress(String manufacturerAdress) {
        this.manufacturerAdress = manufacturerAdress;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getVendorAdress() {
        return vendorAdress;
    }

    public void setVendorAdress(String vendorAdress) {
        this.vendorAdress = vendorAdress;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "MaterialNonMetal{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", materialName='" + materialName + '\'' +
                ", description='" + description + '\'' +
                ", standard='" + standard + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", manufacturerAdress='" + manufacturerAdress + '\'' +
                ", vendor='" + vendor + '\'' +
                ", vendorAdress='" + vendorAdress + '\'' +
                ", weight=" + weight +
                '}';
    }
}
