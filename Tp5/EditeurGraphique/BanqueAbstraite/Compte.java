package BanqueAbstraite;

public abstract class  Compte {
	protected static final double SEUIL_SECURITE = 10000;

	protected static int cptComptes = 0 ; 

	protected int numero ; 
	protected double solde ; 
	protected Client proprietaire ; 
	protected Banque saBanque ;

	
	public abstract void crediter(double montant);
	public abstract void debiter(double montant);
	
	public Compte(double solde, Client proprietaire) {
		
		this.proprietaire = proprietaire;
		cptComptes ++ ;
		numero = cptComptes ; 


		if (solde > 0)
			if (solde < SEUIL_SECURITE)
				this.solde = solde ;
			else 
				System.out.println ("ATTENTION tentative d'affectation suspecte d�un solde au compte no " + numero);	
	} 

	public void afficherInfos() {
		System.out.println ("Compte " + numero + " : ");
		System.out.println ("\t solde = " + solde);
		
		if (proprietaire != null)
			System.out.println ("\t Proprietaire : " + proprietaire.getNom());
	}
	




	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSolde() {
		return solde;
	}
	
	public Client getProprietaire() {
		return proprietaire;
	}
	public void setProprietaire(Client proprietaire) {
		this.proprietaire = proprietaire;
	}

	public Banque getSaBanque() {
		return saBanque;
	}

	public void setSaBanque(Banque saBanque) {
		this.saBanque = saBanque;
	}
	
	public static int getCptComptes() {
		return cptComptes;
	}


	
}