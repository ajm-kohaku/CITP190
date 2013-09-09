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
************************************************
* Programmer: Amber Murphy
* Course:     CITP 190: Fall 2013
* Filename:   Amurphyh1.java
* Assignment: Handout1
* Summary:    Create print line of hello world!
************************************************
*/
package amurphywb2.pkg1;

import java.util.Scanner;

public class AMurphyWB21 
{
    public static void main(String[] args) 
    {
        //display opening message
        System.out.println("Welcome to the rectangle calculator");
        System.out.println(); //print a blank line
        
        //get the input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length:     ");
        double length = sc.nextDouble();
        System.out.println("Enter Width:    ");
        double width = sc.nextDouble();
        
        //calculate the area and perimiter
        double area = width * length;
        double parameter = 2 * width + 2 * length;
        
        //output results to console
        System.out.println("Area:           " + area);
        System.out.println("Parameter:      " + parameter);
        
    }
}
