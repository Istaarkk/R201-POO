package volailler;

class Elevage{
	
	final static int NBMAX = 100 ; 
	Volaille[] volailles ;
	int nbBetes ;
	
	Elevage () {
		volailles = new Volaille[NBMAX] ;
	}
	
	void ajouter(Volaille v){
		volailles[nbBetes] = v;
		nbBetes++;
	}
	
	void ecrire(){
		for (int i=0; i<nbBetes; i++){
			System.out.println(
					volailles[i].identifiant + " " +
					volailles[i].poids + " " + 
					volailles[i].getprix());
		}
	}
	
	void changePoids(int id, double np){
		Volaille v = rechercher(id) ; 
		
		if (v != null)
			v.poids(np);
	}
	Volaille rechercher(int id){
		for(int i=0; i<nbBetes; i++){
			
			
			if(volailles[i].identifiant == id){
				return volailles[i];
			}
		}
		
		return null ;
	}
	Volaille[] envoyerALAbattoir(){
		Volaille[] res = new Volaille[NBMAX];
		int nb = 0;
		int i = 0;
		

		while (i < nbBetes){
			System.out.print("+");
			if (volailles[i].assezgrosse()){
				res[nb] = volailles[i];
				nb++;
				
				volailles[i]=volailles[nbBetes-1];
				nbBetes--;
			}
			else i++;
		}
		return res;
	}
	
	double evaluerBetesAAbattre(){
		double res = 0;
		
		for (int i=0; i<nbBetes; i++){
			
			if (volailles[i].assezgrosse()){
				res = res+volailles[i].getprix();
			}
		}
		return res;
	}
	
	public String afficherBetesAAbattre() {
		String s = ""; 
		
		
		for (int i=0; i<nbBetes; i++){
			if (volailles[i].assezgrosse()){
				s = s + volailles[i].toString();
			}
		}
		
		return s;
	}
}
