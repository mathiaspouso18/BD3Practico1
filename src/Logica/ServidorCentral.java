package Logica;

import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class ServidorCentral {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        try {
            LocateRegistry.createRegistry(8080);

        } catch (RemoteException e){
            e.printStackTrace();
        }
    }
}
