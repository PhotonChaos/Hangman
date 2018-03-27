/**
 * @author Calum Coppack
 * @version 0.0.1a
 **/
public class Game {
    public static final int maxGuesses = 8;
    private final String word; 
    
    private char[] letters = new char[25];
    private String guessed;
    private int guessesLeft = maxGuesses;

    // Constructors
    
    /**
     * @param s the word that the player needs to guess
     **/
    Game(String s) {
        word = s;
        guessesLeft = 8; // if there is no guess parameter, it defaults to 8
    }

    /**
     * @param s the word that the player needs to guess
     * @param g the number of guesses the player has
     **/
    Game(String s, int g) {
        word = s;
        guessesLeft = g;
    }
    
    // Methods
    
    public void processGuess(String guess) {
        if(guess.length() != 1) {
            
        } else {
            if(word.contains(guess)) {
                for(int i = 0; i < word.length(); i++) {
                    if(word.toCharArray()[i] == guess.toCharArray()[0]) {
                        guess = guess.substring(0, i) + guess + guess.substring(i+1);
                    }
                }
            } else {
                guessesLeft--;
            }
        }
    }
}
