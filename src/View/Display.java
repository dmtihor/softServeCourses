package View;

import Model.Employee;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Adm on 12/14/2015.
 */
public class Display {
    public static void displayAL(ArrayList arrayList){
        for (Object emp : arrayList) {
            System.out.println(emp);
        }
    }
}
