package PvE;

public class GdTAvM_IndexBot {
	public static int bot(int ar1[][]) {

		//Variabili-----------
		int val = 0;
		int att = 0;
		int def = 0;
		int set = 0;
		int botChoice = 0;
		boolean reinit = true;

		def = GdTAvM_Defense.defense(ar1);//CONTROLLO STRATEGIA DI DIFESA

		if (def > 0) {
			botChoice = def;
		} else {
			att = GdTAvM_Attack.attack(ar1);//CONTROLLO STRATEGIA DI ATTACCO	
			if (att > 0) {
				botChoice = att;
			}
		}

		if (def == 0 && att == 0) {
			set = GdTAvM_Setup.setup(ar1);
			if (set == 0) {
				while (reinit) {
					botChoice = (int)(Math.random() * (9 - 1) + 1);	

					switch (botChoice) {
					case 1: val = ar1[0][0]; break;
					case 2: val = ar1[0][1]; break;
					case 3: val = ar1[0][2]; break;
					case 4: val = ar1[1][0]; break;
					case 5: val = ar1[1][1]; break;
					case 6: val = ar1[1][2]; break;
					case 7: val = ar1[2][0]; break;
					case 8: val = ar1[2][1]; break;
					case 9: val = ar1[2][2]; break;
					default: System.out.println("Errore1"); break;
					}

					if (val == 1 || val == 2) {
						reinit = true;
					} else {
						reinit = false;
					}
				}	
			} else {
				botChoice = set;
			}
		}		
		return Math.abs(botChoice);
	}
}

