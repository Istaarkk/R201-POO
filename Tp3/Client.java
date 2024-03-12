package banque;

public class Client {

	Banque saBanque;
	private int numclient;
	private String nom;
	private String adresse;
	final static int NB_MAX_COMPTES = 10;
	private CompteCourant [] sesCompteCourants;
	private int nbComptes = 0;
	private int numero;
	private CompteEpargne[] sesComptesEpargne;
	private int nbComptesEpargne ;
	
	
	public Client(int numclient,String nom,String adresse){
		this.numclient = numclient; 
		this.adresse = adresse;
		this.nom= nom; 
		sesCompteCourants = new CompteCourant[NB_MAX_COMPTES];
	}
	
	public void ajoutercompte(CompteCourant compte) {
		sesCompteCourants [nbComptes] = compte;
		++nbComptes;
		compte.setProprietaire(this);
	}
	
	 public static void main(String[] args) {
		 
		 
		 
	 }
	 
	 public void ajouterCompteEpargne(CompteEpargne compte) {
			sesComptesEpargne[nbComptesEpargne] = compte ;
			nbComptesEpargne++ ;
			
			compte.setProprietaire(this);
		}
	 
		public void setSaBanque(Banque banque) {
			this.saBanque = banque ;
		}
		
		public int getNumero() {
			return numero;
		}

		public void setNumero(int numero) {
			this.numero = numero;
		}

		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		public String getAdresse() {
			return adresse;
		}

		public void setAdresse(String adresse) {
			this.adresse = adresse;
		}

		public int getNbComptes() {
			return nbComptes;
		}

		public void afficher() {
			System.out.println ("Client : nom = " + nom );
			
			for (int i = 0 ; i < nbComptes ; i++ )
			
			
				sesCompteCourants[i].afficher ();
		}

		
}