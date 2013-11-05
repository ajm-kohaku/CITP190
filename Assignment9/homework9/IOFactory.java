package homework9;

public class IOFactory
{
    // this method maps the ConsoleIO interface
    // to the appropriate data storage mechanism
    public static ConsoleIO getConsoleIO()
    {
        ConsoleIO cIO = new MyConsole();
        return cIO;
    }
}
