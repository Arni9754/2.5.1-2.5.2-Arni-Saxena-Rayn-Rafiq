/*
 * Activity 2.5.2
 * 
 * A Player class the PhraseSolverGame
 */
// Names: Arni Saxena, Rayn Rafiq
import java.util.Scanner;

public class Player
{
  /* your code here - attributes */
  String name = ""; //Step 4 Add Code
  int points = 0; //Step 4 Add Code

  /* your code here - constructor(s) */ 
  public Player() { //Step 7 Add Code
    System.out.println("What is your name? "); //Step 9 Add Code
    Scanner sc = new Scanner(System.in); //Step 9 Add Code
    String inputtedName = sc.nextLine(); //Step 9 Add Code
    name = inputtedName; //Step 9 Add Code
    System.out.println("Welcome, "+inputtedName+"!"); //Step 9 Add Code
    int points = 0; //Step 12 Add Code
  } //Modified Code

  public Player(String inputName) { //Step 10 Add Code
    inputName = name;  //Step 11 Add Code
    int points = 0; //Step 12 Add Code
    System.out.println("Welcome, "+inputName+"!"); //Step 11 Add Code

  }//Modified Code

  /* your code here - accessor(s) */ 

  /* your code here - mutator(s) */ 
}
