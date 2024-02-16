public class VoitureProprietaire {
    int annee;
    int puissance;
    double valeur;
    Personne proprietaire;

    public static void main(String[] args) {
        Personne martin = new Personne();
        martin.anneeNaissance = 1996;
        martin.nom = "Martin";

        VoitureProprietaire scenicp = new VoitureProprietaire();
        // Vérifiez d'abord si l'objet scenicp et son propriétaire ne sont pas null avant d'accéder à leurs propriétés
        if (scenicp != null && scenicp.proprietaire != null) {
            System.out.println(scenicp.proprietaire.anneeNaissance);
        }

        scenicp.annee = 2000;
        scenicp.proprietaire = martin;

        System.out.println(scenicp.proprietaire.anneeNaissance);

        VoitureProprietaire clio = new VoitureProprietaire();
        // Vérifiez d'abord si l'objet clio et son propriétaire ne sont pas null avant d'accéder à leurs propriétés
        if (clio != null && clio.proprietaire != null) {
            System.out.println(clio.proprietaire.anneeNaissance);
        }

        clio.annee = 1950;
        clio.proprietaire = martin; // = Jacques pour un deuxième propriétaire

        clio.puissance = 100;

        System.out.println(clio.puissance);
        System.out.println(clio.proprietaire.nom);
    }
}
