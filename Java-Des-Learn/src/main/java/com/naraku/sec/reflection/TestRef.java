package com.naraku.sec.reflection;

public class TestRef {
    public void ref(String name) throws Exception {
        Class.forName(name);
    }

    public static void main(String[] args) throws Exception {
        String className = "com.naraku.sec.reflection.TestCalc";

        TestRef testRef = new TestRef();
        testRef.ref(className);
    }
}
