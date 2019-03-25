package de.mogwailabs.BSidesRMIService;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IBSidesService extends Remote {

   boolean register(String ticketID) throws RemoteException;
   void visitTalk(String takname) throws RemoteException;
   void poke(Object attende) throws RemoteException;
}
