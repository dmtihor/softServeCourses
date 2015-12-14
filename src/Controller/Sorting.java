package Controller;

import Model.Employee;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Adm on 12/14/2015.
 */
public class Sorting {
 public static ArrayList<Employee> sorting (ArrayList<Employee> ar){
     Collections.sort(ar);
     for (Employee emp : ar) {
         System.out.println(emp);
     }
     return ar;
 }
}
