# Hangman
This is a hangman program written in java. The user is to guess one letter at a time. The user will be given 8 guesses, losing on the 8th wrong guess. Each phrase may be multiple words, and punctuation will be revealed immediately. The words will be no shorter than **3** characters in length.
## Classes
This program uses multiple classes for various methods such as drawing the scene.
### Main
This is the main entry point for the program, and has some useful methods.
#### Methods
##### main(String[] args)
This is the entry point for the application.

##### startGame(String word)
This is the setup for the game, and the initializer of the game object.

##### gameLoop(Game g)
This is the loop that will run the game.

### Game
This class is the object that represents the current game.

### Logic
TODO

### Visuals
This is that class that geneates visuals.

### Visuals
This is the class that generates all viewable text and art.

### DashesAndMenu
As of now, has a placeholder menu and can turn dashes into rightly guessed letters (remember, all the letters need to be in CAPS)
#### Methods
