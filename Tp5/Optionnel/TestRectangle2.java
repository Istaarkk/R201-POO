package Optionnel;

public class TestRectangle2 {
	private Rectangle rect;
	
	
	TestRectangle2(Rectangle r){
		rect = r; 
	}
	
	private static boolean testAireSet(Rectangle rect)
	{
		rect.setLongueur (5);
		rect.setLargeur (5);
		System.out.println(rect.getLargeur());
		return (rect.surface()==25) ;
	}

	private static boolean testAireSetGet(Rectangle rect)
	{
		rect.setLongueur (5);
		rect.setLargeur (5);
		System.out.println(rect.getLargeur());
		return ( ( rect.getLongueur() * rect.getLargeur() ) == 25) ;
	}
	
	public static boolean isRectangleValide(Rectangle rect)
	{
		return testAireSet(rect) && testAireSetGet(rect);
	}

	
	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		if (isRectangleValide(rect))
			System.out.println("Le rectangle est valide.\n");
		else
			System.out.println("Le rectangle n'est pas valide");
		
		Carré carre = new Carré();
		if (isRectangleValide(carre))
			System.out.println("Le carré est valide .\n");
		else
			System.out.println("Le carré n'est pas valide ");
	}

}
