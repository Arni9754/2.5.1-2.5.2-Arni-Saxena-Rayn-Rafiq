/*
 *
 *
 * A Board class the PhraseSolverGame
 */
// Names: Arni Saxena, Rayn Rafiq
import java.io.File;
import java.util.Scanner;

public class  Board
{
  private String solvedPhrase;
  private String phrase;
  private int currentLetterValue; 

  /* your code here - constructor(s) */ 
  public Board() { //2.5.2 Step 7 Add Code
    solvedPhrase = "";  //2.5.2 Step 8 Add Code
    phrase = ""; //2.5.2 Step 8 Add Code
    //currentLetterValue = 0; //2.5.2 Step 8 Add Code, //2.5.2 Step 15 Modify Code
    setLetterValue(); //2.5.2 Step 15 Modify Code
    phrase = loadPhrase(); //2.5.2 Step 15 Modify Code

    System.out.println("Phrase: "+phrase); //2.5.2 Step 15 Add Code
  }



  public String getSolvedPhrase() { //2.5.3 Step 8 Add Code
    return solvedPhrase; //2.5.3 Step 8 Add Code
  }

  public String getPhrase() { //2.5.3 Step 8 Add Code
    return phrase; //2.5.3 Step 8 Add Code
  }

  public int getCurrentLetterValue() {//2.5.3 Step 8 Add Code
    return currentLetterValue; //2.5.3 Step 8 Add Code  
  }
  /* your code here - accessor(s) */
  public String toString() {
    return getSolvedPhrase() + getPhrase() + getCurrentLetterValue();
  }
  /* your code here - mutator(s)  */


  /* ---------- provided code, do not modify ---------- */
  public void setLetterValue()
  {
    int randomInt = (int) ((Math.random() * 10) + 1) * 100;    
    currentLetterValue = randomInt;
  }

  public boolean isSolved(String guess)
  {
    if (phrase.equals(guess))
    {
      return true;
    }
    return false;
  }

  private String loadPhrase()
  {
    String tempPhrase = "";
    
    int numOfLines = 0;
    try 
    {
      Scanner sc = new Scanner(new File("251-252\\phrases.txt"));
      while (sc.hasNextLine())
      {
        tempPhrase = sc.nextLine().trim();
        numOfLines++;
      }
    } catch(Exception e) { System.out.println("Error reading or parsing phrases.txt"); }
    
		int randomInt = (int) ((Math.random() * numOfLines) + 1);
    
    try 
    {
      int count = 0;
      Scanner sc = new Scanner(new File("251-252\\phrases.txt"));
      while (sc.hasNextLine())
      {
        count++;
        String temp = sc.nextLine().trim();
        if (count == randomInt)
        {
          tempPhrase = temp;
        }
      }
    } catch (Exception e) { System.out.println("Error reading or parsing phrases.txt"); }
    
    for (int i = 0; i < tempPhrase.length(); i++)
    {
      if (tempPhrase.substring(i, i + 1).equals(" "))
      {
        solvedPhrase += "  ";
      }  
      else
      {
        solvedPhrase += "_ ";
      }
    }  
    
    return tempPhrase;
  }  


  /*
   * 2.5.3 Step 4 Add comment: Checks if the user entered a corrrect guess
   * 2.5.3 Step 4 Add comment: Precondition: phrases.txt exists and is not empty, user has inputted a guess,  which is iterated on here
   * 2.5.3 Step 4 Add comment: Postcondition: newSolvedPhrase is added on to, foundLetter is returned, if user guesses correctly, the letter is displayed to the user in the area where it is in the phrase
   */

  // 2.5.3 Step 3 Add comment: Declares the class, sets it to public, sets its output to a boolean value, and takes a String input
  public boolean guessLetter(String guess)
  {
    // 2.5.3 Step 3 Add comment: initializes foundLetter and sets it to false, is default value
    boolean foundLetter = false;
    // 2.5.3 Step 3 Add comment: initializes newSolvedPhrase and sets it as an empty string, since at start of game there are no guesses
    String newSolvedPhrase = "";
    
    // 2.5.3 Step 3 Add comment: starts a for loop with int i initialized and set to zero, as long as i is less than the length of phrase, it will keep incrementing by one; iterates through the phrase to see if user guessed correctly or not
    for (int i = 0; i < phrase.length(); i++)
    {
      // 2.5.3 Step 3 Add comment: starts an if statement which checks if each character in phrase is what the player inputted as their guess, this if statement is if the user guessed correctly
      if (phrase.substring(i, i + 1).equals(guess))
      {
        // 2.5.3 Step 3 Add comment: concantenates user's guess to an empty space
        newSolvedPhrase += guess + " ";
        // 2.5.3 Step 3 Add comment: sets boolean foundLetter as true, since user guessed correctly
        foundLetter = true;
      }
      // 2.5.3 Step 3 Add comment: else statement which executes if user did not guess correctly
      else
      {
        // 2.5.3 Step 3 Add comment: Places the incorrect letters further away so that the user knows which guesses are taken
        newSolvedPhrase += solvedPhrase.substring(i * 2, i * 2 + 1) + " ";  
      }
    }
    // 2.5.3 Step 3 Add comment: Updates the phrase after the for loop finsihes checking for matched letters
    solvedPhrase = newSolvedPhrase;
    // 2.5.3 Step 3 Add comment: Returns foundLetter to be used in other places of the code
    return foundLetter;
  } 


  


} 
