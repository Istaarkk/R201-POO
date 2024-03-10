package banque;

public class CompteCourant {
	static final int SEUIL_SECURITE = 1000;
	Banque saBanque;
	private int numcompte;
	private double seuil;
	private double solde;
	private Client proprietaire;
	
	
	public CompteCourant(int numcompte,int seuil,int solde){
		this.numcompte = numcompte;
		this.seuil = seuil;
		this.solde = solde;
	}

	public void crediter(double montant) {
		solde +=montant; 
	}

	public void debiter(double montant) {
		if(solde-montant >- seuil) {
			solde = solde-montant;
		}
	}
	
	public Banque getSaBanque() {
		return saBanque;
	}

	public void setSaBanque(Banque saBanque) {
		this.saBanque = saBanque;
	}

	public int getNumcompte() {
		return numcompte;
	}

	public void setNumcompte(int numcompte) {
		this.numcompte = numcompte;
	}

	public double getSeuil() {
		return seuil;
	}

	public void setSeuil(double seuil) {
		this.seuil = seuil;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double nouveausolde) {
		if(nouveausolde>SEUIL_SECURITE) {
			System.out.println("ATTENTION  tentative d’affectation suspecte d’un nouveau solde : compte no …");
		}
		else {
			solde = nouveausolde; 
		}
		
	}

	public static int getSeuilSecurite() {
		return SEUIL_SECURITE;
	}
	
	public Client getProprietaire() {
		return proprietaire;
	}
	
	public void setProprietaire(Client proprietaire) {
		this.proprietaire = proprietaire;
	}
	
	void afficher () {
		System.out.println ("no = " +  numcompte + 
							"solde = " + solde);

	}
}