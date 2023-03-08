import javax.swing.*;
import java.util.Locale;

//i dont need this but ill keep it here
public class Words
{
    public static void main(String[] args)
    {
        String hello = "Hello me :)";
        int numberOfCharacters = hello.length();
        System.out.println(numberOfCharacters);

        String words = "Words";
        String bigwords = words.toUpperCase();
        System.out.println(bigwords);

        String river = "Mississippi";
        System.out.println(river);
        String newriver = river.replace("issipp", "our");
        System.out.println(newriver);

        String greeting = "Greeting";
        System.out.println(greeting);
        String newgreeting = greeting.replace("e","3");
        System.out.println(newgreeting);
        var x = greeting.length();
        System.out.println(x);
    }
}
