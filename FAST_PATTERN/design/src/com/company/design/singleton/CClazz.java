package com.company.design.singleton;

public class CClazz {

    public SocketClient socketClient;

    public CClazz() {
//        this.socketClient = SocketClient.getInstance();
        this.socketClient = new SocketClient();
    }

    public SocketClient getSocketClient() {
        return this.socketClient;
    }

}
