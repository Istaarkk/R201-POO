public class Table {

	static final String NOIR = "Noir";
    int nbPieds;
    String couleur;
    float prix;

    // Constructeur par défaut
    public Table() {
    	
    }

    // Constructeur avec un paramètre pour le nombre de pieds
    public Table(int nbPieds) {
        this.nbPieds = nbPieds;
        this.couleur = "Blanc"; // Valeur par défaut pour la couleur
        this.prix = 0.0f; // Valeur par défaut pour le prix
    }

    public Table(int nbPieds,String couleur) {
        this.nbPieds = nbPieds;
        this.couleur = couleur;
        this.prix = 0.0f; // Valeur par défaut pour le prix
    }

    public Table(int nbPieds,String couleur,float prix) {
        this.nbPieds = nbPieds;
        this.couleur = couleur;
        this.prix = prix; 
    }
    
    
    public static void main(String args[]) {
        // Utilisation du constructeur par défaut
        Table t = new Table();
        System.out.println(t.nbPieds);
        System.out.println(t.couleur);
        System.out.println(t.prix);
        System.out.println();
        
        Table t2 = new Table (3);
    	System.out.println (t2.nbPieds);
    	System.out.println (t2.couleur);
    	System.out.println (t2.prix);
    	System.out.println ();
    	
    	Table t3 = new Table(6,Table.NOIR);
        System.out.println(t3.nbPieds);
        System.out.println(t3.couleur);
        System.out.println(t3.prix);
        System.out.println();
    	
        Table t4;
        t4 = new Table();
        t4 = t3;
        System.out.println(t4.nbPieds);
        System.out.println(t4.couleur);
        System.out.println(t4.prix);
        System.out.println();
        
        //Affecter le prix de cette table à 80  en passant par la référence t3.
        t3.prix = 80;
        
        //Afficher le nouveau prix via la référence t4.
        System.out.println(t4.nbPieds);
        System.out.println(t4.couleur);
        System.out.println(t4.prix);
        System.out.println();
        
        Table [] tables;
        tables = new Table[4];
        
        tables [0] = t;
        tables [1] = t2;
        tables [2] = t3;
        tables [3] = t4;
        
        for (Table tab :tables ) {
        	if(tab!=null) {
        	System.out.println(tab.prix);
        	}        	
        }
	}   	 
  }
