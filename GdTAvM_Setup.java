package PvE;

public class GdTAvM_Setup {
	public static int setup(int ar1[][]) {

		//Variabili---------------
		int val = 0;
		int set1 = 0;
		int v1 = ar1[0][0];
		int v2 = ar1[0][1];
		int v3 = ar1[0][2];
		int v4 = ar1[1][0];
		int v5 = ar1[1][1];
		int v6 = ar1[1][2];
		int v7 = ar1[2][0];
		int v8 = ar1[2][1];
		int v9 = ar1[2][2];

		//-------------------------------------------------------------------------------//
		//             PATTERN DI SETUP CONTRO Player 1 (OBBLIGATORIO X)                 //
		//-------------------------------------------------------------------------------//
		if (v4+v5+v6 == 11 && v5 == 1) {
			set1 = (int)(Math.random() * (4 - 1) + 1);
			switch (set1) {
			case 1: val = 1; break;
			case 2: val = 3; break;
			case 3: val = 7; break;
			case 4: val = 9; break;
			default: val = 0; break;
			}
		}
		//ORRIZZONTALE Riga 1
		if (v1+v2+v3 == 12) {
			if (v1 == 2) { 
				val = 2;
			} else if (v2 == 2) { 
				val = 1;
			} else if (v3 == 2) { 
				val = 2;
			}
		}
		//ORRIZZONTALE Riga 2
		if (v4+v5+v6 == 12) {
			if (v4 == 2) { 
				val = 5; 
			} else if (v5 == 2) { 
				val = 4; 
			} else if (v6 == 2) { 
				val = 5; 
			}
		}
		//ORRIZZONTALE Riga 3
		if (v7+v8+v9 == 12) {
			if (v7 == 2) { 
				val = 8; 
			} else if (v8 == 2) { 
				val = 7; 
			} else if (v9 == 2) { 
				val = 8; 
			}
		}
		//---------------------------------------------------------------
		//VERTICALE Colonna 1
		if (v1+v4+v7 == 12) {
			if (v1 == 2) { 
				val = 4; 
			} else if (v4 == 2) { 
				val = 1; 
			} else if (v7 == 2) { 
				val = 4; 
			}
		}
		//VERTICALE Colonna 2
		if (v2+v5+v8 == 12) {
			if (v2 == 2) { 
				val = 5; 
			} else if (v5 == 2) { 
				val = 2; 
			} else if (v8 == 2) { 
				val = 5; 
			}	
		}
		//VERTICALE Colonna 3
		if (v3+v6+v9 == 12) {
			if (v3 == 2) { 
				val = 6; 
			} else if (v6 == 2) { 
				val = 3; 
			} else if (v9 == 2) { 
				val = 6; 
			}
		}
		//---------------------------------------------------------------
		//DIAGONALE DX
//		if (v1+v5+v9 == 12) {
//			if (v1 + v5 == 2) { 
//				val = 9; 
//			} else if (v1 + v9 == 2) { 
//				val = 5; 
//			} else if (v5 + v9 == 2) { 
//				val = 1; 
//			}
//		}
		//DIAGONALE SX
//		if (v1+v5+v9 == 12) {
//			if (v3 + v5 == 2) { 
//				val = 7; 
//			} else if (v3 + v7 == 2) { 
//				val = 5; 
//			} else if (v5 + v7 == 2) { 
//				val = 3; 
//			}	
//		}

		//CONTROLLO SE CI SONO TABELLE OCCUPATE GIA' DAL GIOCATORE 1
		if (val > 0) {
			int val2 = 0;
			switch (val) {
			case 1: val2 = ar1[0][0]; break;
			case 2: val2 = ar1[0][1]; break;
			case 3: val2 = ar1[0][2]; break;
			case 4: val2 = ar1[1][0]; break;
			case 5: val2 = ar1[1][1]; break;
			case 6: val2 = ar1[1][2]; break;
			case 7: val2 = ar1[2][0]; break;
			case 8: val2 = ar1[2][1]; break;
			case 9: val2 = ar1[2][2]; break;
			default: System.out.println("Errore3"); break;
			}

			if (val2 == 1) {
				val = 0;
			}
		}	
		return val;
	}
}
