//Simple Java Program to Print Your Name
import java.io.Console;
class Name {
    public static void main(String args[])
    {
        Console c = System.console();
        String s = c.readLine("Enter your name:");//input from user
        System.out.println("Your name is "+s);//printing name

    }
}
