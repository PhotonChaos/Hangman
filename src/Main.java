import com.sun.org.apache.xpath.internal.functions.Function;

import java.io.File;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;
import java.util.Random;

/**
 * @author Calum Coppack
 * @author Jusitn Houston
 *
 * @version 0.0.1a
 **/
public class Main {
    // Constants
    private static final int guesses = 8; // the number of guesses
    private static final int listLength = 55;
    private static String[] wordList = new String[listLength];
    private static int roundsPlayed = 0;

    private static final Visuals visuals = new Visuals(new Game("")); // the current game class is a dummy class

    public static void main(String[] args) throws IOException {
        // fill the word list with the contents of the file
        File words = new File("C:\\Users\\Admin\\Desktop\\Hangman\\out\\production\\Hangman\\words.txt"); // file
        Scanner fsc = new Scanner(words);   // file scanner
        for(int i = 0; i < listLength; i++) {
            wordList[i] = fsc.nextLine();
        }
        fsc.close();

        for(String s : wordList) {
            System.out.println(s);
        }

        boolean multi;
        boolean res;
        boolean exit = false;
        Scanner sc = new Scanner(System.in);

        while(!exit) {
            //START MENU HERE
            System.out.println("Single, or multiplayer? ");
            multi = Objects.equals(sc.nextLine().toLowerCase(), "multiplayer");

            do {
                ++roundsPlayed;

                res = startGame(multi);
            } while(res);

            System.out.println("Enter 'e' to exit, or anything else to continue");
            exit = sc.nextLine().toLowerCase().contains("e");
        }
        // END OF PROGRAM
    }

    /**
     * @param multi If the game is multiplayer
     *
     * This method constructs the game
     **/
    private static boolean startGame(boolean multi) {
        Game g;
        g = new Game(wordList[new Random().nextInt(56)], guesses, multi);
        visuals.changeGame(g);
        return gameLoop(g);
    }

    /**
     * @param game The current Game object
     */
    private static boolean gameLoop(Game game) {
        while(game.guessesLeft > 0) {
            visuals.drawHangman(game.processGuess(new Scanner(System.in).nextLine()));
        }

        return endGame(game);
    }

    private static boolean endGame(Game g) {
        System.out.println("Would you like to play again? (y/n)");
        System.out.print("> ");

        return Character.toLowerCase(new Scanner(System.in).nextLine().toCharArray()[0]) == 'y';
    }
}
