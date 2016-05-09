package Workshop;

/**
 * Created by VYA on 02.04.2016.
 */
public class BaseWorkshop {


    public String name;
    public int employeeQuantity;
    public int equipmentQuantity;
    public String workshopChief;


    public BaseWorkshop(String name, int employeeQuantity, int equipmentQuantity, String workshopChief) {
        this.name = name;
        this.employeeQuantity = employeeQuantity;
        this.equipmentQuantity = equipmentQuantity;
        this.workshopChief = workshopChief;
    }

    //request to HR Department about emloyee (hire or quit)
    private void requestEmployee(){

    }

    //request to Maintenance and Mechanical Department about equipment (buy or remove)
    private void requestEquipment(){

    }



}
