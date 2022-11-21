package com.company.design;

import com.company.design.singleton.AClazz;
import com.company.design.singleton.BClazz;
import com.company.design.singleton.CClazz;
import com.company.design.singleton.SocketClient;

public class Main {
    public static void main(String[] args) {
        AClazz aClazz = new AClazz();
        BClazz bClazz = new BClazz();
        CClazz cClazz = new CClazz();

        SocketClient aClient = aClazz.getSocketClient();
        SocketClient bClient = bClazz.getSocketClient();
        SocketClient cClient = cClazz.getSocketClient();

        System.out.println("두개의 객체가 동일한가?(aClient, bClient)");
        System.out.println(aClient.equals(bClient));

        System.out.println("두개의 객체가 동일한가?(aClient, cClient)");
        System.out.println(aClient.equals(bClient));
    }
}
