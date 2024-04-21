package salaire;

class Technicien extends Employe {
	private static final int FACTEUR = 10 ; 
	private int nbUnites ; 
	
	public Technicien(String prenom, String nom, int age, int anneeEntreeEntreprise, int nbUnites) {
		super(prenom, nom, age, anneeEntreeEntreprise);
		this.nbUnites = nbUnites ;
	}

	public double calculerSalaire() {
		return nbUnites * FACTEUR ;
	}	
}