package com.naraku.sec.reflection;

import java.lang.reflect.Constructor;

public class TestDeclared {
    public static void main(String[] args) throws Exception {
        Class clazz = Class.forName("java.lang.Runtime");
        Constructor cs = clazz.getDeclaredConstructor();
        cs.setAccessible(true);

        clazz.getMethod("exec", String.class).invoke(cs.newInstance(), "open /System/Applications/Calculator.app");
    }
}
