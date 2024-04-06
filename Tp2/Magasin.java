
public class Magasin {
	//déclaration des constantes
	 static final int NB_MAX = 10; 
	 static final String NOIR ="Noir";
	 
	 Table [] tables;
	 int nbTables;
	 String nom;
	 
	 Magasin(String nom){
		 tables = new Table[NB_MAX];
		 this.nom = nom;
	 }
	
	 void ajouterTable (Table t) {
			if (nbTables < NB_MAX) {
				tables [nbTables] = t ; 
				nbTables ++ ;
			}
		}

	 
	 public static void main(String[] args) {
			// Créer plusieurs magasins
			Magasin M = new Magasin("Bonjour"); 
			Magasin M1 = new Magasin("Bonjour");
			Magasin M2 = new Magasin("Bonjour");
			
			//créer plusieurs Table
			Table t = new Table ();
			System.out.println (t.nbPieds);
			System.out.println (t.couleur);
			System.out.println (t.prix);
			System.out.println ();
			
			Table t2 = new Table (3);
			System.out.println (t2.nbPieds);
			System.out.println (t2.couleur);
			System.out.println (t2.prix);
			System.out.println ();
			
	    	Table t3 = new Table (6,Table.NOIR);
	    	System.out.println (t3.nbPieds);
	    	System.out.println (t3.couleur);
	    	System.out.println (t3.prix);
	    	System.out.println ();

			// Ajouter des tables à chaque magasin
	    	M.ajouterTable(t);
	    	M1.ajouterTable(t2);
	    	
	    	M2.ajouterTable(t3);
}
}