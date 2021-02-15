
/* 
Mini Project 1
Group #8: Alec Rezelj, Jason Morgner, Rolando Mendez, Stewart Shumrick
Date: Febuary 15, 2021
*/

import java.util.Random;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Random r = new Random();
    Scanner s = new Scanner(System.in);
    // Above is creating new scanner and random objects.

    int userNum;
    int r_randomNum;
    // Above is creating variables.

    System.out.println("Welcome to the guessing game! \nPlease enter any positive whole number: ");
    userNum = s.nextInt();
    // Above is creating user interface.

    r_randomNum = r.nextInt(userNum);
    // Above is creating the random number for the user to guess.

    System.out.println("A random number to guess has been generated");

    playGame(userNum, r_randomNum);
    // Above is initiating gameplay.

    s.close();
  }

  public static void playGame(int userNum, int r_randomNum) {

    Scanner c = new Scanner(System.in);
    //Above is creating a new scanner for the new method.

    int userGuess;
    int numTries = 1;
    //Above is creating variables.

    System.out.println("Please guess a number between 0 and " + userNum);
    userGuess = c.nextInt();
    //Above is the PlayGame user interface.

    while (userGuess != r_randomNum) {
      if (userGuess < r_randomNum) {
        System.out.println("Guess higher! \nEnter your new guess:");
        userGuess = c.nextInt();
        numTries++;
      }
      if (userGuess > r_randomNum) {
        System.out.println("Guess lower! \nEnter your new guess:");
        userGuess = c.nextInt();
        numTries++;
      }
    }
    if (userGuess == r_randomNum) {
      System.out.println("Great, you win! It took you " + numTries + " tries.");
    }
    c.close();
  }
}