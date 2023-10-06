//Program to display book details and take details from the user
import java.io.Console;
public class BookDetails {
    public static void main(String args[]){
        Console c=System.console();
        String s1=c.readLine("Enter book name:");
        String s2=c.readLine("Enter author name:");
        String s3=c.readLine("Enter publisher name:");
        System.out.println("Book details is------------>");
        System.out.println("Book name is:"+s1);
        System.out.println("Author name is:"+s2);
        System.out.println("Publisher name is:"+s3);
    }
}
