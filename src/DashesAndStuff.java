import java.util.Random;
import java.util.Scanner;

public class CSGroupPojectAshvanthDashesAndMenu
{
    String secret;
    StringBuffer dashes;
    char letter;
    
    public CSGroupPojectAshvanthDashesAndMenu()
    {
        System.out.println(" |================================================================|================================================================|");
        System.out.println(" |                                                                |                                                                |");
        System.out.println(" |                                                                |                                                                |");
        System.out.println(" |                                                                |                                                                |");
        System.out.println(" |                                                                |                              ______                            |");
        System.out.println(" |                               /|                               |                                   |                            |");
        System.out.println(" |                              / |                               |                              _____|                            |");
        System.out.println(" |                                |                               |                              |                                 |");
        System.out.println(" |                                |                               |                              |_____                            |");
        System.out.println(" |                              __|__                             |                                                                |");
        System.out.println(" |                                                                |                                                                |");
        System.out.println(" |                                                                |                                                                |");
        System.out.println(" |       ------ |           /\\    \\     / ______ ------           |      ------ |           /\\    \\     / ______ ------            |");
        System.out.println(" |       |    | |          /  \\    \\   /  |      |    |           |      |    | |          /  \\    \\   /  |      |    |            |");
        System.out.println(" |       ------ |         /----\\    \\ /   |      |____|           |      ------ |         /----\\    \\ /   |      |____|            |");
        System.out.println(" |       |      |        /      \\    |    |----- |    \\           |      |      |        /      \\    |    |----- |    \\            |");
        System.out.println(" |       |      |       /        \\   |    |      |     |          |      |      |       /        \\   |    |      |     |           |");
        System.out.println(" |       |      ------ /          \\  |    |_____ |     |          |      |      ------ /          \\  |    |_____ |     |           |");
        System.out.println(" |                                                                |                                                                |");
        System.out.println(" |                                                                |                                                                |");
        System.out.println(" |                                                                |                                                                |");
        System.out.println(" |                                                                |                                                                |");
        System.out.println(" |         ------ ------  ------  _____  _____                    |         ------ ------  ------  _____  _____                    |");
        System.out.println(" |         |    | |    |  |      /      /           /|            |         |    | |    |  |      /      /          ______         |");
        System.out.println(" |         ------ |____|  |      |_____ |_____     / |            |         ------ |____|  |      |_____ |_____          |         |");
        System.out.println(" |         |      |    \\  |-----      |      |       |            |         |      |    \\  |-----      |      |     _____|         |");
        System.out.println(" |         |      |     | |           |      |       |            |         |      |     | |           |      |     |              |");
        System.out.println(" |         |      |     | |_____ _____/ _____/     __|__          |         |      |     | |_____ _____/ _____/     |_____         |");
        System.out.println(" |                                                                |                                                                |");
        System.out.println(" |                                                                |                                                                |");
        System.out.println(" |                                                                |                                                                |");
        System.out.println(" |                                                                |                                                                |");
        System.out.println(" |                                                                |                                                                |");
        System.out.println(" |                                                                |                                                                |");
        System.out.println(" |                                                                |                                                                |");
        System.out.println(" |                                                                |                                                                |");
        System.out.println(" |================================================================|================================================================|");
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
        {
            dashes.append('-');
        }
        return dashes;
    }

    public static void Muliplayer()
    {
        if (multiplayer == true) //whatever you called the multiplayer
        {
            System.out.println ("What is player 1's name?");
            Scanner sc = new Scanner(System.in);
            int player1 = sc.nextInt();
            System.out.println ("What is player 2's name?");
            int player2 = sc.nextInt();
        }
    }
}
