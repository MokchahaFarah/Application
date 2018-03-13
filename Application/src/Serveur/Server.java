package Serveur;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import Metier.CompteMetier;
public class Server {
	private static final String LocateRegestry = null;


	public static void main(String[] args) {
		
		try {
			
			LocateRegistry.createRegistry(1099); 
			CompteMetier c =new CompteMetier();
			//ComteImp obj =new ComteImp();
			
			Naming.rebind("rmi://localhost:1099/gestionBanque", c);
			System.out.println(c.toString());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
