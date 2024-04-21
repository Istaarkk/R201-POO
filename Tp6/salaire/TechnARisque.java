package salaire;

class TechnARisque extends Technicien implements SalarieARisque {

	public TechnARisque(String prenom, String nom, int age, int date, int unites) {
		super(prenom, nom, age, date, unites);
	}

	public double calculerSalaire() {
		return super.calculerSalaire() + PRIME_RISQUE;
	}
}