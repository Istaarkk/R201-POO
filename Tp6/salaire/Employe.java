package salaire;

public abstract class Employe {
	protected String nom;
	protected String prenom;
	protected int age;
	protected int anneeEntreeEntreprise; 

	public Employe(String prenom, String nom, int age, int anneeEntreeEntreprise) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.anneeEntreeEntreprise = anneeEntreeEntreprise;
	}

	public abstract double calculerSalaire();

	public String getNom() {
		return "L'employe " + prenom + " " + nom;
	}
}