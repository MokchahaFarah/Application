package Serveur;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
public class Server {
	private static final String LocateRegestry = null;


	public static void main(String[] args) {
		
		try {
			System.out.println("une autre version");
			LocateRegistry.createRegistry(1095); 
			ComteImp obj =new ComteImp();
			
			Naming.rebind("rmi://localhost:1095/HelloServer", obj);
			System.out.println(obj.toString());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
