package calculatrice.controler;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JButton;

import calculatrice.interfaces.Interface;
import calculatrice.interfaces.ModeleCalc;
import calculatrice.vues.VueCalculatrice;

public class Controler implements ActionListener {
	VueCalculatrice calculatrice ; 
	ModeleCalc modele ; 
	
	public Controler(VueCalculatrice calculatrice) {
		super();
		this.calculatrice = calculatrice;
		this.modele = calculatrice.getModele();
	}

	public void actionPerformed(ActionEvent e) {		

		if (e.getSource() == calculatrice.getB0() ) 
		{ 
			modele.toucheEntree(Interface.TOUCHE_0); 
			miseAJour(); 
			return ;
		}
		
		if (e.getSource() == calculatrice.getB1() ) { modele.toucheEntree(Interface.TOUCHE_1); miseAJour(); return ;}
		if (e.getSource() == calculatrice.getB2() ) { modele.toucheEntree(Interface.TOUCHE_2); miseAJour();return ;}
		if (e.getSource() == calculatrice.getB3() ) { modele.toucheEntree(Interface.TOUCHE_3); miseAJour();return ;}
		if (e.getSource() == calculatrice.getB4() ) { modele.toucheEntree(Interface.TOUCHE_4); miseAJour();return ;}
		if (e.getSource() == calculatrice.getB5() ) { modele.toucheEntree(Interface.TOUCHE_5); miseAJour();return ;}
		if (e.getSource() == calculatrice.getB6()) { modele.toucheEntree(Interface.TOUCHE_6); miseAJour();return ;}
		if (e.getSource() == calculatrice.getB7() ) { modele.toucheEntree(Interface.TOUCHE_7); miseAJour();return ;}
		if (e.getSource() == calculatrice.getB8() ) { modele.toucheEntree(Interface.TOUCHE_8); miseAJour();return ;}
		if (e.getSource() == calculatrice.getB9() ) { modele.toucheEntree(Interface.TOUCHE_9); miseAJour();return ;}

		if (e.getSource() == calculatrice.getbPlus() ) { modele.toucheEntree(Interface.TOUCHE_PLUS); return ;}
		if (e.getSource() == calculatrice.getbMoins() ) { modele.toucheEntree(Interface.TOUCHE_MOINS); return ;}
		if (e.getSource() == calculatrice.getbMultiplier() ) { modele.toucheEntree(Interface.TOUCHE_MULTI); return ;}
		if (e.getSource() == calculatrice.getbDiviser() ) { modele.toucheEntree(Interface.TOUCHE_DIVIS); return ;}
		if (e.getSource() == calculatrice.getbCE() ) { modele.toucheEntree(Interface.TOUCHE_CE); miseAJour(); return ;}
		if (e.getSource() == calculatrice.getbEGAL() ) { modele.toucheEntree(Interface.TOUCHE_EGAL); miseAJour(); return ;}
	}	
	
	public void miseAJour() {
		String texte = ""+(int) (modele.getValeur()); 
		calculatrice.getL().setText(texte);		

	}
}

	
	
	
