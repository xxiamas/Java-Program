//Program to calculate multiplication of two numbers
import java.io.Console;
class Multiplication {
    public static void main(String args[]) {
        Console c = System.console();
        String s1 = c.readLine("Enter 1st Number :");
        String s2 = c.readLine("Enter 2nd Number :");

        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);

        System.out.println(n1 * n2);
    }
    
}
