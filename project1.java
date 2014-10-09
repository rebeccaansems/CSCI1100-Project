import java.util.Scanner;

/*
 * CSCI 1100 - Project 1
 * Educational Game
 * Due Date: 2014/10/27 
 * 
 * Authors:
 * Matt Smith
 * Becky Ansems
 * Pascha Love-Protter
 * Adbullah Negahban
 * 
 */
public class project1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Welcome to <INSERT GAME NAME HERE>!\nHow many players are playing?");
		int numOfPlayers = s.nextInt(); //This is the int assigned to the number of players playing.
		
		int playerArray[] = new int[numOfPlayers];
		
		int i=0; //this is the index for the While loop. 
		int j; //this is the index for the question number inside the while loop.
		int score=0; //this keeps track of the score inside the while loop. at the end of the loop it is assigned to playerArray for each player number.
		
		int answer[] = new int[1]; //CHANGE THIS NUMBER [0] WHEN YOU ADD MORE QUESTIONS!!!!! 
		
		
		while (i < numOfPlayers){
			j=0;
			System.out.println("\n\nIt is now player " + (i+1) + "'s turn.");
			
			//This is the start of question 1. Copy and paste this section of code to create more questions.
			//Keep in mind the variable 
			System.out.println("\n\nHello Player "+(i+1)+"!\n<INSERT QUESTION HERE> \nChoose answer 1, 2, 3, or 4.		\nChoice 1:	\nChoice 2:	\nChoice 3:	\nChoice 4:");
			System.out.print("The answer is choice number: ");
			answer[j] = s.nextInt();
			if (answer[j] == 2)/*<-- CHANGE THIS VALUE WHEN YOU COPY AND PASTE IT TO ADD QUESTIONS.*/	{
				System.out.println("Correct!");
				score+=10;
			}
			else{
				System.out.println("WRONG.");
			}
			answer[j] = 0;
			j++;
			//END OF QUESTION 1.
			
			
			
			//The following code completes the while loop before it repeats. 
			playerArray[i] = score;
			i++;
		}
		
		
		// THIS PART OF THE PROGRAM AND BELOW IS BROKEN. YELL AT MATT TO FIX IT.
		i=0;
		j=0;
		System.out.println("\n\n\n\n\nSCORES");
		while (i < numOfPlayers){
			while (j < numOfPlayers){
				if (playerArray[i] > playerArray[j])
					System.out.println("Rank: " + (i+1) + "\t\tPlayer number: " + (j+1) + "\t\tPlayer Score: " + playerArray[i]);
				j++;
			}
			i++;
		}

	}

}
