package calculatrice.interfaces;


public class ModeleCalc implements Interface{
	private static final int STATE_EDIT   = 0;
	private static final int STATE_MUL    = 1;
	private static final int STATE_ADD    = 2;
	private static final int STATE_DIV    = 3;
	private static final int STATE_SUB    = 4;
	private static final int STATE_RES    = 5;

	private int value = 0;
	private int valueA = 0;	
	private int state = STATE_EDIT;

	public void toucheEntree(int touche){

			switch (touche){
				case TOUCHE_0 : Type(); value = value*10 ;   display(); break ; 
				case TOUCHE_1 : Type(); value = value*10+1 ; display(); break ;
				case TOUCHE_2 : Type(); value = value*10+2 ; display(); break ;
				case TOUCHE_3 : Type(); value = value*10+3 ; display(); break ;
				case TOUCHE_4 : Type(); value = value*10+4 ; display(); break ;
				case TOUCHE_5 : Type(); value = value*10+5 ; display(); break ;
				case TOUCHE_6 : Type(); value = value*10+6 ; display(); break ;
				case TOUCHE_7 : Type(); value = value*10+7 ; display(); break ;
				case TOUCHE_8 : Type(); value = value*10+8 ; display(); break ;
				case TOUCHE_9 : Type(); value = value*10+9 ; display(); break ;
	
				case TOUCHE_DIVIS : Operate(); valueA = value ; value = 0; state = STATE_DIV; break ;
				case TOUCHE_MOINS : Operate(); valueA = value ; value = 0; state = STATE_SUB; break ;
				case TOUCHE_MULTI : Operate(); valueA = value ; value = 0; state = STATE_MUL; break ;
				case TOUCHE_PLUS  : Operate(); valueA = value ; value = 0; state = STATE_ADD; break ;
	
				case TOUCHE_EGAL  : Operate();  state = STATE_RES; valueA = value ; break ;
	
				case TOUCHE_CE  : valueA = 0 ; value = 0; state = STATE_EDIT; display();; break ;
			}
		}

		private void Type() {
			switch (state){
				case STATE_RES : state = STATE_EDIT; value=0; valueA=0;  break;
			}
		}

		private boolean Operate() {
			try {
				switch (state){
				case STATE_EDIT : break;
				case STATE_ADD : value = valueA + value ; display(); break;
				case STATE_SUB : value = valueA - value ; display(); break;
				case STATE_MUL : value = valueA * value ; display(); break;
				case STATE_DIV : value = valueA / value ; display(); break;
				case STATE_RES : value = valueA         ; display(); break;
				}
			} catch (Exception e){
				valueA = 0; value=0; 
				state = STATE_RES;
				display();
				return false;
			}
			
			return true;
		}

		private void display() {
			System.out.println ("TRACE : " + value);
		}
		
		public double getValeur () {
			return value ;
		}
	}
