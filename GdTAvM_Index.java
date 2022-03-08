package PvE;
import java.util.Scanner;

public class GdTAvM_Index {
	public static void main(String[] args) 
			throws InterruptedException{

		//Matrice---------------------------------
		int[][] ar1 = {{5,5,5},{5,5,5},{5,5,5}};
		@SuppressWarnings("all")
		Scanner tastiera = new Scanner(System.in);

		//Variabili------------------	
		int c1 = 0;
		int c2 = 0;
		int c3 = 0;
		int c4 = 0;		
		int c5 = 0;
		int c6 = 0;		
		int cont2 = 0;
		int nM = 0;
		int nM1 = 0;
		int nM2 = 0;
		int input1 = 0;
		String pl1 = "X"; //Player 1 (Utente)= 1;
		String pl2 = "O"; //Player 2 (PC)= 2;	
		boolean check = true;
		boolean cerchioWinO = false;
		boolean croceWinO = false;
		boolean cerchioWinV = false;
		boolean croceWinV = false;
		boolean cerchioWinD = false;
		boolean croceWinD = false;
		boolean reinit = true;
		boolean end = false;
		boolean infinite = true;
		boolean inputFase = true;

		while (infinite) {
			//-------------------------------------------------------------------------------//
			//							 IMPOSTAZIONI DI PARTENZA							 //
			//-------------------------------------------------------------------------------//		

			int cont1 = (int)(Math.random() * (3 - 1) + 1); //Scelta random giocatore iniziale
			System.out.print("Giocatore 1 = " + pl1 + " / ");	                            
			nM1 = 1; //Rif per array                                                        
			System.out.print("Giocatore 2(PC) = " + pl2);		                            
			nM2 = 2; //Rif per array						                                
			System.out.println("");                                                         

			System.out.println("");                                                         
			System.out.println("Tabella di riferimento:");                                  
			for (int s1 = 1; s1 <= 9; s1++) {                                               
				System.out.print(s1);		                                                
				if (s1 == 3 | s1 == 6 | s1 == 9) {                                          
					System.out.println("");                                                 
				} else {                                                                    
					System.out.print("|");                                                  
				}                                                                           
			}                                                                               

			//-------------------------------------------------------------------------------//
			//								INIZIO PROGRAMMA								 //
			//-------------------------------------------------------------------------------//	
			while (reinit) {                                                                 

				if (cont2 == 9) {                                                            
					System.out.println("Nessuno ha vinto");                                  
					System.exit(0);                                                          
				}                                                                            

				//VERIFICA COMBINAZIONI VINCENTI	                                         
				if (check) {                                                                 
					//CICLO DI CONTROLLO ORRIZZONTALE                                        
					for (c1 = 0; c1 < 3; c1++) {                                             
						if ((ar1[c1][c2] + ar1[c1][c2+1] + ar1[c1][c2+2]) == 6) {	         
							end = true;                                                      
							cerchioWinO = true;                                              
							reinit = false;                                                  
						} else if ((ar1[c1][c2] + ar1[c1][c2+1] + ar1[c1][c2+2]) == 3) {     
							end = true;                                                      
							croceWinO = true;                                                
							reinit = false;                                                  
						}                                                                    
					}	                                                                     

					//CICLO DI CONTROLLO VERTICALE                                           
					for (c4 = 0; c4 < 3; c4++) {                                             
						if ((ar1[c3][c4] + ar1[c3+1][c4] + ar1[c3+2][c4]) == 6) {	         
							end = true;                                                      
							cerchioWinV = true;                                              
							reinit = false;                                                  
						} else if ((ar1[c3][c4] + ar1[c3+1][c4] + ar1[c3+2][c4]) == 3) {	 
							end = true;                                                      
							croceWinV = true;                                                
							reinit = false;                                                  
						}                                                                    
					}	                                                                     

					//CICLO DI CONTROLLO DIAGONALE DX                                        
					if ((ar1[c5][c5] + ar1[c5+1][c5+1] + ar1[c5+2][c5+2]) == 6) {	         
						end = true;                                                          
						cerchioWinD = true;                                                  
						reinit = false;                                                      
					} else if ((ar1[c5][c5] + ar1[c5+1][c5+1] + ar1[c5+2][c5+2]) == 3) {	 
						end = true;                                                          
						croceWinD = true;                                                    
						reinit = false;                                                      
					}                                                                        

					//CICLO DI CONTROLLO DIAGONALE SX                                        
					if ((ar1[c6][c6+2] + ar1[c6+1][c6+1] + ar1[c6+2][c6]) == 6) {            
						end = true;                                                          
						cerchioWinD = true;                                                  
						reinit = false;                                                      
					} else if ((ar1[c6][c6+2] + ar1[c6+1][c6+1] + ar1[c6+2][c6]) == 3) {     
						end = true;                                                          
						croceWinD = true;                                                    
						reinit = false;                                                      
					}                                                                        
				}                                                                            

				//STAMPA RISULTATO----------------------------------------
				if (end) {                                                
					if (cerchioWinO) {                                    
						System.out.println("(Vince Cerchio Orrizzontale)");                  
					} else if (croceWinO){                                                   
						System.out.println("(Vince Croce Orrizzontale)");                    
					} else if (cerchioWinV){                                                 
						System.out.println("(Vince Cerchio Verticale)");                     
					} else if (croceWinV){                                                   
						System.out.println("(Vince Croce Verticale)");                       
					} else if (cerchioWinD){                                                 
						System.out.println("(Vince Cerchio Diagonale)");                     
					} else if (croceWinD){                                                   
						System.out.println("(Vince Croce Diagonale)");                       
					}                                                                        
					System.exit(0);                                                          
				}                                                                            

				//SELEZIONE TURNO GIOCATORI--------------------------------------
				int q = cont1 / 2;                                                
				int r = cont1 - (q*2); 

				inputFase = true;

				while (inputFase) {
					//Verifica finale                                                            
					if (r == 1) {                                                                
						System.out.println("");                                                  
						System.out.print("Turno Giocatore 1, indica una posizione:");            
						System.out.println("");                                                  
						nM = nM1;                                                                

						input1 = Integer.parseInt(tastiera.nextLine());	                         
					} else {			                                                         
						System.out.println("");                                                  
						System.out.print("Turno Giocatore 2");                                   
						nM = nM2;                                                                
						for (int pB = 0; pB < 5; pB++) {                                         
							System.out.print(".");                                               
							Thread.sleep(175);                                                   
						}                                                                                           
						input1 = GdTAvM_IndexBot.bot(ar1); //AVVIO GIOCATORE 2 (PC)                                       
						System.out.println("");                                                  
					}   

					//CONTROLLO SE CI SONO TABELLE OCCUPATE GIA' DAL GIOCATORE 2
					int val2 = 0;
					switch (input1) {
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

					if (val2 == 2) {
						System.out.println("Giocatore 1 non può posizionarsi sul riquadro ");
						System.out.println("(" + input1 + "), indica un altra posizione:");
					} else {
						inputFase = false;
					}
				}

				//MEMORIZAZZIONE SCELTA SU MATRICE-----
				if(input1 <= 3) {                      
					ar1[0][input1 - 1] = nM;                                                 
				} else if(input1 > 3 && input1 < 7) {                                        
					ar1[1][input1 - 4] = nM;                                                 
				} else {                                                                     
					ar1[2][input1 - 7] = nM;                                                 
				}                                                                            

				//RISTAMPA DELLO TABELLA AGGIORNATA----
				for (int s2 = 0; s2 < 3; s2++) {                                             
					int s3 = 0;                                                              
					for (s3 = 0; s3 < 3; s3++) {	                                         
						if (ar1[s2][s3] == 5) {                                              
							System.out.print(".");	                                         
						} else if (ar1[s2][s3] == 1) {                                       
							System.out.print("X");	                                         
						} else if (ar1[s2][s3] == 2) {                                       
							System.out.print("O");	                                         
						}                                                                    

						if (s3 == 2) {                                                       
							System.out.println("");                                          
						} else {                                                             
							System.out.print("|");                                           
						}                                                                    
						Thread.sleep(45);                                                    
					}	                                                                     
				}                                                                            
				cont1++;                                                                      
				cont2++;                                                                     
			}
		}		
	}
}





































