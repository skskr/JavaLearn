package serializationlearn;

import java.io.*;
import java.util.ArrayList;
import java.util.Vector;

public class SerializationDemo {
    public static void main(String[] args) throws IOException {
//        File file = new File("D:"+ File.separator + "person.ser");
//        ObjectOutputStream oos = null;
//        oos = new ObjectOutputStream(new FileOutputStream(file));
//
//        Person p = new Person("wang", 21);
//        oos.writeObject(p);
//        oos.close();

        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(100);
        System.out.println(arrayList.size());
        Vector vector = new Vector();
    }
}
