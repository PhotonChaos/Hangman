import java.io.File;
import java.io.IOException;
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
 
    private static void readFile() throws IOException
    {
        final int listLength = 55;          
        File words = new File("words.txt");
        Scanner sc = new Scanner(words);
        String[] wordList = new String[listLength];
        for(int i = 0; i < listLength; i++)
        {
            wordList[i] = sc.nextLine(); 
        }
        sc.close();
    }

 
   public static String givePhrase()
    {
        final int listLength = 55;
        Random rand = new Random();
        int x = rand.nextInt(listLength);
        return wordList[x];
    }   
}
