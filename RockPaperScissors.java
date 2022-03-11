import java.util.Random;
import java.util.Scanner;

class RockPaperScissors {
  public static void main(String[] args) {
  
    //declares variables
    int userInputInt = 0;
    int userNumGuess = 0;
    int userGuesses = 0;
    String userPlayAgain = "";
  
    //instance of random class
    Random rand = new Random();
    int min = 1;
    int max = 3;
    int int_random = (int) Math.floor(Math.random() * (max - min + 1) + min);
  
    // creates scanner object
    Scanner myObj = new Scanner(System.in);
  
    while (true) {
      // gets user guess
      System.out.println("Enter 1 for rock, 2 for paper or 3 for scissors");
      String userInput = myObj.nextLine();
    
      try {
        //convert string to int
        userInputInt = Integer.parseInt(userInput);
      } catch (NumberFormatException e) {
        userInputInt = -1;
      }

      if (userInputInt == 1 && int_random != 2) {
        System.out.println("You lose");
      } else if (userInputInt == 2 && int_random != 3) {
        System.out.println("You lose");
      } else if (userInputInt == 3 && int_random != 1) {
        System.out.println("You lose");
      } else {
        System.out.println("You win!");
      }
    
      System.out.println("Would you like to play again? (y/n)");
      userPlayAgain = myObj.nextLine();
    
      if ((userPlayAgain).equals("y") || (userPlayAgain).equals("Y")) {
        
      } else {
        System.out.println("Thanks for playing!");
        break;
      }
    }
  }
}