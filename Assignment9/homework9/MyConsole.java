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
package homework9;

import java.util.Scanner;

public class MyConsole implements ConsoleIO
{

    private static Scanner sc = null;
    public MyConsole()
    {
         sc = new Scanner(System.in);
    }


    @Override
    public int getInt(Scanner sc, String prompt) {
        int digit = 0;
        String temp;
        boolean isValid = false;
        while (!isValid)
        {
            temp = getString(prompt);
            try
            {
                digit = Integer.parseInt(temp);
                isValid = true;
            }
            catch (NumberFormatException e)
            {
                System.out.println("Error! Entry must be an integer. try again.");
            }
        }
        return digit;
    }

    @Override
    public int getInt(String prompt, int min, int max) {
        int digit = 0;
        boolean isValid = false;
        while (!isValid)
        {
            digit = getInt(sc, prompt);
            if (digit <= min)
                System.out.println("Error! Number must be greater than " + min + ".");
            else if (digit >= (max-1))
                System.out.println("Error! Number must be less than " + max + ".");
            else
                isValid = true;
        }
        return digit;
    }

    @Override
    public double getDouble(Scanner sc, String prompt) {
        double digit = 0;
        String temp;
        boolean isValid = false;
        while (!isValid)
        {
            temp = getString(prompt);
            try
            {
                digit = Double.parseDouble(temp);
                isValid = true;
            }
            catch (NumberFormatException e)
            {
                System.out.println("Error! Entry must be a Double. try again.");
            }
        }
        return digit;
    }

    @Override
    public double getDouble(String prompt, double min, double max) {
        double digit = 0;
        boolean isValid = false;
        while (!isValid)
        {
            digit = getDouble(sc, prompt);
            if (digit <= min)
                System.out.println("Error! Number must be greater than " + min + ".");
            else if (digit >= (max-1))
                System.out.println("Error! Number must be less than " + max + ".");
            else
                isValid = true;
        }
        return digit;
    }

    @Override
    public String getBaseString(Scanner sc, String prompt) {
        String temp;
        System.out.print(prompt);
        temp = sc.nextLine();
        return temp;
    }
    
    @Override
    public String getString(String prompt) {
            String temp = "";
            boolean isValid = false;
            while (!isValid)
            {
                temp = getBaseString(sc, prompt);
                if (temp.isEmpty())
                    System.out.println("Error! An entry is required. Try again.");
                else
                    isValid = true;
            }
            return temp;
        }

    @Override
    public String getString(String prompt, String s1, String s2) {
        String temp = null;
        boolean isValid = false;
        while (!isValid)
        {
            temp = getString(prompt);
            if (temp.equalsIgnoreCase(s1) || temp.equalsIgnoreCase(s2))
                isValid = true;
            else
                System.out.println("Error! Entry must be '"+s1+"' or '"+s2+"'. Try again.");
        }
        return temp;
    }

    @Override
    public String getString(String prompt, String s1, String s2, String s3) {
        String temp = null;
        boolean isValid = false;
        while (!isValid)
        {
            temp = getString(prompt);
            if (temp.equalsIgnoreCase(s1) || temp.equalsIgnoreCase(s2) || temp.equalsIgnoreCase(s3))
                isValid = true;
            else
                System.out.println("Error! Entry must be '"+s1+"', '"+s2+"', or '"+s3+"'. Try again.");
        }
        return temp;
    }

    @Override
    public String validateEmail(String prompt) {
        String email = "";
        boolean isValid = false;
        while (!isValid)
        {
            email = getString(prompt);
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

    @Override
    public void print(String s) {
        System.out.print(s + "\n");
    }

    @Override
    public void println(String prompt) {
        System.out.print(prompt + "\n");
    }

    @Override
    public void print() {
        System.out.print("\n");
    }
}
