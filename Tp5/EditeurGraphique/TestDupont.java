public class TestDupont{
	
  public static void main (String args[]) {

	 Rec r = new Rec(10,10,10,10);
	  
    Editeur ed = new Editeur ();
    ed.afficherStats(r);
    
    Cercle C = new Cercle(20,20,20);
    ed.afficherStats(C);
  }
}

