public class Rec extends FormeGeometrique {
	
	private double longueur;
	private double largeur;
	
	
	double perimetre() {
		return 2*(largeur + longueur);
	}
	
	double surface() {
		return (longueur * largeur);
	}
	
	
	public Rec(double largeur,double longueur,double x, double y) {
		super(x,y);
		this.longueur = longueur;
		this.largeur = largeur;
		this.x = x;
		this.y =y;
		
	}
	
	public double getLargeur() {
		return this.largeur;
	}
	
	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}
	
	public double getLongueur() {
		return this.longueur;
	}
	
	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}
	
	public static void main(String[] args) {
		

	}

}
