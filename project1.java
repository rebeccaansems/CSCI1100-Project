import java.util.Scanner;
import java.util.Arrays;

/*
 * CSCI 1100 - Project 1
 * Educational Game
 * Due Date: 2014/12/02 
 * 
 * Authors:
 * Matt Smith
 * Rebecca Ansems
 * Pascha Protter
 * Adbullah Negahban
 * 
 */
 
public class project1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Welcome to <INSERT GAME NAME HERE>!\nHow many players are playing?");
		int numOfPlayers = s.nextInt(); //This is the int assigned to the number of players playing.
      int numOfQuestions = 2; //This is the int assigned to number of questions
		
		int playerArray[] = new int[numOfPlayers];
      int correct[] = new int[numOfQuestions];
      String question[][] = new String[numOfQuestions][5];
		
		int answer;
      int score=0;
		
      
      //Question 1
      question[0][0] = "(20 - 7) x 12 - 5?";
      question[0][1] = "156";
      question[0][2] = "151";//Correct
      question[0][3] = "60";
      question[0][4] = "148";
      correct[0] = 2;
      
      //Question 2
      question[1][0] = "(12 + 5) + 15 ÷ 5?";
      question[1][1] = "17";
      question[1][2] = "3";
      question[1][3] = "18";
      question[1][4] = "20";//Correct
      correct[1] = 4;
      
      //Question 3
		
		for (int i=0;i<numOfPlayers;i++){
         for (int q=0;q<numOfQuestions;q++){
			   answer = 0;
            score = 0;
			   System.out.println("\n\nIt is now player " + (i+1) + "'s turn.");
			
			   System.out.println("\n\nHello Player "+(i+1)+"! " + question[q][0] + " \nChoose answer 1, 2, 3, or 4.");
            System.out.println("Answer 1: " + question[q][1]);
            System.out.println("Answer 2: " + question[q][2]);
            System.out.println("Answer 3: " + question[q][3]);
            System.out.println("Answer 4: " + question[q][4]);
			   System.out.print("The answer is choice number: ");
			   answer = s.nextInt();
			   if (answer == correct[q]){
				   System.out.println("Correct!");
				   score+=10;
			   }
			   else{
				   System.out.println("WRONG.");
			   }
			   answer = 0;

			   //The following code completes the while loop before it repeats. 
			   playerArray[i] += score;
         }
		}
   scores(numOfPlayers, playerArray);
   }
		
   public static void scores(int numOfPlayers, int[] playerArray) {//method for scores 
		System.out.println("\n\n\n\nSCORES");
      for(int i=0;i<numOfPlayers;i++){
         System.out.print("Player " + (i+1) + ": ");
         System.out.println(playerArray[i]);
         }
      }
      
    }
