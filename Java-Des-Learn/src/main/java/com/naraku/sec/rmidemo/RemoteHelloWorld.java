package com.naraku.sec.rmidemo;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RemoteHelloWorld extends UnicastRemoteObject implements IRemoteHelloWorld {

    protected RemoteHelloWorld() throws RemoteException {
        super();
        System.out.println("RemoteHelloWorld构造方法");
    }

    @Override
    public String hello() throws RemoteException {
        System.out.println("Callback");
        return "Hello";
    }
}
