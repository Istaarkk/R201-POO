package III_salaries;

public abstract class Salarie {
	private double salaire ; 

	public abstract void verserSalaire ();
	
	protected Salarie(double salaire) {
		this.salaire = salaire;
	}
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
}
