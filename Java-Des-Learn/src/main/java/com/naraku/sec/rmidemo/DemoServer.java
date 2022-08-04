package com.naraku.sec.rmidemo;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class DemoServer {
    public static void main(String[] args) throws Exception {
        // 实例化远程对象
        RemoteHelloWorld hello = new RemoteHelloWorld();

        // 实现注册表
        LocateRegistry.createRegistry(1099);

        // 将远程对象注册到注册表里面,绑定地址
        Naming.bind("rmi://192.168.111.1:1099/Hello", hello);
//        Naming.rebind("rmi://127.0.0.1:1099/Hello", hello);

        // 如果Registry在本地, Host和Port可以省略, 默认 localhost:1099
        //  Naming.rebind("Hello", hello);

        System.out.println("Start Server, Port is 1099");
    }
}

