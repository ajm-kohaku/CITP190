/*
 * ASCII Signature: AJM
 *                  ,.     ,.
 *                 {^ \-"-/ ^}
 *                 "   """   "
 *                { <O> _ <O> }
 *                ==_ .:Y:. _==
 *              .""  `--^--' "".
 *             (,~-~."" "" ,~-~.)
 *       ------(     )----(     )-----
 *             ^-'-'-^    ^-'-'-^
 *       _____________________________
 *             |"""" /~.^.~\ """"|
 *       hjw    ,i-i-i(""(  i-i-i.
 *       `97   (o o o ))"")( o o o)
 *              \(_) /(""(  \ (_)/
 *               `--'  \""\  `--'
 *                      )"")
 *                     (""/
 *                      `"
 */

package com.company;

import java.util.Scanner;

public class PersonApp
{
    public static void main(String[] args)
    {
        //display welcome message
        System.out.println("Welcome to the Person Tester application\n");

        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y"))
        {
            //request person type from user
            String personType = Validator.getString(sc, "Create customer or employee? (c/e): ", "c", "e");

            //get common data from user
            String firstName = Validator.getString(sc, "\nEnter first name: ");
            String lastName = Validator.getString(sc, "Enter last name: ");
            String emailAddress = Validator.validateEmail(sc, "Enter email address: ");
            
            if (personType.equalsIgnoreCase("c")) 
            {
                String customerNumber = Validator.getString(sc, "Enter customer number: ");
                Customer c = new Customer();
                c.setFirstName(firstName);
                c.setLastName(lastName);
                c.setEmailAddress(emailAddress);
                c.setCustomerNumber(customerNumber);

                print(c);
            }
                        
            else if (personType.equalsIgnoreCase("e"))
            {
                String ssn = Validator.validateSsn(sc, "Enter Social Security Number: ");
                Employee e = new Employee();
                e.setFirstName(firstName);
                e.setLastName(lastName);
                e.setEmailAddress(emailAddress);
                e.setSsn(ssn);

                print(e);
            }
            choice = ValidatorOld.getString(sc, "Continue? (y/n): ", "y", "n");
        }
    }
    private static void print(Person p)
    {
        System.out.println("\nYou entered: ");
        System.out.println(p.getDisplayText());
    }
}
