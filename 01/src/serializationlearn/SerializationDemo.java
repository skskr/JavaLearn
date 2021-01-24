package serializationlearn;

import java.io.*;


public class SerializationDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("D:"+ File.separator + "person.ser");
        ObjectOutputStream oos;
        oos = new ObjectOutputStream(new FileOutputStream(file));

        Person p = new Person("Hwang", 21);
        oos.writeObject(p);
        oos.close();
    }
}
