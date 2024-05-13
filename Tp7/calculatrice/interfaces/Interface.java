package calculatrice.interfaces;

public interface Interface{

		public static final int TOUCHE_0 = 0;
		public static final int TOUCHE_1 = 1;
		public static final int TOUCHE_2 = 2;
		public static final int TOUCHE_3 = 3;
		public static final int TOUCHE_4 = 4;
		public static final int TOUCHE_5 = 5;
		public static final int TOUCHE_6 = 6;
		public static final int TOUCHE_7 = 7;
		public static final int TOUCHE_8 = 8;
		public static final int TOUCHE_9 = 9;
		public static final int TOUCHE_PLUS  = 10;
		public static final int TOUCHE_MOINS = 11;
		public static final int TOUCHE_MULTI = 12;
		public static final int TOUCHE_DIVIS = 13;
		public static final int TOUCHE_EGAL  = 14;
		public static final int TOUCHE_CE    = 15;
		public static final int TOUCHE_POINT = 16;

		
		public void toucheEntree(int touche);
			
		public double getValeur ();
	}

