package calculatrice ; 
import javax.swing.JFrame;

import calculatrice.vues.VueCalculatrice;

public class Main {

	public static void main(String[] args) {
		JFrame fenetre = new JFrame ("CALCULATRICE");
		fenetre.setSize (400, 400);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		VueCalculatrice calc = new VueCalculatrice ();

		fenetre.getContentPane().add(calc);

		fenetre.setVisible(true);
	}

}
