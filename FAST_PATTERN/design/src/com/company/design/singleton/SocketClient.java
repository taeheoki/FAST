package com.company.design.singleton;

public class SocketClient {
    private static SocketClient socketClient = null;

    // default 생성자 막기
//    private SocketClient() {}
    public SocketClient() {}

    public static SocketClient getInstance() {
        if (socketClient == null) {
            socketClient = new SocketClient();
        }
        return socketClient;
    }

    public void connect() {
        System.out.println("connect");
    }
}
