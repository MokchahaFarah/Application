package Models;
import java.io.Serializable;
public class Compte implements Serializable {
	
	private int numCP;
	private String TypeCp;
	private int solde;
	
	public Compte() {
		super();
	}
	public Compte(int numCP, String typeCp, int solde) {
		super();
		this.numCP = numCP;
		TypeCp = typeCp;
		this.solde = solde;
	}
	public int getNumCP() {
		return numCP;
	}
	public void setNumCP(int numCP) {
		this.numCP = numCP;
	}
	public String getTypeCp() {
		return TypeCp;
	}
	public void setTypeCp(String typeCp) {
		TypeCp = typeCp;
	}
	public int getSolde() {
		return solde;
	}
	public void setSolde(int solde) {
		this.solde = solde;
	}

	

}
