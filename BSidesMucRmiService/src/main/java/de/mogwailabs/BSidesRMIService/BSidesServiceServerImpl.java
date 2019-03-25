package de.mogwailabs.BSidesRMIService;

import java.rmi.RemoteException;
import java.rmi.server.RemoteObject;
import java.rmi.server.UnicastRemoteObject;

public class BSidesServiceServerImpl extends UnicastRemoteObject  implements IBSidesService  {

	public BSidesServiceServerImpl() throws RemoteException {}
	
	public boolean register(String ticketID) throws RemoteException {
		// TODO implement authentication here
		System.out.println("register called: " + ticketID);
		return false;
	}

	public void vistTalk(String talkname) throws RemoteException {
		// TODO implement visitTalk here
		System.out.println("visitTalk called: " + talkname);
	}

	public void poke(Object attende) throws RemoteException {
		// TODO: Implement poke here
		System.out.println("poking " + attende.toString());
	}
}
