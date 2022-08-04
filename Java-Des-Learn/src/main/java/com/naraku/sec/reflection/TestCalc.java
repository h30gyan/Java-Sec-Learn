package com.naraku.sec.reflection;

public class TestCalc {
    static {
        try {
            Runtime rt = Runtime.getRuntime();
            String[] commands = {"open", "/System/Applications/Calculator.app"};
            Process pc = rt.exec(commands);
            pc.waitFor();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
