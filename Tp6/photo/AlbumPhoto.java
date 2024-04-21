package photo;
import java.util.*;
import java.util.Arrays;
import java.util.Collections;

public class AlbumPhoto implements EnsemblePhotos {
	private ArrayList<Photo> album ; 
	
	public AlbumPhoto () {
		album = new ArrayList<Photo> ();
	}

	public void ajouterPhoto(Photo p) {
		album.add(p);
	}
	
	public void trierSelonTaille() {
		Collections.sort (album);		
	}
	
	public ArrayList rechercherMotCle(String motCle) {
		ArrayList result = new ArrayList ();
		for (Photo p : album)
			if (p.getCommentaire().contains(motCle))
		    	   result.add (p);
		return result;
	}

	
	public String toString() {
		return "AlbumPhoto [album=" + album + "]";
	}

	public static void main(String[] args) {
		AlbumPhoto souvenirs = new AlbumPhoto();
		Photo p1 = new Photo ("Monument Valley.jpg", "USA", 2014, "Monument Valley ; western");		
		Photo p2 = new Photo ("Singapour.jpg", "Asie", 2016, "Singapour ; moderne");		
		Photo p3 = new Photo ("Montagne.jpg", "Suisse", 2009, "Montagne ; alpage");		
		souvenirs.ajouterPhoto(p1);
		souvenirs.ajouterPhoto(p2);
		souvenirs.ajouterPhoto(p3);
		System.out.println(souvenirs);
	}
}
