package Metier;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import com.mysql.jdbc.PreparedStatement;
import Models.Compte;
import Serveur.ICompteMetier;

public class CompteMetier extends UnicastRemoteObject implements ICompteMetier {

	private Connection con=null;
	private PreparedStatement st=null;
	private ResultSet rs=null; 
	public CompteMetier() throws RemoteException {
		super();
		con=SingletonConnection.getConnection();
	}

	@Override
	public ArrayList<Compte> AfficheListe() throws RemoteException{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ajouter(Compte c) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RechercheparNumC(int code) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Compte> AfficheparNumC(int cp) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ModifierCompte(Compte c) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ModifierSoldeCompte(int solde, int Compte) throws RemoteException {
		// TODO Auto-generated method stub
		
	}



}
