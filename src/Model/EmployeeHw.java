package Model;

/**
 * Created by Adm on 12/14/2015.
 */
public class EmployeeHw extends Employee {
    int hourlyRate;

    public EmployeeHw(int id, String name, int hourlyRate) {
        super(id, name);
        this.hourlyRate = hourlyRate;
    }

    public double calcSalary() {
        return hourlyRate * 20.8 * 8;
    }
}
