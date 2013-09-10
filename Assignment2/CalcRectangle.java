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
* Filename:   AMurphyWB21.java
* Assignment: Workbook 2-1
* Summary:    Calculate the area and parameter of a triangle.
********************************************************************************
*/
package calcrectangle;

import java.util.Scanner;

public class CalcRectangle 
{
    public static void main(String[] args) 
    {

        String choice = "y";
        while (choice.equalsIgnoreCase("y"))
        {
            //display opening message
            System.out.println("Welcome to the rectangle calculator");
            System.out.println(); //print a blank line

            //get the input from the user
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Length:   ");
            double length = sc.nextDouble();
            System.out.print("Enter Width:    ");
            double width = sc.nextDouble();

            //calculate the area and perimiter
            double area = width * length;
            double parameter = 2 * width + 2 * length;

            //output results to console
            System.out.println("Area:           " + area);
            System.out.println("Parameter:      " + parameter);
            
            // see if the user wants to continue
            System.out.print("Continue? (y to continue or anything else to exit): ");
            choice = sc.next();
            System.out.println();
        }
    }
}
