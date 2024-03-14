package banque;

public class CompteEpargne {


	private static int nbComptesEpargne = 0 ; 
	
	private Banque saBanque;
	private Client proprietaire;
	private int numero;
	private double solde;
	private double tauxInteret;

	
	public CompteEpargne(double nouveauSolde, double tauxInteret) {
		nbComptesEpargne ++ ; 
		
		numero = nbComptesEpargne; 
		
		this.tauxInteret = tauxInteret;
		setSolde (nouveauSolde); 

	}
	
	void crediter (double montant) {
		solde = solde + montant + montant * Banque.getTauxRemuneration() + montant * tauxInteret;
	}

	
	void debiter (double montant) {
		if (solde - montant > 0)
			solde = solde - montant ; 
	}
	
	void afficher () {
		System.out.println ("no = " +  numero + 
							" solde = " + solde);
	}

	
	public void setSolde(double nouveauSolde) {
			solde = nouveauSolde ; 
	}
	public Banque getSaBanque() {

		return saBanque;
	}
	public void setSaBanque(Banque saBanque) {
		this.saBanque = saBanque;
	}
	public Client getProprietaire() {
		return proprietaire;
	}
	public void setProprietaire(Client proprietaire) {
		this.proprietaire = proprietaire;
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
	public double getTauxInteret() {
		return tauxInteret;
	}

	public void setTauxInteret(double tauxInteret) {
		this.tauxInteret = tauxInteret;
	}

	public static int getNbComptesEpargne() {
		return nbComptesEpargne;
	}
}
