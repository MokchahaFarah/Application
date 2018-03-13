package Serveur;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import Metier.CompteMetier;
import Models.Compte;
public class Server {
	private static final String LocateRegestry = null;


	public static void main(String[] args) {
		
		try {
			
			LocateRegistry.createRegistry(1099); 
			CompteMetier c =new CompteMetier();
			Compte cp =new Compte(1,"courant",100);
			//ComteImp obj =new ComteImp();
			c.ajouter(cp);
			Naming.rebind("rmi://localhost:1099/gestionBanque", c);
			System.out.println(c.toString());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
