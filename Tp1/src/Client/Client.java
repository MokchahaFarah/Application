package Client;
import java.rmi.Naming;
import Serveur.Hello;

public class Client {


	public static void main(String[] args) {
		Hello obj;
		String  message;
		try {
			obj =(Hello)Naming.lookup("rmi://localhost:1099/HelloServer");
			message = obj.sayHello();
			System.out.println(message);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
