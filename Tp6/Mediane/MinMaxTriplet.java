public class MinMaxTriplet
implements MinMax {
	int valeur1 ;
	int valeur2 ;
	int valeur3 ;

	public int minimum() {
		return(Math.min(Math.min(valeur1,valeur2),valeur3)) ;
	}

	public int maximum() {
		return(Math.max(Math.max(valeur1,valeur2),valeur3)) ;
	}

	public int getValeur1() {
		return valeur1;
	}

	public void setValeur1(int valeur1) {
		this.valeur1 = valeur1;
	}

	public int getValeur2() {
		return valeur2;
	}

	public void setV2(int valeur2) {
		this.valeur2 = valeur2;
	}

	public int getV3() {
		return v3;
	}

	public void setV3(int v3) {
		this.v3 = v3;
	}
}
