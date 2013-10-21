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
* Filename:   Circle.java
* Assignment: Workbook 7-2
* Summary:    Calculate a circle's circumference and area.
*             Validator Class: that validates input is in the correct format.
*             for String inputs: validates value entered is a String, does not accept a blank line.
*             second String input allows for additional validation be 2 specific entries. (i.e. yes or no)
*             for Integer and Double inputs: validates value is either int or double based on called method.
*               does not accept a blank line.
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
    public static double getDouble(Scanner sc, String prompt)
    {
        double guess = 0;
        String temp;
        boolean isValid = false;
        while (!isValid)
        {
            temp = getString(sc,prompt);
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
        return guess;
    }
}