public class Stock {
    public static final int NB_ARTICLES = 3;

    public static void main(String[] args) {
        //---------------------------------------
        // Déclarer les constantes
        //---------------------------------------
        // ...

        //---------------------------------------
        // Déclarer les tableaux
        //---------------------------------------
        char[] codesArticles = new char[NB_ARTICLES];
        double[] prixArticles = new double[NB_ARTICLES];

        //---------------------------------------
        // Allouer les tableaux avec une taille max définie en constante
        //---------------------------------------
        // ...

        //---------------------------------------
        // Mettre des valeurs dans les cases
        //---------------------------------------
        // ...

        //---------------------------------------
        // Parcours des deux tableaux avec deux boucles foreach
        //---------------------------------------
        for (char code : codesArticles) {
            System.out.print(code + "\t");
        }
        System.out.println();
        for (double prix : prixArticles) {
            System.out.print(prix + "\t");
        }
        System.out.println();

        //---------------------------------------
        // Parcours des deux tableaux en parallèle avec une boucle while et un booleen
        //---------------------------------------
        int index = 0;
        boolean parcoursEnCours = true;
        while (parcoursEnCours) {
            System.out.println(codesArticles[index] + " - " + prixArticles[index] + " Euros");
            ++index;
            parcoursEnCours = index < NB_ARTICLES;
        }

        //---------------------------------------
        // Parcours des deux tableaux en parallèle avec une boucle for “classique”
        //---------------------------------------
        for (int i = 0; i < NB_ARTICLES; i++) {
            System.out.println(codesArticles[i] + " - " + prixArticles[i] + " Euros");
        }
    }
}
