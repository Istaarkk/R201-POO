package photo;
import java.util.ArrayList;

public interface EnsemblePhoto {
	void ajouterPhoto (Photo p) ; 

	void trierSelonTaille (); 

	ArrayList<Photo> rechercherMotCle (String motCle);
}

class Phototheque {
	void imprimer (EnsemblePhoto e) {
		e.trierSelonTaille (); 
	}
}