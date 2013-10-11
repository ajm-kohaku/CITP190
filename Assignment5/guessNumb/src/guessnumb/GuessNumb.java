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
import java.util.Scanner;
public class GuessNumb
{
    public static void main(String[] args)
    {
        //print welcome message
        System.out.println("\n Welcome to the Guess the Number Game \n" +
                           "++++++++++++++++++++++++++++++++++++ \n");

        Scanner sc = new Scanner(System.in);

        String choice = "y";
        while (choice.equalsIgnoreCase("y"))
        {
            System.out.println("\nI'm thinking of a number from 1 to 100. \n" +
                               "Try to guess it.\n");

            int rand = (int) (Math.random() * 100);
            //disable printout of computer generated value when not testing
//            System.out.print("Computer Generated: " + rand + "\n");

            //initialize variables
            int cntr = 0;
            int guess = 0;

            //loop to validate answer while random number doesn't equal input
            while (guess != rand)
            {
                guess = getIntWithinRange(sc, "Enter number: \t", 0, 100);
                String results = getResults(rand, guess);
                System.out.println(results);
                cntr ++;
            }
            //get and publish results
            System.out.println("You got it in " + cntr + " tries.\n");
            String rating = getRating(cntr);
            System.out.println(rating);

            //find out if user wants to continue
            boolean isValid = false;
            while (!isValid)
            {
                //get user input
                System.out.print("Try again? (y/n): \t");
                choice = sc.nextLine();
                //verify entered value is valid
                if (choice.isEmpty())
                {
                    System.out.println("Error! This entry is required. Try again.");
                    isValid = false;
                }
                else if (choice.equalsIgnoreCase("y") ||
                         choice.equalsIgnoreCase("n"))
                {
                    isValid = true;
                }
                else
                {
                    System.out.println("Error! Entry must be 'y' or 'n. Try again.");
                    isValid = false;
                }

            }
        }
        System.out.print("\n Bye - Come back soon!");
    }
    public static int getIntWithinRange(Scanner sc, String prompt, int min, int max)
    {
        int guess = 0;
        boolean isValid = false;
        while (!isValid)
        {
            guess = getInt(sc, prompt);
            if (guess <= min)
                System.out.println("Error! Number must be greater than or equal to " + (min + 1) + ".");
            else if (guess >= max)
                System.out.println("Error! Number must be less than or equal to " + max + ".");
            else
                isValid = true;
        }
        return guess;
    }
    public static int getInt(Scanner sc, String prompt)
    {
        int guess = 0;
        String temp;
        boolean isValid = false;
        while (!isValid)
        {
            System.out.print(prompt);
            temp = sc.nextLine();
            if (temp.isEmpty())
            {
                System.out.println("Error! An entry is required. Try again.");
                isValid = false;
            }
            else
            {
                try
                {
                    guess = Integer.parseInt(temp);
                    isValid = true;
                }
                catch (NumberFormatException e)
                {
                    System.out.println("Error! Value must be an integer. Try again");
                    isValid = false;
                }
            }
        }
        return guess;
    }
    public static String getResults(int rand, int guess)
    {
        String results;
        if (guess > (rand + 10))
            results = "Way too high! Guess again.";
        else if (guess >= (rand + 1) || guess >= (rand + 10) )
            results = "Too high! Guess again.";
        else if (guess < (rand - 10))
            results = "Way too low! Guess again.";
        else if (guess <= (rand - 1) || guess < (rand - 10) )
            results = "Too low! Guess again.";
        else if (guess == rand)
            results = "Spot On!";
        else
            results = "One of the else ifs are off in getResults";
        return results;
    }
    public static String getRating(int cntr)
    {
        String rating;
        if (cntr <= 3)
            rating = "Great work! You are a mathematical wizard.";
        else if (cntr > 3 && cntr <= 7)
            rating = "Not too bad! You've got some potential.";
        else if (cntr > 7)
            rating = "What took you so long? Maybe you should take some lessons";
        else
            rating = "Somehow words can't describe how good you are.";
        return rating;
    }
}
