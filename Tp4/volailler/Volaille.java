package volailler;

public class Volaille {
	double poids;
	int identifiant;
	int age = 2;
	double prixaukilo = 0.0;
	
	Volaille(double poids,int age){
		this.poids=poids;
		this.age =age;
	}
	
	double getprix() {
		return 0;
	}
	
	
	void poids(double newpoids) {
		poids = newpoids;
		
	}
	
	
	public static void main(String[] args) {
	

	}

	boolean assezgrosse() {
		return false ;
	}
}
