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
*             Circle Class: Class that does the actual calculations and conversions
*             for the ClassApp application level programme.
*             Get the Circumference (C), format C into a 2 precision decimal
*             Get the Area (A), format A into a 2 precision decimal
*             Use a sub-method to format the number and pass it to the precision methods
*             Get an Object count for the number of Circle objects created.
********************************************************************************
*/
package com.company;
import java.text.NumberFormat;
public class Circle
{
    private double radius;
    private double circumference;
    private double area;

    private static int objectCount = 0;

    public Circle()
    {
        radius = 0;
        objectCount++;
    }
    public Circle(double radius, double circumference, double area)
    {
        this.radius = radius;
        this.circumference = circumference;
        this.area = area;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }
    public double getRadius()
    {
        return radius;
    }
    public void setCircumference(double circumference)
    {
        this.circumference = circumference;
    }
    public void setArea(double area)
    {
        this.area = area;
    }

    public double getCircumference()
    {
        circumference = Math.PI * Math.pow(radius,2);
        return circumference;
    }
    public String getFormattedCircumference()
    {
        String numberString = this.formatNumber(circumference);
        return numberString;
    }
    public double getArea()
    {
        area = 2 * Math.PI * radius;
        return area;
    }
    public String getFormattedArea()
    {
        String numberString = this.formatNumber(area);
        return numberString;
    }
    private String formatNumber(double x)
    {
        NumberFormat number = NumberFormat.getInstance();
        number.setMaximumFractionDigits(2);
        String numberString = number.format(x);
        return numberString;
    }
    public static int getObjectCount()
    {
        return objectCount;
    }

}
