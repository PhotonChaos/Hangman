/**
 * @author Calum Coppack
 * @version 0.0.1a
 **/
public class Game {
    public static final int maxGuesses = 8;
    public int mGuess = 8;
    public final String word;
    
    public boolean isFinished = false;
    public boolean isWon = false;
    
    int scoreA = 0;
    int scoreB = 0;
    
    public char pTurn = '0';
    
    public String wrongGuesses = "";
    public String guessedWord = "";
    public int guessesLeft = maxGuesses;
    public boolean isMultiplayer = false;

    // Constructors

    /**
     * @param _word the word that the player needs to guess
     **/
    Game(String _word) {
        word = _word;

        // parse for punctuation
        for (char c : _word.toCharArray()) {
            if(Character.isLetter(c)) {
                guessedWord += '_';
            } else {
                guessedWord += c;
            }
        }
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
            if(Character.isLetter(c)) {
                guessedWord += '_';
            } else {
                guessedWord += c;
            }
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
        mGuess = guessesLeft;
        isMultiplayer = multiplayer;

        // parse for punctuation
        for (char c : _word.toCharArray()) {
            if(Character.isLetter(c)) {
                guessedWord += '_';
            } else {
                guessedWord += c;
            }
        }
        
        System.out.println(guessedWord);
        //System.out.println("Word:  "+word);
    }


    // Methods

    public String processGuess(String guess) {
        String errorMessage = "";
        
        if(isMultiplayer) {
            if(pTurn == 'a') {
                pTurn = 'b';
            } else {
                pTurn = 'a';
            }
        }

        if(guess.length() != 1 || !Character.isLetter(guess.charAt(0))) {
            if(guess.length() > 1) {
                if(guess.toLowerCase().equals(word)) {
                    isFinished = true;
                    if(isMultiplayer) {
                        int scoreAdd = 0;
                        for(char c : guessedWord.toCharArray()) {
                            if(c == '_') scoreAdd++;
                        }
                        
                        if(pTurn == 'a') {
                            scoreA += scoreAdd;
                        } else {
                            scoreB += scoreAdd;
                        }
                    } else {
                        isWon = true;
                    }
                }
            } else {
                errorMessage = "Please enter a valid input!"; // guess is invalid
            }
        } else {
            if(word.contains(guess)) {
                if(!guessedWord.contains(guess)) {
                    System.out.println("Correct!");
                    for(int i = 0; i < word.length(); i++) {
                        if(word.toCharArray()[i] == guess.toCharArray()[0]) {
                            StringBuilder sb = new StringBuilder(guessedWord);
                            sb.setCharAt(i, guess.toCharArray()[0]);
                            guessedWord = sb.toString();
                            
                            if(isMultiplayer) {
                                if(pTurn == 'a') {
                                    scoreA++;
                                } else if(pTurn == 'b') {
                                    scoreB++;
                                }
                            }
                        }
                    }
                    if(guessedWord.equals(word)) {
                        isFinished = true;
                        isWon = true;
                    }
                }
            } else {
                if(!wrongGuesses.contains(guess)) {
                    guessesLeft--; // Guess is valid, but incorrect
                    wrongGuesses += guess;
                    System.out.println("\nIncorrect.");
                }
                if(guessesLeft <= 0) {
                    isFinished = true; // end game
                    isWon = false;     // player has lost the game
                }
            }
        }
  
        return errorMessage;
    }
}
