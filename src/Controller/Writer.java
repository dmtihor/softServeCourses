package Controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * Created by Adm on 12/14/2015.
 */
public class Writer {
    public static File writeAL(ArrayList a) throws IOException{
        File file1 = new File("D:/Java/workspace/softServeCourses/f1");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file1));
        oos.writeObject(a);
        oos.flush();
        oos.close();
        return file1;
    }
}
