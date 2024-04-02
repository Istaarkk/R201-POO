package BanqueAbstraite;

public class CompteEpargne extends Compte {
	
	private double tauxInteret ; 
	
	CompteEpargne (double s, double ti, Client cl) {
		super (s, cl);
		tauxInteret = ti ; 
	}


	public void crediter (double montant) {
		if (montant > 0) {
			if (montant < SEUIL_SECURITE) {
				solde += montant ;
				solde += montant * tauxInteret;
			}
			else 
				System.out.println ("ATTENTION tentative d�ajout suspecte d�un nouveau montant : compte no " + numero);
		}
	}


	public void debiter (double montant) {
		if (montant > 0 && (solde - montant) > 0) {
			solde = solde - montant ;
		}
	}
	
	public void afficherInfos() {
		super.afficherInfos();
		System.out.println ("\t taux interet = " + tauxInteret);		
	}
	

	public double getTauxInteret() {
		return tauxInteret;
	}

	public void setTauxInteret(double tauxInteret) {
		this.tauxInteret = tauxInteret;
	}
}