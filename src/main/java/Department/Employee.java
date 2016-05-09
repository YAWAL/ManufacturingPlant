package Department;

/**
 * Created by VYA on 07.05.2016.
 */
public class Employee {

    private String name;

    private String lastName;

    private String midlName;

    private String dateOfBirdth;

    private String adress;

    private String type; // Enginner or worker

    private String worklocation;

    private double salary;

    private String startDate;

    public Employee(String name, String lastName, String midlName, String dateOfBirdth,
                    String adress, String type, String worklocation, double salary, String startDate) {
        this.name = name;
        this.lastName = lastName;
        this.midlName = midlName;
        this.dateOfBirdth = dateOfBirdth;
        this.adress = adress;
        this.type = type;
        this.worklocation = worklocation;
        this.salary = salary;
        this.startDate = startDate;
    }
}
