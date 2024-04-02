package III_salaries;

public class Employe extends Salarie {

	public Employe(double salaire) {
		super(salaire);
	}

	public void verserSalaire() {
		System.out.println(
		"Versement de salaire sur compte externe : " 
		+ ", " + getSalaire());
	}
}
