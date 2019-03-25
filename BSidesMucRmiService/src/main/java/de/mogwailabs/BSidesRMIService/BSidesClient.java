package de.mogwailabs.BSidesRMIService;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class BSidesClient {

	public static void main(String[] args) {

		try {
			String serverIP = args[0];
			int serverPort = 1099;
			
			// Lookup the remote object that is registered as "bsides"
			Registry registry = LocateRegistry.getRegistry(serverIP, serverPort);
			IBSidesService bsides = (IBSidesService) registry.lookup("bsides");

			// calling server side methods...
			System.out.println("Calling bsides.register()");
			bsides.register("123456");
			System.out.println("Calling bsides.visitTalk()");
			bsides.vistTalk("Exploiting Java RMI services");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}