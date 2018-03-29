/**
 * @author Calum Coppack
 * @version 0.0.1a
 **/
public class Game {
    public static final int maxGuesses = 8;
    private final String word; 
    
    private char[] letters = new char[23];
    private String guessed;
    private int guessesLeft = maxGuesses;
    private boolean isMultiplayer = False;

    // Constructors
    
    /**
     * @param _word the word that the player needs to guess
     **/
    Game(String _word) {
        word = _word;
    }

    /**
     * @param _word the word that the player needs to guess
     * @param guesses the number of guesses the player has
     **/
    Game(String _word, int guesses) {
        word = _word;
        guessesLeft = guesses;
    }

    /**
      * @param _word the word that the player needs to guess
      * @param guesses the number of guesses the player has
      * @param multiplayer if the game is in multiplayer mode
      **/
    Game(String word, int guesses, boolean multiplayer) {
		word = _word;
        guessesLeft = guesses;
        isMultiplayer = multiplayer;
    }
    
    // Methods
    
    public String processGuess(String guess) {
    	String errorMessage = "";

        if(guess.length() != 1) {
        	errorMessage = "Please enter a valid input!";
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

       	return errorMessage;
    }
}
