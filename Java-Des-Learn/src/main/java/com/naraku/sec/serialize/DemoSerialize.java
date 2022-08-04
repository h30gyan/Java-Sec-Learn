package com.naraku.sec.serialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DemoSerialize {
    public static void main(String[] args) throws Exception {
        String serfile = "person.ser";
        Person person = new Person("Naraku", 20);

        // Serialize
        FileOutputStream fos = new FileOutputStream(serfile);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(person);
        fos.close();

        // DeSerialize
        FileInputStream fis = new FileInputStream(serfile);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object res = ois.readObject();
        System.out.println(res);
        ois.close();
    }
}
