/*
 * Activity 2.5.2
 *
 *  The PhraseSolver class the PhraseSolverGame
 */
// Names: Arni Saxena, Rayn Rafiq
import java.util.Scanner;
  
public class PhraseSolver
{
  /* your code here - attributes */
  private String phrase = ""; //Step 4 Add Code
  private int randomPointsPerCharacter = 0; //Step 4 Add Code

  //Player player1 = new Player(); //Step 4 Add Code, //Step 16 Modify Code
  //Player player2 = new Player(); //Step 4 Add Code, //Step 16 Modify Code
  
  boolean isSolved = false; //Modified Code

  /* your code here - constructor(s) */ 
  public PhraseSolver() { //Step 7 Add Code
    Player player1 = new Player(); //Step 8 Add Code, //Step 16 Modify Code
    Player player2 = new Player(); //Step 8 Add Code, //Step 16 Modify Code
    Board board = new Board(); //Step 8 Add Code, //Step 16 Modify Code
    isSolved = false;   //Step 8 Add Code, //Step 16 Modify Code

    
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
      
      
      /* your code here - determine how game ends */
      solved = true; 
    } 
   
  }
  
}
