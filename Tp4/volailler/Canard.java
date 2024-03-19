package volailler;

public class Canard extends Volaille {
	public static final double prixaukilo = 3.5;
	public static final int taxe = 10;
	public static final double poidsabbatage = 3.0;
	
	Canard(double poids, int age) {
		super(poids, age);
		}

	double prix() {
		return poids * prixaukilo;
		
	}	
	
	void newpoids(double newpoids) {
		poids = newpoids; 
	}
	
	boolean abbatage() {
		return poids >= poidsabbatage; 
		
	}
	public static void main(String[] args) {

	}

}
