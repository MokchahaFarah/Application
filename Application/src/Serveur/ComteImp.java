package Serveur;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
public class ComteImp extends UnicastRemoteObject implements ICompte{
	double solde=0;
	public  ComteImp() throws RemoteException{super();}
	public ComteImp(double solde) throws RemoteException{this.solde=solde;}
	public void debiter(double montant) {this.solde=this.solde-montant;};
	public void crediter(double montant) {this.solde=this.solde+montant;};
	public double Lire_Solde() {return this.solde;};
}
