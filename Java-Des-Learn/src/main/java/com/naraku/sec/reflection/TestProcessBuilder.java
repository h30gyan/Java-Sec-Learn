package com.naraku.sec.reflection;

public class TestProcessBuilder {
    public static void main(String[] args) throws Exception {
        Class clazz = Class.forName("java.lang.ProcessBuilder");
        clazz.getMethod("start").invoke(clazz.getConstructor(String[].class).newInstance(new String[][]{{"open", "/System/Applications/Calculator.app"}}));
    }
}
