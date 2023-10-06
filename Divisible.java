//Program to check the numbers 5 & 7 Divisible by user number or not
import java.io.Console;
class Divisible {
    public static void main(String args[]){
        Console c=System.console();
        String s=c.readLine("Enter any number");
        int n=Integer.parseInt(s);
        if(n%5==0 && n%11==0){
            System.out.println("divisible");

        }
        else
        System.out.println("Not Divisible");
    }
}
