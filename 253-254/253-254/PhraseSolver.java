/*
 * 
 *
 *  The PhraseSolver class the PhraseSolverGame
 */
// Names: Arni Saxena, Rayn Rafiq
import java.util.Scanner;
  
public class PhraseSolver
{
  /* your code here - attributes */
  private String phrase = ""; //2.5.2 Step 4 Add Code
  private int randomPointsPerCharacter = 0; //2.5.2 Step 4 Add Code

  //Player player1 = new Player(); //2.5.2 Step 4 Add Code, //Step 16 Modify Code
  //Player player2 = new Player(); //2.5.2 Step 4 Add Code, //Step 16 Modify Code
  
  boolean isSolved = false; //Modified Code

  /* your code here - constructor(s) */ 
  public PhraseSolver() { //2.5.2 Step 7 Add Code
    
    Board board = new Board(); //2.5.2 Step 8 Add Code, //2.5.2 Step 16 Modify Code
    isSolved = false;   //2.5.2 Step 8 Add Code, //2.5.2 Step 16 Modify Code

    
  }

  /* your code here - accessor(s) */
 

  /* your code here - mutator(s)  */

  public void play()
  {
    boolean solved = false;
    int currentPlayer = 1;

    Scanner input = new Scanner(System.in);
    
    boolean correct = true;
    while (!solved) 
    {
      
      /* your code here - game logic */
      Player player1 = new Player(); //2.5.2 Step 8 Add Code, //2.5.2 Step 16 Modify Code, //2.5.3 Step 9 Modify Code
      Player player2 = new Player(); //2.5.2 Step 8 Add Code, //2.5.2 Step 16 Modify Code, //2.5.3 Step 9 Modify Code
      System.out.println(player1.toString()); //2.5.3 Step 9 Add Code

      System.out.println("Number of Points for this character: " + randomPointsPerCharacter);
      System.out.println("Current phrase: "+ phrase);
      
      /* your code here - determine how game ends */
      solved = true; 
    } 
   
  }
  
}
