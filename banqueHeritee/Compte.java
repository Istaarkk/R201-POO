package banqueHeritee;

public class Compte {
	//--------------------------
	// CONSTANTES STATIC
	//--------------------------
	protected static final double SEUIL_SECURITE = 10000;

	//--------------------------
	// ATTRIBUTS STATIC
	//--------------------------
	protected static int cptComptes = 0 ; 

	//--------------------------
	// ATTRIBUTS
	//--------------------------
	protected int numero ; 
	protected double solde ; 
	protected Client proprietaire ; 
	protected Banque saBanque ;

	//--------------------------
	// CONSTRUCTEUR
	//--------------------------
	public Compte(double solde, Client proprietaire) {
		
		this.proprietaire = proprietaire;

		// M�moriser qu'on vient de cr�er un compte en plus (QUESTION 14)
		cptComptes ++ ;

		// Affecter automatiquement un num�ro � ce compte  (QUESTION 14)
		// (les num�ros de compte commencent � 1)
		// (on ne pourra plus avoir de comptes de deux banques 
		// diff�rentes qui ont le m�me num�ro)
		numero = cptComptes ; 

		// Ce test doit aussi �tre fait lors de l�initialisation d�un compte.
		if (solde > 0)
			if (solde < SEUIL_SECURITE)
				this.solde = solde ;
			else 
				System.out.println ("ATTENTION tentative d'affectation suspecte d�un solde au compte no " + numero);	
	} 

	//--------------------------
	// METHODES
	//--------------------------
	public void afficherInfos() {
		System.out.println ("Compte " + numero + " : ");
		System.out.println ("\t solde = " + solde);
		
		if (proprietaire != null)
			System.out.println ("\t Proprietaire : " + proprietaire.getNom());
	}
	
	// On n'a pas encore vu les classes abstraites 
	// donc on est oblig� de mettre une impl�mentation dans ces 2 m�thodes
	// Pour rassurer le compilateur ...
	public void crediter (double montant) {
		System.out.println ("on ne passera jamais par ici !");
	};
	
	public void debiter (double montant) {
	};

	//--------------------------
	// ACCESSEURS
	//--------------------------	
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
