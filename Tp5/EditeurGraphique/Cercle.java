public  class Cercle extends FormeGeometrique{
	
	private double rayon;
	
	public Cercle (double x , double y , double rayon){
		super(x,y);
		this.rayon = rayon;
	}
	
	public double getRayon() {
		return this.rayon;
		
	}
	
	double perimetre() {
		return 2*Math.PI*rayon;
	}
	
	double surface() {
		return Math.PI *Math.pow(rayon, 2);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
