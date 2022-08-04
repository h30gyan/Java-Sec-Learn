package com.naraku.sec.rmidemo;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class DemoClient {
    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
        // 查询 hello 对象
         IRemoteHelloWorld hello = (IRemoteHelloWorld) Naming.lookup("rmi://192.168.111.2:1099/Hello");

        // 调用远程方法
         String ret = hello.hello();
         System.out.println(ret);

        // list方法
//        String[] objs = Naming.list("rmi://192.168.111.2:1099/");
//        for (String obj:objs) {
//            System.out.println(obj);
//        }
    }
}
