package com.naraku.sec.bytecode;

import java.lang.reflect.Method;

public class HelloDefineClass {
    public static void main(String[] args) throws Exception {
        Method defineClass = ClassLoader.class.getDeclaredMethod("defineClass", byte[].class, int.class, int.class);
        defineClass.setAccessible(true);

        byte[] code = LoaderClass.load("src/main/java/Hello.class");

        Class hello = (Class) defineClass.invoke(ClassLoader.getSystemClassLoader(), code, 0, code.length);
        hello.newInstance();
    }
}