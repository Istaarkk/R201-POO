package banqueHeritee ; 

public class CompteCourant extends Compte {
	
	//--------------------------
	// ATTRIBUTS
	//--------------------------
	private double seuilDecouvert ; // Nombre positif
	
	//--------------------------
	// CONSTRUCTEUR
	//--------------------------
	// D�finir un constructeur public CompteCourant  
	// avec param�tres (un des param�tres aura le m�me nom qu�un des attributs)
	CompteCourant (double s, double sd, Client cl) {
		
		// Appeler le constructeur de la classe m�re : Compte
		super (s, cl);
		
		// Initialiser les attributs d�clar�s au niveau de cette sous-classe
		seuilDecouvert = sd ; 
	}

	//--------------------------
	// METHODES
	//--------------------------
	// QUESTION 4 : Ajouter un test dans la m�thode cr�diter : 
	// si on essaye d�ajouter un montant qui est sup�rieur 
	// � une constante static final SEUIL_SECURITE 
	// (que vous fixerez � 10000), 
	// afficher un message � ATTENTION tentative d�ajout suspecte d�un nouveau montant : compte no � � et ne modifiez alors pas le solde. 
	// Ce test doit aussi �tre fait lors de l�initialisation d�un compte.
	public void crediter (double montant) {
		if (montant > 0) {
			if (montant < SEUIL_SECURITE) {
				solde += montant ;
				
				// QUESTION 15
				solde += montant * Banque.getTauxRemuneration();
			}
			else 
				System.out.println ("ATTENTION tentative d�ajout suspecte d�un nouveau montant : compte no " + numero);
		}
	}

	//m�thode d�biter qui v�rifie que le solde 
	// (- le montant) est sup�rieur 
	// au seuil de d�couvert autoris� avant de d�biter
	public void debiter (double montant) {
		if (montant > 0 && (solde - montant) > -seuilDecouvert) {
			solde = solde - montant ;
		}
	}
	
	// QUESTION 11 : affiche les informations sur chaque compte.
	public void afficherInfos() {
		// On appelle la m�thode de m�me nom dans la classe Mere : Compte
		// pour afficher les attributs qui y sont d�clar�s
		super.afficherInfos();

		// Ajouter l'affichage des attributs sp�cifiques � cette sous classe
		System.out.println ("\t seuil d�couvert autoris� = " + seuilDecouvert);	
	}
	
	//--------------------------
	// ACCESSEURS
	//--------------------------
	public double getSeuilDecouvert() {
		return seuilDecouvert;
	}
	public void setSeuilDecouvert(double seuilDecouvert) {
		this.seuilDecouvert = seuilDecouvert;
	} 
}
