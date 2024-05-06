import javax.swing.*;

public class PanelPerimetre extends JPanel {
	protected JLabel lLongeur ;
	protected JLabel lLargeur ;
	protected JTextField txtLongeur ;
	protected JTextField txtLargeur ;
	protected JLabel lblResultat ;
	protected JLabel lblValResultat ;
	protected JButton bCalculer ;
	protected JButton bNettoyer ;
 
	PanelPerimetre () {
		lLongeur = new JLabel ("Longueur:");
		lLargeur = new JLabel ("Largeur:");
		txtLongeur = new JTextField (20);
		txtLargeur = new JTextField (20);
		lblResultat = new JLabel ("Resultat:");
		lblValResultat = new JLabel ("0");
		bCalculer = new JButton ("Calculer");
		bNettoyer = new JButton ("Nettoyer");	
	
		add(lLongeur);
		add(txtLongeur);
		add(lLargeur);
		add(txtLargeur);
		add(lblResultat);
		add(lblValResultat);
		add(bCalculer);
		add(bNettoyer);

	}
	
	public static void main(String[] args) {
		JFrame fenetre = new JFrame ("Perimetre");
		fenetre.setSize (300, 300);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		PanelPerimetre perimetre = new PanelPerimetre();
			
		fenetre.add(perimetre);
				
		fenetre.setVisible(true);
	}
}
