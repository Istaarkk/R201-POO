package BanqueAbstraite;


public class Client {
	private String nom ;
	
	public Client(String nom) {
		this.nom = nom;
	}

	public String toString () {
		return "Client : " + nom ;
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	// QUESTION 13
	public void afficherInformations() {
		System.out.println ("Client : "+nom);
	} 	
}