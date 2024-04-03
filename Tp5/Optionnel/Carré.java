package Optionnel;

public class Carré extends Rectangle {
	//Longueur sera le seul côté
	
	double surface() {
		return longueur * longueur;	
	}
	
	double getLongueur() {
		return longueur;
	}
	
	void setLongueur(double longueur) {
		this.longueur = longueur;
		this.largeur = longueur;
	}
	
}
