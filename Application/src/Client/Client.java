package Client;
import java.rmi.Naming;
import Serveur.ICompte;
public class Client {

	public static void main(String[] args) {
		ICompte obj;
		//double solde;
		try
		{
			obj =(ICompte)Naming.lookup("rmi://localhost:1095/HelloServer");
			obj.crediter(2000);
			obj.debiter(1000);
			System.out.println(obj.Lire_Solde());
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
