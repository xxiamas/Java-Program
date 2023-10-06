//Program to print your first name middle name and last name
import java.io.Console;
class Name1
{
    public static void main(String args[])
    {
        Console c= System.console();
        String s1= c.readLine("Enter your first name :");//input from user to first name
        String s2= c.readLine("Enter your middle name :");//input from user to middle name
        String s3= c.readLine("Enter your last name :");//input from user to last name
        System.out.println("Your name is : " +s1 +" "+s2 +" " +s3);//print your name
    }

}