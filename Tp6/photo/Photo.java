package photos.modeles;

import java.io.File;
import java.util.Arrays;

public class Photo implements Comparable<Photo> {
	private String fichier ; 
	private String pays ; 
	private int annee ; 
	private String commentaire ; 
	private long tailleFichier ; 

	public Photo(String fichier, String pays, int annee, String commentaire) {
		this.fichier = fichier;
		this.pays = pays;
		this.annee = annee;
		this.commentaire = commentaire;

		File f = new File (fichier);
		this.tailleFichier = f.length();
	}

	public int compareTo(Photo autrePhoto) {
		if (tailleFichier > autrePhoto.tailleFichier) {
			return 1;
		}
		else if (tailleFichier < autrePhoto.tailleFichier) {
			return -1;
		}
		return 0 ;
		
		//return (int) (tailleFichier - autrePhoto.tailleFichier) ;
	}
	public static void main(String[] args) {
		Photo p  = new Photo ("Essaie.jpg", "LQY", 2005, "TRY"); 
		System.out.println(p);	
		Photo p2  = new Photo ("MER.jpg", "Caraibe"2008, "ESSAI"); 
		System.out.println(p2);

		System.out.println ("Resultat de compareTo = " + p.compareTo(p2));
		int comparaison = p.compareTo(p2);
		if (comparaison == -1) 
			System.out.println(p.fichier + " plus petite que " + p2.fichier);
		else if (comparaison == 1)
			System.out.println(p.fichier + " plus grosse que " + p2.fichier);
		else 
			System.out.println(p.fichier + " de meme taille que " + p2.fichier);	
		
		Photo tp [] = {p2, p};
		System.out.println("Tableau avant tri");
		for (Photo pp : tp) System.out.println(pp);
		Arrays.sort(tp);
		System.out.println("Tableau après tri");
		for (Photo pp : tp) System.out.println(pp);
		
	}


	public String getFichier() {
		return fichier;
	}

	public void setFichier(String fichier) {
		this.fichier = fichier;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public long getTailleFichier() {
		return tailleFichier;
	}

	public void setTailleFichier() {
		File f = new File (fichier);
		this.tailleFichier = f.length();
	}

	public String toString() {
		return "Photo [fichier=" + fichier + ", "
				+ "pays=" + pays + ", "
				+ " annee=" + annee + 
				", commentaire=" + commentaire
				+ ", tailleFichier=" + tailleFichier + "]";
	}
}
