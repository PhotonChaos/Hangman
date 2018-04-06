import java.util.Random;
import java.util.Scanner;

public class CSGroupPojectAshvanthDashesAndMenu
{
    String secret;
    StringBuffer dashes;
    char letter;

    public CSGroupPojectAshvanthDashesAndDashesToLetters()
    {
        System.out.println("|===============================================================================================|");
        System.out.println("|                                               |                                               |");
        System.out.println("|                                               |                                               |");
        System.out.println("|                                               |                                               |");
        System.out.println("|                                               |                                               |");
        System.out.println("|                                               |                                               |");
        System.out.println("|                                               |                                               |");
        System.out.println("|                                               |                                               |");
        System.out.println("|                                               |                                               |");
        System.out.println("|                                               |                                               |");
        System.out.println("|                                               |                                               |");
        System.out.println("|                                               |                                               |");
        System.out.println("|                                               |                                               |");
        System.out.println("|                                               |                                               |");
        System.out.println("|                                               |                                               |");
        System.out.println("|                                               |                                               |");
        System.out.println("|                                               |                                               |");
        System.out.println("|                                               |                                               |");
        System.out.println("|                                               |                                               |");
        System.out.println("|                                               |                                               |");
        System.out.println("|                                               |                                               |");
        System.out.println("|                                               |                                               |");
        System.out.println("|                                               |                                               |");
        System.out.println("|                                               |                                               |");
        System.out.println("|                                               |                                               |");
        System.out.println("|                                               |                                               |");
        System.out.println("|                                               |                                               |");
        System.out.println("|                                               |                                               |");
        System.out.println("|                                               |                                               |");
        System.out.println("|                                               |                                               |");
        System.out.println("|                                               |                                               |");
        System.out.println("|                                               |                                               |");
        System.out.println("|                                               |                                               |");
        System.out.println("|_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_|_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_|");
    }

    public static void matchLetter(String secret, StringBuffer dashes, char letter)
    {
        for (int index = 0; index < secret.length(); index++)
            if (secret.charAt(index) == letter)
            {
                dashes.setCharAt(index, letter);
            }
        System.out.print("nice guess - ");
    }

    public static StringBuffer makeDashes(String s)
    {
        StringBuffer dashes = new StringBuffer(s.length());
        for (int count=0; count < s.length(); count++)
            dashes.append('-');
        return dashes;
    }
}
