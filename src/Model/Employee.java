package Model;


import java.io.Serializable;

/**
 * Created by Adm on 12/14/2015.
 */
public abstract class Employee implements Comparable<Employee>, Serializable {
    private String name;
    private int id;
    public double salary;


    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id + " " +
                "name='" + name + '\'' +
                "salary='" + salary + '\'' +
                '}';
    }

    public int compareTo(Employee e) {
        if (this.salary == e.salary) {
            return this.name.compareTo(e.name);

        } else return (int) (e.salary - this.salary);
    }

    public abstract double calcSalary();
}
