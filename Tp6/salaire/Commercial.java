package salaire;

public abstract class Commercial extends Employe {
	protected double chiffreAffaire;

	public Commercial(String prenom, String nom, int age, int date,
			double chiffreAffaire) {
		super(prenom, nom, age, date);
		this.chiffreAffaire = chiffreAffaire;
	}

	public double getChiffreAffaire()		{
		return chiffreAffaire;
	}
	

	public double calculerSalaire() {
		return getPourcentage()/100 * chiffreAffaire + getBonus();
	}
	
	
	abstract int getBonus();
	abstract int getPourcentage();
}