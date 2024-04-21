package salaire;

class Representant extends Commercial {
	private final static int POURCENTAGE = 30 ; 
	private final static int BONUS = 500 ; 

	public Representant(String prenom, String nom, int age, int date, double chiffreAffaire) {
		super(prenom, nom, age, date, chiffreAffaire);
	}

	int getPourcentage() {
		return POURCENTAGE;
	}

	int getBonus() {
		return BONUS;
	}	
}