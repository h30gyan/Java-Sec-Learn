package com.naraku.sec.serialize;
import java.io.*;

public class Person implements Serializable {
    public String name;
    public int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private void writeObject(ObjectOutputStream oos) throws IOException {
        System.out.println("Call writeObject");
        oos.defaultWriteObject();
        oos.writeObject("This is a Person");
    }

    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        System.out.println("Call readObject");
        ois.defaultReadObject();
        String message = (String) ois.readObject();
        System.out.println(message);
    }
}
