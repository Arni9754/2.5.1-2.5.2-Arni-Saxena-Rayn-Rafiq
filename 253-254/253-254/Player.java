/*
 * 
 * 
 * A Player class the PhraseSolverGame
 */
// Names: Arni Saxena, Rayn Rafiq
import java.util.Scanner;

public class Player
{
  /* your code here - attributes */
  private String name = ""; //2.5.2 Step 4 Add Code
  private int points = 0; //2.5.2 Step 4 Add Code

  /* your code here - constructor(s) */ 
  public Player() { // 2.5.2 Step 7 Add Code
    System.out.println("What is your name? "); //2.5.2 Step 9 Add Code
    Scanner sc = new Scanner(System.in); //2.5.2 Step 9 Add Code
    String inputtedName = sc.nextLine(); //2.5.2 Step 9 Add Code
    name = inputtedName; //2.5.2 Step 9 Add Code
    System.out.println("Welcome, "+inputtedName+"!"); //2.5.2 Step 9 Add Code
    int points = 0; //2.5.2 Step 12 Add Code
  }

  public Player(String inputName) { //2.5.2 Step 10 Add Code
    inputName = name;  //2.5.2 Step 11 Add Code
    int points = 0; //2.5.2 Step 12 Add Code
    System.out.println("Welcome, "+inputName+"!"); //2.5.2 Step 11 Add Code

  }

  public int getPoints() { //2.5.3 Step 2 Add Code
    return points; //2.5.3 Step 8 Add Code
  } 

  public void setName() { //2.5.3 Step 2 Add Code
    /*incomplete */
  }

  public String getName() { //2.5.3 Step 2 Add Code
    return name; //2.5.3 Step 8 Add Code
  }  

  public void setPoints(int value) { //2.5.3 Step 2 Add Code (addToPoints in PLTW example)
    /*incomplete */
  }


  /* your code here - accessor(s) */ 
  public String toString() { //2.5.3 Step 8 Add Code
    return "Name: " + getName() + ", Total Points: "+getPoints(); //2.5.3 Step 8 Add Code
  }


  


  /* your code here - mutator(s) */ 
}
