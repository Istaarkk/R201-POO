package III_salaries;
public class ClientInterne extends Salarie {
	private Compte compte ; 
	
	public ClientInterne(double salaire, Compte compte) {
		super(salaire);
		this.compte = compte ;
	}
	public void verserSalaire() {
		compte.crediter(getSalaire());
	}
	public Compte getCompte() {
		return compte;
	}
	public void setCompte(Compte compte) {
		this.compte = compte;
	}
}
