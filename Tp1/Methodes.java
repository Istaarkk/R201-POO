public class Methodes {
    public static void main(String[] args) {
        char char1 = 'A';
        char char2 = 'B';
        
        echangerChars(char1, char2);

        float[] tableauFloat = new float[1];
        tableauFloat[0] = 100.0f;

        modifierTableau(tableauFloat);
        
        float f1 = 3;
        float f2 = 10;
        echangerFloat(f1,f2);
     
    }

    
    public static void echangerChars(char c1, char c2) {
        System.out.println("Pendant l'appel : c1 = " + c1 + ", c2 = " + c2);
        char temp = c1;
        c1 = c2;
        c2 = temp;
        System.out.println("Après l'appel : c1 = " + c1 + ", c2 = " + c2);
    }
    
    
    public static void echangerFloat(float f1, float f2) {
        System.out.println("Pendant l'appel : f1 = " + f1 + ", f2 = " + f2);
        float temp = f1;
        f1 = f2;
        f2 = temp;
        System.out.println("Après l'appel : f1 = " + f1 + ", f2 = " + f2);
    }


    public static void modifierTableau(float[] tableau) {
        System.out.println("Pendant l'appel : tableau[0] = " + tableau[0]);
        tableau[0] = 150.7f;
        System.out.println("Pendant l'appel : tableau[0] = " + tableau[0]);
    }
}
