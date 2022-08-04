package com.naraku.sec.rmidemo;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IRemoteHelloWorld extends Remote {
    public String hello() throws RemoteException;
}
