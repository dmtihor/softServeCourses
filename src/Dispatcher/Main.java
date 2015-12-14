package Dispatcher;

import Controller.Reader;
import Controller.Sorting;
import Controller.Writer;
import Model.Employee;
import Model.EmployeeFix;
import Model.EmployeeHw;
import View.Display;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Adm on 12/14/2015.
 */
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Employee> ar = new ArrayList();
        ar.add(new EmployeeFix(1, "Valera", 3100));
        ar.add(new EmployeeFix(2, "Ivan", 3200));
        ar.add(new EmployeeFix(3, "Slavko", 6400));
        ar.add(new EmployeeFix(4, "Sergiy", 2000));
        ar.add(new EmployeeFix(5, "Andriy", 7200));
        ar.add(new EmployeeHw(6, "Petro", 30));
        ar.add(new EmployeeHw(7, "Evgeniy", 32));
        ar.add(new EmployeeHw(8, "Anna", 37));
        ar.add(new EmployeeHw(9, "Vasya", 31));
        ar.add(new EmployeeHw(10, "Ihor", 30));
        for (Employee emp : ar) {
            emp.salary = emp.calcSalary();
            System.out.println(emp);
        }
        Sorting.sorting(ar);
        Display.displayAL(ar);
        Writer.writeAL(ar);
        Reader.readAL(Writer.writeAL(ar));
    }
}
