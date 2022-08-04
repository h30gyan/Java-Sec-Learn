package com.naraku.sec.serialize;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        InvocationHandler handler = new ExampleInvocationHandler(new HashMap());
        Map proxyMap = (Map) Proxy.newProxyInstance(
                Map.class.getClassLoader(),
                new Class[] {Map.class},
                handler
        );
        proxyMap.put("hello", "world");

        String res = (String) proxyMap.get("hello");
        System.out.println(res);

    }
}
