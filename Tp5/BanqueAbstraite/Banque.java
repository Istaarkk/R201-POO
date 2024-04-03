//Matthieu Da Cruz
package BanqueAbstraite;

import java.util.ArrayList;
import java.util.Arrays;
 
public class Banque {	

	private static final int NB_MAX_CLIENTS = 100;
	private static final int NB_MAX_COMPTES = 100;

	private static double tauxRemuneration = 0.01 ; 
	

	private String nom ; 
	private int nbClients ; 
	private Client [] clients ; 

	private ArrayList<Compte> comptes ; 
	
	Banque (String nom) {
		this.nom = nom ; 
		clients = new Client [NB_MAX_CLIENTS];
		comptes = new ArrayList<Compte>();		
	}

	
	void ajouterCompte (Compte c) {
			comptes.add(c);
	}

	void ajouterClient (Client c) {
		if (nbClients < NB_MAX_CLIENTS) {
			clients [nbClients] = c ; 
			nbClients ++ ; 
		}
	}
	


	void afficherInfosComptes () {
		System.out.println ();
		System.out.println ("COMPTES DE LA BANQUE "+ nom);

		
		for (Compte c : comptes) {			
			c.afficherInfos (); 		
		}
	}
	
	void afficherInfosComptesClient (String nomClient) {
		System.out.println ("Client : " + nomClient);
		
		for (Compte c : comptes) {			
			if (c == null)
				return ; 
			if (	c.getProprietaire() != null && 
					(c.getProprietaire().getNom()).equals(nomClient))	
	
				c.afficherInfos();
		}
	}
	
	void afficherInfosClientCompteNumero (int numeroCompte) {
		System.out.println ();
		System.out.println ("COMPTE "+ numeroCompte);

		for (Compte c : comptes) {			
			if (c == null)
				return ; 		
			if (c.getNumero() == numeroCompte) 
				if (c.getProprietaire() != null)
					c.getProprietaire().afficherInformations();
		}
	}
	
	public static void main (String args []) {
		System.out.println ("Nombre de comptes actuels : " 
				+ CompteCourant.getCptComptes());	
 
		Client cMartin = new Client ("Martin");
		Client cDupont = new Client ("Dupont");
		Client cSmith = new Client ("Smith");

		Compte c1 = new CompteCourant (0, 0, cMartin);
		Compte c2 = new CompteCourant (1000, 0, cMartin);
		Compte c3 = new CompteCourant (0, 500, cDupont);
		Compte c4 = new CompteCourant (0, 1500, cSmith);

		
		Banque lbp = new Banque ("La Banque Postale"); 
		lbp.ajouterClient(cMartin);
		lbp.ajouterCompte(c1);
		lbp.ajouterCompte(c2);
		lbp.ajouterClient(cSmith);
		lbp.ajouterCompte(c4);
		c1.setSaBanque(lbp);
		c2.setSaBanque(lbp);
		c4.setSaBanque(lbp);
		lbp.afficherInfosComptes ();
		
		Banque cl = new Banque ("Cr�dit Lyonnais"); 
		cl.ajouterClient(cDupont);
		cl.ajouterCompte(c3);
		c3.setSaBanque(cl);
		cl.afficherInfosComptes ();
		
		System.out.println ("AFFICHAGE DES INFOS SUR LES COMPTES DE CERTAINS CLIENTS");
		lbp.afficherInfosComptesClient ("Martin");
		cl.afficherInfosComptesClient("Dupont");
		
	
		System.out.println ("AFFICHAGE DU PROPRIETAIRE D'UN COMPTE A PARTIR DU NO DE COMPTE");	
		cl.afficherInfosClientCompteNumero (3);
		
		
		System.out.println ("Nombre de comptes actuels : " 
				+ CompteCourant.getCptComptes());
		

		c1.afficherInfos();
		c1.crediter(100);
		c1.afficherInfos();
		Banque.setTauxRemuneration(0.02);
		c1.crediter(100);
		c1.afficherInfos();
		
		System.out.println ("Question 16 : comptes �pargne");
		CompteEpargne ce = new CompteEpargne(0, 0.03, cSmith);
		lbp.ajouterCompte(ce);
		ce.crediter(100);
		ce.afficherInfos();
		
		
		System.out.println ("Question 17 : toString");
		System.out.println (cSmith);  
		System.out.println (lbp);  
		
	}
	
	//--------------------------
	public String toString() {
		String s = "Banque [nom=" + nom + 
				", nbClients=" + nbClients + "\n";
		for (int i = 0; i < nbClients ; i++) 
			s += "\t" + clients[i] + "\n";
		return s ; 
	}

	
	public static double getTauxRemuneration() {
		return tauxRemuneration;
	}

	public static void setTauxRemuneration(double tauxRemuneration) {
		Banque.tauxRemuneration = tauxRemuneration;
	}
}