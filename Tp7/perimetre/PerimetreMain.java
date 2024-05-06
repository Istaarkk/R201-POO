import javax.swing.*;

public class PerimetreMain {
	public static void main(String[] args) {

		JFrame fenetre = new JFrame ("Calcul Perimetre");
		fenetre.setSize (300, 300);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel perimetreMain = new JPanel();
		
	
		JLabel lLongeur = new JLabel ("Longueur:");
		JLabel lLargeur = new JLabel ("Largeur:");
		JTextField txtLongeur = new JTextField (20);
		JTextField txtLargeur = new JTextField (20);
		JLabel lblResultat = new JLabel ("Resultat:");
		JLabel lblValResultat = new JLabel ("0");
		JButton bCalculer = new JButton ("Calculer");
		JButton bNettoyer = new JButton ("Nettoyer");
	
		perimetreMain.add(lLongeur);
		perimetreMain.add(txtLongeur);
		perimetreMain.add(lLargeur);
		perimetreMain.add(txtLargeur);
		perimetreMain.add(lblResultat);
		perimetreMain.add(lblValResultat);
		perimetreMain.add(bCalculer);
		perimetreMain.add(bNettoyer);
		
		fenetre.add(perimetreMain);
				
		fenetre.setVisible(true);
	}
}



