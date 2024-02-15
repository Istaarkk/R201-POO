
public class PileStatic {
	final static int NB_MAX = 10 ; 
	
	static final int [] tab = new int [NB_MAX];

	static int nb ;
	
	public static void main(String[] args) {
		empiler(10);
		empiler(20,40);
		System.out.println(sommet());
		depiler();
		System.out.println(sommet());
	}
	static void empiler(int val1,int val2) {
		empiler(val1);
		empiler (val2);
	}
	static void depiler() {
		if (nb>0) {
		nb--;
		}
		
	}
	static int sommet() {
		if(nb>0) {
			return tab[nb-1];
		}
		return -1;
		
	}
	
	static void empiler(int val) {
		tab[nb] = val ;
		nb++ ;
	}
}
