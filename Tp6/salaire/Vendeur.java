package salaire;

public class Vendeur extends Commercial {
	private final static int POURCENTAGE = 20 ; 
	private final static int BONUS = 200 ; 

	public Vendeur(String prenom, String nom, int age, int date, double chiffreAffaire) {
		super(prenom, nom, age, date, chiffreAffaire);
	}

	int getBonus() {
		return BONUS;
	}	
	
	int getPourcentage() {
		return POURCENTAGE;
	}


}