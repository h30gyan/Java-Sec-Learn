package com.naraku.sec.reflection;

import java.lang.reflect.Method;

public class TestNewInstance {
    public static void main(String[] args) throws Exception{
        Class clazz = Class.forName("java.lang.Runtime");

        Method execMethod = clazz.getMethod("exec", String.class);
        Method getRuntimeMethod = clazz.getMethod("getRuntime");

        Object runtime = getRuntimeMethod.invoke(clazz);
        execMethod.invoke(runtime,"open /System/Applications/Calculator.app");
    }
}
