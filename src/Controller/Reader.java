package Controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 * Created by Adm on 12/14/2015.
 */
public class Reader {
    public static ArrayList readAL(File f) throws IOException, ClassNotFoundException{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
        ArrayList newAL = (ArrayList) ois.readObject();
        return newAL;
    }
}