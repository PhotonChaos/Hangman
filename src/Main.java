import java.util.Scanner;

/**
  * @author Calum Coppack
  * @author Jusitn Houston
  *
  * @version 0.0.1a
  **/
public class Main {
    // Constants
    private static final int guesses = 8; // the number of guesses

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(s);
    }

    /**
     * @param word the word that the player needs to guess, this will be passed into the class constructor
     */
    private static void startGame(String word) {
        Game g = new Game(word, guesses);


        gameLoop(g);
    }

    /**
     * @param game The current Game object
     */
    private static void gameLoop(Game game) {

    }
 
    private static String givePhrase() {
        // TODO: variable creation
        // TODO: create an array of words
        // TODO: pull a random one

        return "";
    }
}
