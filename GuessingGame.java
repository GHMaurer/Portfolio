

import java.util.Scanner;

public class GuessingGame
{
   static Scanner sc = new Scanner(System.in);
   
   public static void main(String[] args)
   {
         System.out.println("Let's Play A Guessing Game!");
         //A do-while loop will do everything in the block then or while it will ask for anouther round
         do
         {
            PlayARound();
         }
         while (askForAnotherRound());
         System.out.println("\nThank You For Playing!");
   }
   
   public static void PlayARound()
   {
      boolean validInput;
      int number, guess;
      String answer;
      
      //Pick a random number
      number = getRandomNumber();
      
      //Get the guess
      System.out.println("\nI'm thinking of a number " 
         + "between 1 and 10.");
      System.out.print("what do you think it is?");
      guess = getGuess();
      checkGuess(guess, number);
      //Check guess

}
public static int getRandomNumber()
{
   return (int)(Math.random() * 10) + 1;
}
//methood with parameter that returns a value 
public static void checkGuess(int num, int random)
{
   if (num == random)
   {
            System.out.println("you're right!");
   }
   else
   {
            System.out.println("You're wrong!");
   }

}
public static int getGuess()
{
   while (true)
   {
         int guess = sc.nextInt();
         if((guess < 1) || (guess > 10))
         {
            System.out.print("I said between 1 and 10."
               + "Try again:");
               
         }
         else
            return guess;
            
         }
    }
    
    public static boolean askForAnotherRound()
    {
      while (true)
         {
            String answer;
            System.out.print("\nPlay again? (Y or N) ");
            answer = sc.next();
           //will read upper or lower case character
           
            if (answer.equalsIgnoreCase("y"))
            
               return true;
            else if (answer.equalsIgnoreCase("n"))
               return false;
           
         }
       }
     }       
