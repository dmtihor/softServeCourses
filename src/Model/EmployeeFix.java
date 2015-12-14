package Model;

/**
 * Created by Adm on 12/14/2015.
 */
public class EmployeeFix extends Employee {
    int fixedMonthlyPayment;

    public EmployeeFix(int id, String name, int fixedMonthlyPayment) {
        super(id, name);
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    public double calcSalary() {
        return fixedMonthlyPayment;
    }
}
