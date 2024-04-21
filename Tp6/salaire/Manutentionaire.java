package salaire;

class Manutentionaire extends Employe {
	private static final int SALAIRE_HORAIRE = 15 ; 
	private int nbHeures ; 
	
	public Manutentionaire(String prenom, String nom, int age, int anneeEntreeEntreprise, int nbHeures) {
		super(prenom, nom, age, anneeEntreeEntreprise);
		this.nbHeures = nbHeures ;
	}

	public double calculerSalaire() {
		return nbHeures * SALAIRE_HORAIRE ;
	}	
}