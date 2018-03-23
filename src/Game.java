/**
 * @author Calum Coppack
 * @version 0.0.1a
 **/
public class Game {
    public static final int maxGuesses = 8;

    private final String word;
    private int guessesLeft = maxGuesses;

    // Constructors
    
    /**
     * @param s the word that the player needs to guess
     */
    public Game(String s) {
        word = s;
        guesses = 8; // if there is no guess parameter, it defaults to 8
    }

    /**
     * @param s the word that the player needs to guess
     * @param g the number of guesses the player has
     */
    Game(String s, int g) {
        guesses = g;
        word = s;
    }
    
    // Methods
    
    public processGuess(String input) {
        // TODO: check guesses to se how they stack up to phrase
        // TODO: update main guess variable
    }

}
