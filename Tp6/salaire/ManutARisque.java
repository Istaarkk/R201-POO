package salaire;

class ManutARisque extends Manutentionaire implements SalarieARisque {
	
	public ManutARisque(String prenom, String nom, int age, int  date, int heures) {
		super(prenom, nom, age, date, heures);
	}

	public double calculerSalaire() {
		return super.calculerSalaire() + PRIME_RISQUE;
	}
}
