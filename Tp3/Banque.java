package banque;

public class Banque {

	final static int NB_MAX_COMPTES = 1000 ; 
	final static int NB_MAX_CLIENTS = 1000 ; 
	private String nom;
	private CompteCourant[] sesComptesCourants;
	private int nbComptes ;
	private Client[] sesClients;
	private int nbClients ;

	public Banque(String nom) {
		sesComptesCourants = new CompteCourant[NB_MAX_COMPTES];
		sesClients = new Client[NB_MAX_CLIENTS];
	}
	
	public void ajouterClient(Client client) {
		sesClients[nbClients] = client;
		++nbClients;
		client.setSaBanque(this);
	}
	

	public void ajouterCompte(CompteCourant compte) {
		sesComptesCourants[nbComptes] = compte ;
		nbComptes++ ;

		compte.setSaBanque(this);
	}
	
	
	
	 public static void main(String[] args) {
		 
		Client Petit = new Client (1, "Petit", "Carcassone");
		Client Durand = new Client (2, "Durand", "Lion");
		 
		CompteCourant CptPetit = new CompteCourant(2,100,300);
		CompteCourant CptPetit2 = new CompteCourant(4,600,900);
		CompteCourant CptDurand = new CompteCourant(2,100,300);
		
		
		Petit.ajoutercompte(CptPetit);
		Petit.ajoutercompte(CptPetit2);
		Durand.ajoutercompte(CptDurand);
		
		System.out.println(CptPetit.getSolde());
		System.out.println(CptPetit2.getSolde());
		
		
		Banque B1 = new Banque("Crédit Mutuel");
		B1.ajouterClient(Durand);
		B1.ajouterClient(Petit);
		
		B1.ajouterCompte(CptDurand);
		B1.ajouterCompte(CptPetit);
		B1.ajouterCompte(CptPetit2);
		
		// Q5 : Dans le main() de la classe Banque, essayez de modifier le solde de ces comptes en accédant directement à leurs attributs. 
				// CptDurand.solde = 2000 ;
				//CptPetit.solde = 1000;
				// Est-ce possible ? non ça ne l'est pas 
				// Est-ce une erreur de compilation ou d’exécution ?  c'est une erreur de compilation
				// Quel est le message d’erreur ? " is not visible"
	 
	 //Q8
		for(CompteCourant Compte : sesComptesCourants) {
			if (Compte != null) {
				System.out.println(Compte.afficher());
			}
			
		}
		
		void afficherComptesClientNom (String nomClient) {
			for (int i = 0 ; i < nbClients ; i++ )
				
				if (sesClients[i].getNom().equals(nomClient))

					sesClients[i].afficher();
		
	 }
	 
	 
	 /*public String toString () {
		  String s =  ;
		  s = s + attribut ;
		  …
		  return s ;
		}*/
}