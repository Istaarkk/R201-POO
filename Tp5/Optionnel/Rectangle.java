package Optionnel;

public class Rectangle {

	protected double longueur;
	protected double largeur;
	
	
	
	double surface() {
		return longueur * largeur;
		
	}
	
	double getLongueur() {
		return longueur;
	}
	
	void setLongueur(double longueur) {
		this.longueur = longueur;
	}
	
	
	double getLargeur() {
		return largeur;
	}
	
	void setLargeur(double largeur) {
		this.largeur = largeur;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
