/*
ASCII Signature: AJM
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
* Filename:   Validator.java
* Assignment: Workbook 7-2 +
* Summary:    Validator started in 7-2 and expanded as each additional assignment needs.
********************************************************************************
*/
package com.company;
import java.util.Scanner;

public class Validator
{
    public static String getString(Scanner sc, String prompt)
    {
        String temp = null;
        boolean isValid = false;
        while (!isValid)
        {
            System.out.print(prompt);
            temp = sc.nextLine();
            if (temp.isEmpty())
                System.out.println("Error! An entry is required. Try again.");
            else
                isValid = true;
        }
        return temp;
    }
    public static String getString(Scanner sc, String prompt, String yes, String no)
    {
        String temp = null;
        boolean isValid = false;
        while (!isValid)
        {
            temp = getString(sc,prompt);
            if (temp.equalsIgnoreCase(yes) ||temp.equalsIgnoreCase(no))
                isValid = true;
            else
                System.out.println("Error! Entry must be '"+yes+"' or '"+no+"'. Try again.");
        }
        return temp;
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
                System.out.println("Error! An entry is required. Try again.");
            else
            {
                try
                {
                    guess = Integer.parseInt(temp);
                    isValid = true;
                }
                catch (NumberFormatException e)
                {
                    System.out.println("Error! Entry must be an integer. try again.");
                }
            }
        }
        return guess;
    }

    public static int getInt(Scanner sc, String prompt,int min, int max)
    {
        int guess = 0;
        boolean isValid = false;
        while (!isValid)
        {
            guess = getInt(sc, prompt);
            if (guess < min)
                System.out.println("Error! Number must be greater than " + min + ".");
            else if (guess > (max-1))
                System.out.println("Error! Number must be less than " + max + ".");
            else
                isValid = true;
        }
        return guess;
    }

    public static double getDouble(Scanner sc, String prompt)
    {
        double guess = 0;
        String temp;
        boolean isValid = false;
        while (!isValid)
        {
            System.out.print(prompt);
            temp = sc.nextLine();
            if (temp.isEmpty())
                System.out.println("Error! An entry is required. Try again.");
            else
            {
                try
                {
                    guess = Double.parseDouble(temp);
                    isValid = true;
                }
                catch (NumberFormatException e)
                {
                    System.out.println("Error! Entry must be a Double. try again.");
                }
            }
        }
        return guess;
    }

    public static double getDouble(Scanner sc, String prompt,int min, int max)
    {
        double guess = 0;
        boolean isValid = false;
        while (!isValid)
        {
            guess = getDouble(sc, prompt);
            if (guess < min)
                System.out.println("Error! Number must be greater than " + min + ".");
            else if (guess > (max-1))
                System.out.println("Error! Number must be less than " + max + ".");
            else
                isValid = true;
        }
        return guess;
    }

    public static String validateSsn(Scanner sc, String prompt)
    {
        String ssn  = "";
        int ssnLength;
        boolean isValid = false;
        while (!isValid)
        {
            ssnLength = getInt(sc,prompt);
            ssn = String.valueOf(ssnLength);
            if (ssn.length() == 9)
                isValid = true;

            else
                System.out.println("Error! SSN must be 9 digits. Try again.");
        }
        return ssn;
    }
    public static String validateEmail(Scanner sc, String prompt)
    {
        String email = "";
        boolean isValid = false;
        while (!isValid)
        {
            email = getString(sc,prompt);
            String castString = email.toLowerCase();

            if (castString.contains("@") && (castString.endsWith(".com") || castString.endsWith(".edu") || castString.endsWith(".org")))
            {
                isValid = true;
            }
            else
                System.out.println("Error! Email address must contain an '@' symbol. \n" +
                        "And end with .edu, .com, .org, .ca, or .us. Please try again. \n");

        }
        return email;
    }
}