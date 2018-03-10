import java.util.Scanner;
import static sun.audio.AudioPlayer.player;

public class run {
	Scanner input=new Scanner(System.in);
    // int num, String name, int age, int distance, int coins ,int score

	player collectionOfPlayers[]; 
	//collectionOfPlayers[1] = currentPlayer;
	int indexOfDistance = 0;
	int indexDistance = 0;
	int indexOfCoin = 0;
	int indexCoin = 0;
	int indexOfScore = 0;
	int indexScore = 0;
	String user ;
	
	int playerNum = 0;
	String playerName = "";
	int playerAge = 0;
	int playerDistance = 0;
	int playerCoins = 0;
	int playerScore = 0;
	boolean isNumber ;
	//boolean isPoistive ;
	
	public static void main(String[]args){		
		
		
		System.out.println("         Temple run game player details " );
		System.out.println("     -----------------------------------------");
		
		run myGame=new run	 ();
		myGame.userInput	 ();
		myGame.display		 ();
		myGame.playerDetails ();
		myGame.winnerDetails ();
		myGame.selectWinner  ();
		myGame.selectedPlayer();
		myGame.goToMenu      ();
	}

    public run() {
        this.collectionOfPlayers = new player[20];
    }
	

	public void userInput() {
		//collectionOfPlayers[1] = currentPlayer;
		System.out.println(" > Fill the above questions to enter player details < " + "\n");
		
		for(int player=0; player<20; player++){	
			System.out.println((player+1) + "]");
			
			do {
				System.out.print("  [01] Enter player number   : ");//player number
				if(input.hasNextInt()){
					playerNum = input.nextInt();
					isNumber = true;
				   
					if(playerNum < 0){
				    	  isNumber = false;
						  System.err.print("   >ERROR Enter a positive number<" + "\n");
						  System.out.print("  [01] Enter player number   : ");
						  playerNum = input.nextInt();						
				    }
				         if(playerNum > 0){
				    	    isNumber = true;
				         }
				     
				    } else {
					  isNumber = false;
					  input.next();
					  System.err.println("Invalid user number Please enter decimal" + "\n");			
				   }
			}while (!(isNumber));

			
			System.out.print("  [02] Enter player name     : ");//player names
			playerName = input.next();
			
			
		   do {
			   System.out.print("  [03] Enter player age      : ");//player age
			   if(input.hasNextInt()){
				   playerAge = input.nextInt();
				   isNumber = true;
			    
			      if(playerAge < 0){
				   	  isNumber = false;
					  System.err.print("   > ERROR Enter a positive value <" + "\n");
					  System.out.print("  [03] Enter player age      : ");
					  playerNum = input.nextInt();
				  }
			      if(playerAge > 0){
			    	  isNumber = true;
			      }
			      
			   } else {
				     isNumber = false;
				     input.next();
				     System.err.print("Invalid user number Please enter decimal" + "\n");
			   }				   
		    }while(!(isNumber));
		   
		   
		  do {	
			  System.out.print("  [04] Enter player distance : ");//player game distances
			  if(input.hasNextInt()){
				  playerDistance = input.nextInt();
				  isNumber = true;
				  
			     if(playerDistance < 0){
			    	 isNumber = false;		     
					 System.err.print("   > ERROR Enter a positive value <" + "\n");
					 System.out.print("  [04]  Enter player distance : ");
					 playerNum = input.nextInt();
			     }
			     if(playerDistance > 0){
			    	  isNumber = true;
			      }
			     
			  } else {
				    isNumber = false;
				    input.next();
				    System.err.print("Invalid user number Please enter decimal" + "\n");
			  }
		}while(!(isNumber));
		
		
		  do {		
			  System.out.print("  [05] Enter player coins    : ");//player coins collection.
			  if(input.hasNextInt()){
			      playerCoins = input.nextInt();
			      isNumber = true;
			     
			     if(playerCoins < 0){
			    	isNumber = false;
					System.err.print("   > ERROR Enter a positive value <" + "\n");
					System.out.print("  [05] Enter player coins     : ");
					playerNum = input.nextInt();
				}
			     if(playerCoins > 0){
			    	  isNumber = true;
			      }
			  } else {
				    isNumber = false;
				    input.next();
				    System.err.print("Invalid user number Please enter decimal" + "\n");
			 }
		}while(!(isNumber));
		
		
		  do {	
			  System.out.print("  [06] Enter player score    : ");//player score collection
			  if(input.hasNextInt()){
			      playerScore = input.nextInt();
			      isNumber = true;
			      
			     if(playerScore < 0){
			    	isNumber = false;
					System.err.print("   > ERROR Enter a positive value <" + "\n");
					System.out.print("  [06]  Enter player score    : ");
					playerScore = input.nextInt();
				}
			     if(playerScore > 0){
			    	  isNumber = true;
			      }
			  } else {
				    isNumber = false;
				    input.next();
				    System.err.print("Invalid user number Please enter decimal" + "\n");
			}
		}while(!(isNumber));
			
		
			player currentPlayer = new player(playerNum,playerName,playerAge,playerDistance,playerCoins,playerScore);
			collectionOfPlayers[player] = currentPlayer;
			System.out.println("-----------------------------------------------------------------");
		}
		display();			
	}
	
		
	public void display() {	
		System.out.println(" Select the above options to view details");
		System.out.println("------------------------------------------" + "\n");
		System.out.println("[1] - Veiw player details" + "\n" + "[2] - view winner details" + "\n" + "[3] - view selected winners" +
		"\n" + "[4] - View selected player details");
		
		user=input.next();
				
		playerDetails ();
		winnerDetails ();
		selectWinner ();
		selectedPlayer();
		goToMenu      ();
	
	}
	

	public void playerDetails(){
		
		switch(user){		
			case "1":
				System.out.println("                   Player Details");
				
				for(int player=0; player<3; player++){		
					System.out.println("Player number is   		  : " + " " + collectionOfPlayers[player].playerNum);
					System.out.println("Player name is     		  : " + " " + collectionOfPlayers[player].playerName);
					System.out.println("Player age is     		  : " + " " + collectionOfPlayers[player].playerAge); 
					System.out.println("Player distance is 		  : " + " " + collectionOfPlayers[player].playerDistance);
					System.out.println("Player coin collection is         : " + " " + collectionOfPlayers[player].playerCoins);
					System.out.println("Player score is 		  : " + " " + collectionOfPlayers[player].playerScore);	
					System.out.println("--------------------------------------------------------------");
				}
				
				System.out.println("\n" + " [11] - to countinue"  + "\n" + " [22] - END");
				user=input.next();
				break;
		}
	}
	
	
	public void winnerDetails(){
		
		switch(user){
			case "2":
				System.out.println("Winner of three type methods");
				System.out.println("---------------------------------------" + "\n");
				
				int largest = collectionOfPlayers[0].playerDistance; //calculation to find the highest distances 
				for(int num = 0; num < collectionOfPlayers.length; num++){
						if(playerDistance > largest){
							largest = collectionOfPlayers[num].playerDistance;
							// indexOfDistance = num;						
						}											
				}

				for(int sameValue = 0; sameValue < 20; sameValue++ ){
					if(	largest == collectionOfPlayers[sameValue].playerDistance ){
						// indexDistance = sameValue;
						System.out.println(" (01] Name of the player		: " +  collectionOfPlayers[sameValue].playerName);
						System.out.println(" (02] Age of the player is	    	: " +  collectionOfPlayers[sameValue].playerAge);
						System.out.println(" (03] Player distance is 		: " +  largest );
						System.out.println("---------------------------------------------------");
					}
				}

								
				int max = collectionOfPlayers[0].playerCoins;
				for(int num=0; num < collectionOfPlayers.length; num++){
					if(playerCoins > max){
						max = collectionOfPlayers[num].playerCoins;
						//indexOfCoin = num;
					}			
				}
						
				for(int samecoin = 0; samecoin < 20; samecoin++ ){
					if(	max == collectionOfPlayers[samecoin].playerCoins){
						System.out.println(" (01] Name of the player		: " +  collectionOfPlayers[samecoin].playerName);
						System.out.println(" (02] Age of the player is	    	: " +  collectionOfPlayers[samecoin].playerAge);
						System.out.println(" (03] Player coin collection is 	: " +  max );
						System.out.println("---------------------------------------------------");
					}
				}
				
				int highest = collectionOfPlayers[0].playerScore;
				for(int num = 0; num < collectionOfPlayers.length; num++){
					if(playerScore > highest){
						highest = collectionOfPlayers[num].playerScore;
						//indexOfScore = num;
					}
				}
				
				for(int sameValue = 0; sameValue < 20; sameValue++ ){
					if(	highest == collectionOfPlayers[sameValue].playerScore){
						//indexScore = sameValue;
						System.out.println(" (01] Name of the player		: " +  collectionOfPlayers[sameValue].playerName);
						System.out.println(" (02] Age of the player is	    	: " +  collectionOfPlayers[sameValue].playerAge);
						System.out.println(" (03] Player score is    		: " +  highest );
						System.out.println("---------------------------------------------------");
						
					}
				}
				
				
				System.out.println("\n" + "[11] - to countinue" + "\n" + "[22] - END");
				user=input.next();
				break;
		}
	}
				
		private void selectWinner() {
			
					switch(user){
						case "3":
							
						System.out.println("\n [6] - Winner of distance"+"\n [7] - Winner of  coin collection"+"\n [8] -Winner of highest score");
						   String in=input.next();
						   
							 switch(in){
								case "6":
								  int largest = collectionOfPlayers[0].playerDistance; //calculation to find the highest distances 
								  for(int num = 0; num < collectionOfPlayers.length; num++){
									if(playerDistance > largest){
									   largest = collectionOfPlayers[num].playerDistance;
									   //indexOfDistance = num;
									}											
								  }
								 						
								  for(int sameValue = 0; sameValue < 20; sameValue++ ){
									if(	largest == collectionOfPlayers[sameValue].playerDistance){
									   //indexDistance = sameValue;
										 System.out.println(" (01] Name of the player		: " +  collectionOfPlayers[sameValue].playerName);
										  System.out.println(" (02] Age of the player is	    	: " +  collectionOfPlayers[sameValue].playerAge);
										  System.out.println(" (03] Player distance is 		: " +  largest );
										  System.out.println("---------------------------------------------------");
									}
								  }
								 							
								  System.out.println("\n" + "[11] - to countinue" + "\n" + "[22] - END");
							      user=input.next();
								  break;
									
								case "7":
									int max = collectionOfPlayers[0].playerCoins;
									for(int num=0; num < collectionOfPlayers.length; num++){
										if(playerCoins > max){
										   max = collectionOfPlayers[num].playerCoins;
										   //indexOfCoin = num;
										}			
									}
										
									for(int sameValue = 0; sameValue < 20; sameValue++ ){
										if(	max == collectionOfPlayers[sameValue].playerCoins){
										   //indexCoin = sameValue;
											System.out.println(" (01] Name of the player		: " +  collectionOfPlayers[sameValue].playerName);
											System.out.println(" (02] Age of the player is	    	: " +  collectionOfPlayers[sameValue].playerAge);
											System.out.println(" (03] Player distance is 		: " +  max );
											System.out.println("---------------------------------------------------");
										}
									}				
									System.out.println("\n" + "[11] - to countinue" + "\n" + "[22] - END");
									user=input.next();
									break;
										
								 case "8":
									int highest = collectionOfPlayers[0].playerScore;
									for(int num = 0; num < collectionOfPlayers.length; num++){
										if(playerScore > highest){
										   highest = collectionOfPlayers[num].playerScore;
										   //indexOfScore = num;
										}
									}		
									for(int sameValue = 0; sameValue < 20; sameValue++ ){
										if(	highest == collectionOfPlayers[sameValue].playerScore){
										    //indexScore = sameValue;
											System.out.println(" (01] Name of the player		: " +  collectionOfPlayers[sameValue].playerName);
											System.out.println(" (02] Age of the player is	    	: " +  collectionOfPlayers[sameValue].playerAge);
											System.out.println(" (03] Player distance is 		: " +  highest );
											System.out.println("---------------------------------------------------");
										}
									}		
									System.out.println("\n"+"[11] - to countinue" + "\n" + "[22] - END");
									user=input.next();
									break;
										
								  default:
									System.err.println("Invalid selection! Please select 5 , 6 and 7");
									selectWinner();
									user=input.next();
								}
					}
				}
				
		  public void selectedPlayer(){
			
						 switch(user){
							 case "4":
								 System.out.println("\n Enter player number:");
								 int detail=input.nextInt();
								 
								 System.out.println("Player number is		  : " + collectionOfPlayers[detail - 1].playerNum);
								 System.out.println("Player name is			  : " + collectionOfPlayers[detail - 1].playerName);
								 System.out.println("Player age is			  : " + collectionOfPlayers[detail - 1].playerAge);
								 System.out.println("Player distance is		  : " + collectionOfPlayers[detail - 1].playerDistance);
								 System.out.println("Player coin collection is 	  : " + collectionOfPlayers[detail - 1].playerCoins);
								 System.out.println("Player score is 		  : " + collectionOfPlayers[detail - 1].playerScore);
								
								System.out.println("\n" + "[11] - to countinue" + "\n" + "[22] - END");
								user=input.next();
								break;
						}	
		  }
			  
		public void goToMenu(){
			
						switch(user){						
							case "11":
								display();
								break;
							case "22":
								System.exit(22);
								break;
								default:
									System.err.println("Invalid selection" + "\n");				
						}			
					}					
		}

						