package homework9;

import java.util.Scanner;

public interface ConsoleInput
{
    // for int values
    int getInt(Scanner sc,String prompt);
    int getInt(String prompt, int min, int max);

    // for double values
    double getDouble(Scanner sc, String prompt);
    double getDouble(String prompt, double min, double max);

    // for strings
    String getBaseString(Scanner sc, String prompt);
    String getString(String prompt);
    String getString(String prompt, String s1, String s2);
    String getString(String prompt, String s1, String s2, String s3);
    String validateEmail(String prompt);


}