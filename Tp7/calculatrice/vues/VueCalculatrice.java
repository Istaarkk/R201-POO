package calculatrice.vues;
import calculatrice.controler.Controler;
import calculatrice.interfaces.ModeleCalc;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class VueCalculatrice extends JPanel {
	private ModeleCalc modele ; 

	private JLabel l ;
	private JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9 ; 
	private JButton bPlus, bMoins, bMultiplier, bDiviser, bCE, bEGAL ; 
	
	public VueCalculatrice () {
		modele = new ModeleCalc();
		
		l = new JLabel ("0");
		b0 = new JButton ("0"); 
		b1 = new JButton ("1"); 
		b2 = new JButton ("2"); 
		b3 = new JButton ("3"); 
		b4 = new JButton ("4"); 
		b5 = new JButton ("5"); 
		b6 = new JButton ("6"); 
		b7 = new JButton ("7"); 
		b8 = new JButton ("8"); 
		b9 = new JButton ("9"); 
		bPlus = new JButton ("+"); 
		bMoins = new JButton ("-"); 
		bMultiplier = new JButton ("*");
		bDiviser = new JButton ("/"); 
		bCE = new JButton ("C/CE"); 
		bEGAL = new JButton ("=") ; 
		
		l.setBackground(Color.black);
		l.setOpaque(true);
		l.setForeground(Color.green);
		l.setHorizontalAlignment(JLabel.RIGHT);
		l.setFont(new Font("Courier",Font.BOLD,48));

		JPanel boutons = new JPanel ();
		boutons.setLayout(new GridLayout(4, 4));
		boutons.add(b1);
		boutons.add(b2);
		boutons.add(b3);
		boutons.add(bPlus);
		boutons.add(b4);
		boutons.add(b5);
		boutons.add(b6);
		boutons.add(bMoins);
		boutons.add(b7);
		boutons.add(b8);
		boutons.add(b9);
		boutons.add(bMultiplier);		
		boutons.add(bCE);
		boutons.add(b0);
		boutons.add(bEGAL);
		boutons.add(bDiviser);

		setLayout (new BorderLayout());
		add (boutons, BorderLayout.CENTER);
		add (l, BorderLayout.NORTH);
		
		Controler e = new Controler (this);
		
		b0.addActionListener(e);
		b1.addActionListener(e);
		b2.addActionListener(e);
		b3.addActionListener(e);
		b4.addActionListener(e);
		b5.addActionListener(e);
		b6.addActionListener(e);
		b7.addActionListener(e);
		b8.addActionListener(e);
		b9.addActionListener(e);
		bPlus.addActionListener(e);
		bMoins.addActionListener(e);
		bMultiplier.addActionListener(e);
		bDiviser.addActionListener(e);
		bCE.addActionListener(e);
		bEGAL.addActionListener(e); 
	}

	public JLabel getL() {
		return l;
	}

	public void setL(JLabel l) {
		this.l = l;
	}

	public JButton getB0() {
		return b0;
	}

	public void setB0(JButton b0) {
		this.b0 = b0;
	}

	public JButton getB1() {
		return b1;
	}

	public void setB1(JButton b1) {
		this.b1 = b1;
	}

	public JButton getB2() {
		return b2;
	}

	public void setB2(JButton b2) {
		this.b2 = b2;
	}

	public JButton getB3() {
		return b3;
	}

	public void setB3(JButton b3) {
		this.b3 = b3;
	}

	public JButton getB4() {
		return b4;
	}

	public void setB4(JButton b4) {
		this.b4 = b4;
	}

	public JButton getB5() {
		return b5;
	}

	public void setB5(JButton b5) {
		this.b5 = b5;
	}

	public JButton getB6() {
		return b6;
	}

	public void setB6(JButton b6) {
		this.b6 = b6;
	}

	public JButton getB7() {
		return b7;
	}

	public void setB7(JButton b7) {
		this.b7 = b7;
	}

	public JButton getB8() {
		return b8;
	}

	public void setB8(JButton b8) {
		this.b8 = b8;
	}

	public JButton getB9() {
		return b9;
	}

	public void setB9(JButton b9) {
		this.b9 = b9;
	}

	public JButton getbPlus() {
		return bPlus;
	}

	public void setbPlus(JButton bPlus) {
		this.bPlus = bPlus;
	}

	public JButton getbMoins() {
		return bMoins;
	}

	public void setbMoins(JButton bMoins) {
		this.bMoins = bMoins;
	}

	public JButton getbMultiplier() {
		return bMultiplier;
	}

	public void setbMultiplier(JButton bMultiplier) {
		this.bMultiplier = bMultiplier;
	}

	public JButton getbDiviser() {
		return bDiviser;
	}

	public void setbDiviser(JButton bDiviser) {
		this.bDiviser = bDiviser;
	}

	public JButton getbCE() {
		return bCE;
	}

	public void setbCE(JButton bCE) {
		this.bCE = bCE;
	}

	public JButton getbEGAL() {
		return bEGAL;
	}

	public void setbEGAL(JButton bEGAL) {
		this.bEGAL = bEGAL;
	}

	public ModeleCalc getModele() {
		return modele;
	}

	public void setModele(ModeleCalc modele) {
		this.modele = modele;
	}
}


