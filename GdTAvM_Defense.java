package PvE;

public class GdTAvM_Defense {
	public static int defense(int ar1[][]) {

		//Variabili--------
		int val = 0;
		int val2 = 0;
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
		//             PATTERN DI DIFESA CONTRO Player 1 (OBBLIGATORIO X)                //
		//-------------------------------------------------------------------------------//
		//ORRIZZONTALE RIGA 1-------------//
		if (v1+v2+v3 != 4) {              //
			if (v1 + v2 == 2) {           //
				//Difesa su riquadro 3"); //
				val = 3;                  //
			} else if (v1 + v3 == 2) {    //
				//Difesa su riquadro 2"); //
				val = 2;                  //
			} else if (v2 + v3 == 2) {    //
				//Difesa su riquadro 1"); //
				val = 1;                  //
			}                             //
		}                                 //
		//ORRIZZONTALE RIGA 2-------------//
		if (v4+v5+v6 != 4) {              //
			if (v4 + v5 == 2) {           //
				//Difesa su riquadro 6"); //
				val = 6;                  //
			} else if (v4 + v6 == 2) {    //
				//Difesa su riquadro 5"); //
				val = 5;                  //
			} else if (v5 + v6 == 2) {    //
				//Difesa su riquadro 4"); //
				val = 4;                  //
			}                             //
		}                                 //
		//ORRIZZONTALE RIGA 3-------------//
		if (v7+v8+v9 != 4) {              //
			if (v7 + v8 == 2) {           //
				//Difesa su riquadro 9"); //
				val = 9;                  //
			} else if (v7 + v9 == 2) {    //
				//Difesa su riquadro 8"); //
				val = 8;                  //
			} else if (v8 + v9 == 2) {    //
				//Difesa su riquadro 7"); //
				val = 7;                  //
			}                             //
		}                                 //
		//VERTICALE COLONNA 1-------------//
		if (v1+v4+v7 != 4) {              //
			if (v1 + v4 == 2) {           //
				//Difesa su riquadro 7"); //
				val = 7;                  //
			} else if (v1 + v7 == 2) {    //
				//Difesa su riquadro 4"); //
				val = 4;                  //
			} else if (v4 + v7 == 2) {    //
				//Difesa su riquadro 1"); //
				val = 1;                  //
			}                             //
		}                                 //
		//VERTICALE COLONNA 2-------------//
		if (v2+v5+v8 != 4) {              //
			if (v2 + v5 == 2) {           //
				//Difesa su riquadro 8"); //
				val = 8;                  //
			} else if (v2 + v8 == 2) {    //
				//Difesa su riquadro 5"); //
				val = 5;                  //
			} else if (v5 + v8 == 2) {    //
				//Difesa su riquadro 2"); //
				val = 2;                  //
			}	                          //
		}                                 //
		//VERTICALE COLONNA 3-------------//
		if (v3+v6+v9 != 4) {              //
			if (v3 + v6 == 2) {           //
				//Difesa su riquadro 9"); //
				val = 9;                  //
			} else if (v3 + v9 == 2) {    //
				//Difesa su riquadro 6"); //
				val = 6;                  //
			} else if (v6 + v9 == 2) {    //
				//Difesa su riquadro 3"); //
				val = 3;                  //
			}                             //
		}                                 //
		//DIAGONALE DX--------------------//
		if (v1+v5+v9 != 4) {              //
			if (v1 + v5 == 2) {           //
				//Difesa su riquadro 9"); //
				val = 9;                  //
			} else if (v1 + v9 == 2) {    //
				//Difesa su riquadro 5"); //
				val = 5;                  //
			} else if (v5 + v9 == 2) {    //
				//Difesa su riquadro 1"); //
				val = 1;                  //
			}                             //
		}                                 //
		//DIAGONALE SX--------------------//
		if (v3+v5+v7 != 4) {              //
			if (v3 + v5 == 2) {           //
				//Difesa su riquadro 7"); //
				val = 7;                  //
			} else if (v3 + v7 == 2) {    //
				//Difesa su riquadro 5"); //
				val = 5;                  //
			} else if (v5 + v7 == 2) {    //
				//Difesa su riquadro 3"); //
				val = 3;                  //
			}	                          //
		}    
		
		//CONTROLLO SE CI SONO TABELLE OCCUPATE GIA' DAL GIOCATORE 1
		if (val > 0) {
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
			default: System.out.println("Errore2"); break;
			}
			
			if (val2 == 1 || val2 == 2) {
				val = 0;
			}
		}	
		return val;
	}
}

