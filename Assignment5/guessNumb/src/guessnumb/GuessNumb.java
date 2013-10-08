/*
ASCII Signagure: AJM
                 ,.     ,.
                {^ \-"-/ ^}             
                "   """   "
               { <O> _ <O> }
               ==_ .:Y:. _==
             .""  `--^--' "".
            (,~-~."" "" ,~-~.)
      ------(     )----(     )-----
            ^-'-'-^    ^-'-'-^
      _____________________________
            |"""" /~.^.~\ """"|
      hjw    ,i-i-i(""(  i-i-i.
      `97   (o o o ))"")( o o o)
             \(_) /(""(  \ (_)/
              `--'  \""\  `--'
                     )"")
                    (""/
                     `"                            
********************************************************************************
* Programmer: Amber Murphy
* Course:     CITP 190: Fall 2013
* Filename:   GuessNumb.java
* Assignment: Workbook 5-3
* Summary:    Guess a Number from 1 to 100. Includes:
*             counting attempts, range validation, data type validation, 
*             and guess rating.
********************************************************************************
*/
package guessnumb;
import java.util.*;
public class GuessNumb 
{

    public static void main(String[] args) 
    {
        System.out.println("Welcome to: Guess that Number!");
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y"))
        {
            int rand = (int) (Math.random() * 100);
            
             //disable printout of computer generated value when not testing
            System.out.print("Computer Generated: " + rand);
            System.out.println(); 
            
            int cntr = 0;
            int guess = 0;
            
            while (guess != rand)
            {
                guess = getIntWithinRange(sc, "Make your guess: ", 0, 101);
                String results = getResults(rand, guess);
                System.out.println(results);
                cntr ++;
            }
            System.out.println("It took " + cntr + " guesses.");
            String rating = getRating(cntr);
            System.out.println(rating);
            // see if the user wants to continue
            boolean isValid = false;
            while (isValid == false)
            {
                //get user request
                System.out.print("Continue? y/n: \t");
                choice = sc.nextLine();
                if (choice.isEmpty() || choice.equals(""))
                {
                    System.out.println("Error! You must enter a value to continue. Try again");
                    isValid = false;
                }
                else
                {
                    isValid = true;
                }
                //validate choice
                if (isValid == true && choice.equalsIgnoreCase("y") ||
                    isValid == true && choice.equalsIgnoreCase("n"))
                {
                    isValid = true;
                }
                else 
                {
                    System.out.println("Please enter Y or N to continue. Try again");
                    isValid = false;
                }
            }

           
        }
        System.out.println("Good bye!");
    }
    public static int getIntWithinRange(Scanner sc, String prompt, int min, int max)
    {
        int guess = 0;
        boolean isValid = false;
        while (isValid == false)
        {
            guess = getInt(sc, prompt);
            if (guess <= min)
                System.out.println("Error! Number must be greater than " + min + ".");
            else if (guess >= max)
                System.out.println("Error! Number must be less than " + max + ".");
            else
                isValid = true;
        }
        
        return guess;
    }
    public static int getInt(Scanner sc, String prompt)
    {
        int guess = 0;
        boolean isValid = false;
        while (isValid == false)
        {
            System.out.print(prompt);
            if (sc.hasNextInt())
            {
                guess = sc.nextInt();
                isValid = true;
            }
            else
            {
                System.out.println("Error! Invalid integer value. Try again.");
            }
            sc.nextLine();
        }
        return guess;
    }

    public static String getResults(int rand, int guess)
    {
        String results;
        if (guess > (rand + 24))
        {
            results = "Way too high! Guess again.";
        }
        else if (guess >= (rand + 1) || guess >= (rand + 25) )
        {
            results = "Too high! Guess again.";
        }
        else if (guess < (rand - 24))
        {
            results = "Way too low! Guess again.";
        }
        else if (guess <= (rand - 1) || guess < (rand - 25) )
        {
            results = "Too low! Guess again.";
        }
        else if (guess == rand)
        {
            results = "Spot On!";
        }
        else 
        {
            results = "One of the else if's are off in getResults";
        }
        
        return results;
        
    }
    
    public static String getRating(int cntr)
    {
        String rating;
        if (cntr < 4)
            rating = "You're pretty good at this!";
        else if (cntr > 3 && cntr < 8)
            rating = "You've got some potential. Keep it up!";
        else if (cntr > 7)
            rating = "You, mon frier need some work at guessing games.";
        else
            rating = "Somehow words can't describe how good you are.";
        return rating;
    }
}
   