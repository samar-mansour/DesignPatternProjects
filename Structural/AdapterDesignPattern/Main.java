package com.samar;

import com.samar.interfaces.SocketAdapter;
import com.samar.models.SocketAdapterImplementation;
import com.samar.models.SocketObjectAdapterImplemetation;
import com.samar.models.Volt;

public class Main {

    public static void main(String[] args) {
        testingObjectAdapter();
        testingClassAdapter();
    }


    private static void testingObjectAdapter(){
        SocketAdapter socketAdapter = new SocketObjectAdapterImplemetation();
        Volt v3 = getVolt(socketAdapter, 3);
        Volt v12 = getVolt(socketAdapter, 12);
        Volt v120 = getVolt(socketAdapter, 120);

        System.out.println(" V3 volts is using object adapter " + v3.getVolt());
        System.out.println(" V12 volts is using object adapter " + v12.getVolt());
        System.out.println(" V120 volts is using object adapter " + v120.getVolt());
    }

    private static Volt getVolt(SocketAdapter socketAdapter, int i){
        switch (i){
            case 3: return socketAdapter.get3Volts();
            case 12: return socketAdapter.get12Volts();
            default: return socketAdapter.get120Volts();
        }
    }

    private static void testingClassAdapter(){
        SocketAdapter socketAdapter = new SocketAdapterImplementation();
        Volt v3 = socketAdapter.get3Volts();
        Volt v12 = socketAdapter.get12Volts();
        Volt v120 = socketAdapter.get120Volts();

        System.out.println(" V3 volts is using class adapter " + v3.getVolt());
        System.out.println(" V12 volts is using class adapter " + v12.getVolt());
        System.out.println(" V120 volts is using class adapter " + v120.getVolt());
    }
}
