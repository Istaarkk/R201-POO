package volailler;

public class Poulet extends Volaille {
	public static double prixaukilo = 3.5;
	public static double poidsrequis = 3.0;
	
	Poulet(double poids, int age) {
		super(poids, age);
	}


	boolean abbatage() {
		return poids >= poidsrequis; 
	}
	
	
	double getprix() {
		return poids * prixaukilo;
	} 

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
