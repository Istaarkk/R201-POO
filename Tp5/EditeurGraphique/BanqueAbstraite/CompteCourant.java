package BanqueAbstraite;

public class CompteCourant extends Compte {
	
	private double seuilDecouvert ; 
	CompteCourant (double s, double sd, Client cl) {
		
		super (s, cl);
		
		
		seuilDecouvert = sd ; 
	}


	public void crediter (double montant) {
		if (montant > 0) {
			if (montant < SEUIL_SECURITE) {
				solde += montant ;

				solde += montant * Banque.getTauxRemuneration();
			}
			else 
				System.out.println ("ATTENTION tentative d�ajout suspecte d�un nouveau montant : compte no " + numero);
		}
	}

	public void debiter (double montant) {
		if (montant > 0 && (solde - montant) > -seuilDecouvert) {
			solde = solde - montant ;
		}
	}
	
		public void afficherInfos() {
		super.afficherInfos();

		System.out.println ("\t seuil d�couvert autoris� = " + seuilDecouvert);	
	}

	public double getSeuilDecouvert() {
		return seuilDecouvert;
	}
	public void setSeuilDecouvert(double seuilDecouvert) {
		this.seuilDecouvert = seuilDecouvert;
	} 
}