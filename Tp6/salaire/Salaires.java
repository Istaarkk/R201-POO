package salaire;

public class Salaires {
	public static void main(String[] args) {
		Personnel p = new Personnel();
		p.ajouterEmploye(new Vendeur("Essaie", "numéro1", 5, 1895, 3000));
		p.ajouterEmploye(new Representant("Essaie", "numéro2", 50, 2001, 2000));
		p.ajouterEmploye(new Technicien("Essaie", "numéro3", 28, 1208, 1860));
		p.ajouterEmploye(new Manutentionaire("Essaie", "numéro4", 32, 1998, 123));
		p.ajouterEmploye(new TechnARisque("Essaie", "numéro5", 28, 2080, 1050));
		p.ajouterEmploye(new ManutARisque("Essaie", "numéro6", 30, 22501, 405));
		p.afficherSalaires();
		System.out.println("Le salaire moyen est de "
				+ p.salaireMoyen() + " Euros");

		System.out.println ();
		System.out.println ("personnel a risque");
		System.out.println ();
		
		SalarieARisque ear [] = new SalarieARisque[2];
		ear [0] = new TechnARisque ("tech1", "bonjour", 0, 2000, 20);
		ear [1] = new ManutARisque ("Tech2", "try", 0, 2020, 30);
		
		for (SalarieARisque e: ear) {
			System.out.println (e.calculerSalaire());
		}
	}
}