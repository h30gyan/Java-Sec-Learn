package com.naraku.sec.bytecode;

import java.net.URL;
import java.net.URLClassLoader;

public class HelloClassLoader {
    public static void main(String[] args) throws Exception {
        URL[] urls = { new URL("http://localhost:9999/") };
        URLClassLoader loader = URLClassLoader.newInstance(urls);
        Class clazz = loader.loadClass("Hello");
        clazz.newInstance();
    }
}
