package Metier;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.mysql.jdbc.PreparedStatement;
import Models.Compte;
import Serveur.ICompteMetier;

public class CompteMetier extends UnicastRemoteObject implements ICompteMetier {

	private Connection con=null;
	private java.sql.PreparedStatement st=null;
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
		try {
		st=con.prepareStatement("insert into Compte (NumCp,TypeCp,Solde) value (?,?,?)");
		st.setInt(1, c.getNumCP());
		st.setString(2, c.getTypeCp());
		st.setInt(3, c.getSolde());
		st.executeUpdate();
		}catch(SQLException e) 
		{
			System.out.println(e.getMessage());
		}
		
	}

	@Override
	public void RechercheparNumC(int code) throws RemoteException {
		Compte c=null;
		try
		{
			st=con.prepareStatement("Select * From Compte Where NumCp=?");
			st.setInt(1, code);
			rs=st.executeQuery();
			if(rs.next())
			{
				c=new Compte();
				c.setNumCP(rs.getInt("NumCp"));
				c.setTypeCp(rs.getString("TypeCp"));
				c.setSolde(rs.getInt("Solde"));
			}
				}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
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
