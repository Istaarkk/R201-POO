public class PileObjet {

    int NB_MAX = 10;

    int[] tab = new int[NB_MAX];
    int nb;

    PileObjet(int nbMax) {
        this.NB_MAX = nbMax;
 
        tab = new int[NB_MAX];
    }

    public static void main(String[] args) {
        PileObjet scores = new PileObjet(100);
        PileObjet notes = new PileObjet(14);

        scores.empiler(1200);
        scores.empiler(3000);
        notes.empiler(15);
        notes.empiler(17);
        scores.depiler();
        System.out.println(scores.sommet());
        notes.empiler(12);
    }

    void empiler(int val1, int val2) {
        empiler(val1);
        empiler(val2);
    }

    void depiler() {
        if (nb > 0) {
            nb--;
        }
    }

    int sommet() {
        if (nb > 0) {
            return tab[nb - 1];
        }
        return -1;
    }

    void empiler(int val) {
        if (nb < NB_MAX) {
            tab[nb] = val;
            nb++;
        } else {
            System.out.println("Pile is full.");
        }
    }
}
