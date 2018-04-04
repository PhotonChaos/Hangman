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
    private static final int listLength = 55;
    private static String[] wordList = new String[listLength];
    private static int roundsPlayed = 0;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        // fill the word list with the contents of the file
        File words = new File("words.txt"); // file
        Scanner fsc = new Scanner(words);   // file scanner
        for(int i = 0; i < listLength; i++) {
            wordList[i] = sc.nextLine(); 
        }

        sc.close();

        boolean multi;
        boolean res;

        while(exit == false) {
        	//START MENU HERE
        	

	        do {
	        	++roundsPlayed;

	        	res = startGame();
	        } while(res);
	    }

	    // END OF PROGRAM	
    }

    /**
     * @param word the word that the player needs to guess, this will be passed into the class constructor
     * 
     * This method constructs the game
     **/
    private static boolean startGame(boolean multi) {
        Game g;
        Scanner sc = new Scanner(System.in);

        g = new Game(wordList[(new Random()).nextInt(56)], guesses, );
        return gameLoop(g);
    }

    /**
     * @param game The current Game object
     */
    private static boolean gameLoop(Game game) {


    	return endGame(game);
    }

    private static boolean endGame(Game g) {
    	System.out.println("Would you like to play again? (y/n)");
    	System.out.print("> ");

    	return Character.toLowerCase(new Scanner(System.in).nextLine().toCharArray()[0]) == 'y';
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
