import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors2 {
 public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
   Random random = new Random(); 


int playerWins = 0;
int ComputerChoice = 0;

System.out.println("Let's Play Rock Paper Scissors!");

 while (true) {
            System.out.println("Enter your choice: rock, paper, scissors ");

 String playerChoice = input.nextLine();           
 int computerChoice = random.nextLine();
                  
 if (computerChoice == 0) {
                computerChoice = "rock";
  }  else if (computerChoice == 1) {
                computerChoice = "paper";
  } else if (comuterChoice == 2) {
                computerChoice = "scissors";
    }
 System.out.println("Computer chose: " + computerChoice);

if (playerChoice == rock) && (computerChoice == rock) {
                System.out.println("It's a tie!");
   } else if (playerChoice == rock) && (computerChoice == scissors) {
                System.out.println("You win!");
                playerWins++;
   } else if (playerChoice == paper) && (computerChoice == rock) {
                System.out.println("You win!");
                playerWins++;
   } else if (playerChoice == scissors) && (computerChoice == paper) {
                System.out.println("You win!");
                playerWins++;
   } else computerChoice == scissors) && (playerChoice == paper) {
                System.out.println("Computer wins!");
                computerWins++;
   }

 if (playerWins > 2 * computerWins || computerWins > 2 * playerWins) {
                break;
            }
  System.out.println("Final score: Player  " + playerWins + ", Computer  " + computerWins);
   if (playerWins > computerWins) {
            System.out.println("You win the game!");
   } else {
            System.out.println("Computer wins the game!");
      }
 
 input.close();
  
  }
}

