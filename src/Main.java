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
        andom rand = new Random();
        int index;
        String[] words = {"hello","goodbye","ravioli","senate","trebuchet","details","sniper","garbage","rules","coffee","jokes","general","kenobi","skywalker","shorter","expeted","garlic","bread","freedom","oil","murica","soviet","union","crows","counting","kahoot","bazinga","conclution","horse","mountian","witch","upvote","mercy","god","java","oh hi mark","pee is stored in the balls","burger king foot lettuce","me too thanks","hello world","do it","what about the droid attack on the wookies","pizza time","life is a highway","north korea best korea","arrays start at 1","you never know whats going to come through that door","giff not jiff","when life gives you lemons","wot in tarnation","whom'st'd've","hey that's pretty good","i shouldn't it's not the jedi way","it's over anakin i have the high ground","have you ever heard the tradgy of darth plagius the wise?"};
        // array of my 50 potenial solutions
        index = rand.nextInt(50);
        return words[index];  
    }
}
