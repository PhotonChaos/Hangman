/**
 * @author Calum Coppack
 * @version 0.0.1a
 **/
public class Game {
    public static final int maxGuesses = 8;
    private final String word;

    public char[] wrongGuesses;
    public String guessedWord;
    public int guessesLeft = maxGuesses;
    private boolean isMultiplayer = false;

    // Constructors

    /**
     * @param _word the word that the player needs to guess
     **/
    Game(String _word) {
        word = _word;

        // parse for punctuation
        for (char c : _word.toCharArray()) {
            if("!@#$%^&*()\'\";:[]{}\\|-=+<>,.?/~` ".contains(String.valueOf(c))) {
                guessedWord += '_';
            } else {
                guessedWord += c;
            }
        }

        wrongGuesses = new char[guessesLeft];
    }

    /**
     * @param _word the word that the player needs to guess
     * @param guesses the number of guesses the player has
     **/
    Game(String _word, int guesses) {
        word = _word;
        guessesLeft = guesses;

        // parse for punctuation
        for (char c : _word.toCharArray()) {
            if("!@#$%^&*()\'\";:[]{}\\|-=+<>,.?/~` ".contains(String.valueOf(c))) {
                guessedWord += '_';
            } else {
                guessedWord += c;
            }
        }

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

        // parse for punctuation
        for (char c : _word.toCharArray()) {
            if("!@#$%^&*()\'\";:[]{}\\|-=+<>,.?/~` ".contains(String.valueOf(c))) {
                guessedWord += '_';
            } else {
                guessedWord += c;
            }
        }

        if (guesses >= 23) {
            wrongGuesses = new char[23];
        } else {
            wrongGuesses = new char[guessesLeft];
        }

        System.out.println("WordG: "+guessedWord);
        System.out.println("Word:  "+word);
    }


    // Methods

    public String processGuess(String guess) {
        System.out.println("WordG: "+guessedWord);
        System.out.println("Word:  "+word);
        String errorMessage = "";
        boolean b = false;

        if(guess.length() != 1) {
            errorMessage = "Please enter a valid input!"; // guess is invalid
        } else {
            for (char c : "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray()) {
                if(Character.toUpperCase(guess.toCharArray()[0]) == c) b = true;
            }

            if(b) {
                if(word.contains(guess)) {
                    for(int i = 0; i < word.length(); i++) {
                        if(word.toCharArray()[i] == guess.toCharArray()[0]) {
                            guessedWord = String.format("%s%s%s", guessedWord.substring(0, i), guess, guessedWord.substring(i)); //
                        }
                    }
                } else {
                    guessesLeft--; // Guess is valid, but incorrect
                }
            } else {
                errorMessage = "Please enter a valid input!"; // guess is invalid
            }
        }

        return errorMessage;
    }
}
