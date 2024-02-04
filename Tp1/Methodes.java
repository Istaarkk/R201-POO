public class Methodes {
    public static void main(String[] args) {
        char char1 = 'A';
        char char2 = 'B';

        System.out.println("Avant l'appel : char1 = " + char1 + ", char2 = " + char2);
        echangerChars(char1, char2);
        System.out.println("Après l'appel : char1 = " + char1 + ", char2 = " + char2);

        float[] tableauFloat = new float[1];
        tableauFloat[0] = 100.0f;

        System.out.println("Avant l'appel : tableauFloat[0] = " + tableauFloat[0]);
        modifierTableau(tableauFloat);
        System.out.println("Après l'appel : tableauFloat[0] = " + tableauFloat[0]);
    }

    public static void echangerChars(char c1, char c2) {
        System.out.println("Pendant l'appel : c1 = " + c1 + ", c2 = " + c2);
        char temp = c1;
        c1 = c2;
        c2 = temp;
        System.out.println("Pendant l'appel : c1 = " + c1 + ", c2 = " + c2);
    }

    public static void modifierTableau(float[] tableau) {
        System.out.println("Pendant l'appel : tableau[0] = " + tableau[0]);
        tableau[0] = 150.7f;
        System.out.println("Pendant l'appel : tableau[0] = " + tableau[0]);
    }
}
