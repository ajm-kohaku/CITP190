package homework9;

public class CreateTestApp
{
    public static void main(String[] args)
    {
        ConsoleIO kohaku = IOFactory.getConsoleIO();

        //print welcome message
        kohaku.print("Welcome to the Console Test application.\n");

        kohaku.println("Int Test");
        kohaku.getInt("Enter an integer between -100 and 100:\t ", -100, 100);
        kohaku.print();

        kohaku.println("Double Test");
        kohaku.getDouble("Enter any number between -100 and 100: \t", -100,100);
        kohaku.print();

        kohaku.println("Required String Test");
        kohaku.getString("Enter a name:\t ");
        kohaku.print();

        kohaku.println("Email String Test");
        kohaku.validateEmail("Enter your email address:\t ");
        kohaku.print();

        kohaku.println("String Choice Test");
        kohaku.getString("Select one (x/y):\t\t", "x", "y");
        kohaku.print();
    }
}
