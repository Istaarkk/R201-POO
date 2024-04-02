public abstract class FormeGeometrique {
	
	protected double x;
	protected double y;
	
	
	void deplacer(double x2, double y2) {
		x = x2;
		y = y2;
	}
	
	protected FormeGeometrique(double x , double y) {
		this.y = y;
		this.x =x;
	}
	
	void afficher() {
		System.out.println("La valeur de x est : "+x + "la valeur de y est : " +y);
	}
	
	abstract double perimetre();
	
	abstract double surface();
	
	public double getX() {
		return this.x; 
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public double getY() {
		return this.y; 
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	
	
	public static void main(String[] args) {

	}
	

}
