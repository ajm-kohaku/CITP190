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
*             CircleApp class: accepts user input and validates responses by calling Validator class.
*             takes user input and passes to the Circle class to calculate area and circumference.
*             asks user to continue and provides count of the number of objects created.
********************************************************************************
*/
package com.company;

import java.util.Scanner;

public class CircleApp
{
    public static void main(String args[])
    {
        //display a welcome message
        System.out.println("welcome to the Circle Tester \n");

        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equals("y"))
        {
            //get the input from the user
            double radius = Validator.getDouble(sc, "Enter radius: \t");

            //create the Circle object and set its fields
            Circle circle = new Circle();
            circle.setRadius(radius);

            //get the Circumference and Area data
            circle.getCircumference();
            circle.getArea();

            //display the output
            System.out.println("Circumference:\t" + circle.getFormattedCircumference());
            System.out.println("Area:\t\t\t" + circle.getFormattedArea());

            //see if the user wants to continue
            choice = Validator.getString(sc, "\nContinue? (y/n): ","y","n");
            System.out.println();

        }
        int count = Circle.getObjectCount();
        System.out.println("Goodbye. You created " + count + " Circle object(s).");
    }
}
