package Serveur;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import Models.Compte;

public interface ICompteMetier extends Remote
{
	public ArrayList<Compte> AfficheListe() ;
	public void ajouter(Compte c)throws RemoteException ;
	public void RechercheparNumC(int code)throws RemoteException ;
	public ArrayList<Compte> AfficheparNumC(int cp) ;
	public void ModifierCompte(Compte c) throws RemoteException ;
	public void ModifierSoldeCompte(int solde,int Compte)throws RemoteException ;
	
}
