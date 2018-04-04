/**
 * @author Calum Coppack
 * @version 0.0.1a
 **/
public class Game {
    public static final int maxGuesses = 8;
    private final String word; 
    
    private char[] wrongGuesses;
    private String guessedWord;
    private int guessesLeft = maxGuesses;
    private boolean isMultiplayer = false;

    // Constructors
    
    /**
     * @param _word the word that the player needs to guess
     **/
    Game(String _word) {
        word = _word;
        wrongGuesses = new char[guessesLeft];
    }

    /**
     * @param _word the word that the player needs to guess
     * @param guesses the number of guesses the player has
     **/
    Game(String _word, int guesses) {
        word = _word;
        guessesLeft = guesses;

        if (guesses >= 23) {
	        wrongGuesses = new char[23];
        } else {
        	wrongGuesses = new char[guessesLeft];
    	}
    }

    /**
      * @param _word the word that the player needs to guess
      * @param guesses the number of guesses the player has
      * @param multiplayer if the game is in multiplayer mode
      **/
    Game(String _word, int guesses, boolean multiplayer) {
		word = _word;
        guessesLeft = guesses;
        isMultiplayer = multiplayer;

        if (guesses >= 23) {
	        wrongGuesses = new char[23];
        } else {
        	wrongGuesses = new char[guessesLeft];
    	}
    }
    

    // Methods
    
    public String processGuess(String guess) {
    	String errorMessage = "";
    	boolean b = false;

        if(guess.length() != 1) {
        	errorMessage = "Please enter a valid input!";
    	} else {
    		for (char c : "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray()) {
    			if(Character.toUpperCase(guess.toCharArray()[0]) == c) b = true;
    		}

    		if(b) {
	            if(word.contains(guess)) {
	                for(int i = 0; i < word.length(); i++) {
	                    if(word.toCharArray()[i] == guess.toCharArray()[0]) {
	                        guess = guess.substring(0, i) + guess + guess.substring(i+1);
	                    }
	                }
	            } else {
	                guessesLeft--;
	            }
	        } else {
	        	errorMessage = "Please enter a valid input!";
	        }
        }

       	return errorMessage;
    }
}
