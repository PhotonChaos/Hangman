import java.util.Random;
import java.util.Scanner;

public class Visuals
{
    //private static String[] words = {"word1", "word2", "word3", "word4", "word5"};
    //private static String word = words[(int) (Math.random() * words.length)];
    //private static String star = new String(new char[word.length()]).replace("\0", "*");
    //private static int count = 0;
    //private int prevGuessScore;
    private Game game;
    
    public Visuals(Game g) {
        game = g;
    }
    
    public void hangmanImage(String errorMessage) {
        int count = game.mGuess - game.guessesLeft;
        
        System.out.println("\u000C");
        
        if(game.isMultiplayer) {
            System.out.println("Score (a-b): "+game.scoreA+"-"+game.scoreB);
        } else {
            System.out.println();
        }
        
        if(count == 0) {
            System.out.print("\n\n\n\n\n\n\n\n\n");
            System.out.println(" __|__                ");
        } else if (count == 1)
        {
            //System.out.println("Incorrect.");
            System.out.println("                    "); //1
            System.out.println("   |                  "); //2
            System.out.println("   |                  "); //3
            System.out.println("   |                  "); //4
            System.out.println("   |                  "); //5
            System.out.println("   |                  "); //6
            System.out.println("   |                  "); //7
            System.out.println("   |                  "); //8
            System.out.println("   |                  "); //9
            System.out.println(" __|__                "); //10
        }
        
        else if (count == 2)
        {
            //System.out.println("Incorrect.");
            System.out.println("   _____________      "); //1
            System.out.println("   |           |      "); //2
            System.out.println("   |                  "); //3
            System.out.println("   |                  "); //4
            System.out.println("   |                  "); //5
            System.out.println("   |                  "); //6
            System.out.println("   |                  "); //7
            System.out.println("   |                  "); //8
            System.out.println("   |                  "); //9
            System.out.println(" __|__                "); //10
        }
        
        else if (count == 3)
        {
            //System.out.println("Incorrect.");
            System.out.println("   _____________      "); //1
            System.out.println("   |          _|_     "); //2
            System.out.println("   |         /   \\   "); //3
            System.out.println("   |        |     |   "); //4
            System.out.println("   |         \\___/    "); //5
            System.out.println("   |                  "); //6
            System.out.println("   |                  "); //7
            System.out.println("   |                  "); //8
            System.out.println("   |                  "); //9
            System.out.println(" __|__                "); //10
        }
        
        else if (count == 4)
        {
            //System.out.println("Incorrect.");
            System.out.println("   _____________      "); //1
            System.out.println("   |          _|_     "); //2
            System.out.println("   |         /   \\   "); //3
            System.out.println("   |        |     |   "); //4
            System.out.println("   |         \\___/    "); //5
            System.out.println("   |           |      "); //6
            System.out.println("   |           |      "); //7
            System.out.println("   |           |      "); //8
            System.out.println("   |                  "); //9
            System.out.println(" __|__                "); //10
        }
        
        else if (count == 5)
        {
            //System.out.println("Incorrect.");
            System.out.println("   _____________      "); //1
            System.out.println("   |          _|_     "); //2
            System.out.println("   |         /   \\   "); //3
            System.out.println("   |        |     |   "); //4
            System.out.println("   |         \\___/    "); //5
            System.out.println("   |           |      "); //6
            System.out.println("   |           |      "); //7
            System.out.println("   |           |      "); //8
            System.out.println("   |          /       "); //9
            System.out.println(" __|__       /        "); //10
        }
        
        else if (count == 6)
        {
            //System.out.println("Incorrect.");
            System.out.println("   _____________      "); //1
            System.out.println("   |          _|_     "); //2
            System.out.println("   |         /   \\   "); //3
            System.out.println("   |        |     |   "); //4
            System.out.println("   |         \\___/    "); //5
            System.out.println("   |           |      "); //6
            System.out.println("   |           |      "); //7
            System.out.println("   |           |      "); //8
            System.out.println("   |          / \\    "); //9
            System.out.println(" __|__       /   \\   "); //10
        }
        
        else if (count == 7)
        {
            //System.out.println("Incorrect.");
            System.out.println("   _____________      "); //1
            System.out.println("   |          _|_     "); //2
            System.out.println("   |         /   \\   "); //3
            System.out.println("   |        |     |   "); //4
            System.out.println("   |         \\___/    "); //5
            System.out.println("   |          _|      "); //6
            System.out.println("   |        /  |      "); //7
            System.out.println("   |           |      "); //8
            System.out.println("   |          / \\    "); //9
            System.out.println(" __|__       /   \\   "); //10
        }
        
        else if (count == 8)
        {
            //System.out.println("YOU LOSE");
            System.out.println("   _____________      "); //1
            System.out.println("   |          _|_     "); //2
            System.out.println("   |         /x x\\   "); //3
            System.out.println("   |        | ___ |   "); //4
            System.out.println("   |         \\___/    "); //5
            System.out.println("   |          _|_     "); //6
            System.out.println("   |        /  |  \\   "); //7
            System.out.println("   |           |      "); //8
            System.out.println("   |          / \\    "); //9
            System.out.println(" __|__       /   \\   "); //10
        }
        
        System.out.print("Wrong Guesses: ");
        
        System.out.println(game.wrongGuesses);
        
        System.out.println();
        
        System.out.println("you have "+game.guessesLeft+" guesses left");
        
        System.out.println(); // to space it out
        if(errorMessage != "aaa") {
            System.out.println(errorMessage);
        }
        
        System.out.println(game.guessedWord);
        
        System.out.println(); // to space it out
        if(!game.isFinished && errorMessage != "aaa") {
            System.out.print("> ");
        }
    }
    
    public void drawEndScreen() {
        if(game.isMultiplayer) {
            if(game.scoreA > game.scoreB) {
                System.out.println("######################");
                System.out.println("#   Player A Wins!   #");
                System.out.println("#                    #");
                System.out.println("#  Congratulations!  #");
                System.out.println("#                    #");
                System.out.println("######################");
            } else if(game.scoreA < game.scoreB) {
                System.out.println("######################");
                System.out.println("#   Player B Wins!   #");
                System.out.println("#                    #");
                System.out.println("#  Congratulations!  #");
                System.out.println("#                    #");
                System.out.println("######################");
            } else {
                System.out.println("######################");
                System.out.println("#                    #");
                System.out.println("#    It's a Tie!     #");
                System.out.println("#                    #");
                System.out.println("#                    #");
                System.out.println("######################");
            }
        } else {
            if(game.isWon) {
                System.out.println("######################");
                System.out.println("#      You Win!      #");
                System.out.println("#                    #");
                System.out.println("#  Congratulations!  #");
                System.out.println("#                    #");
                System.out.println("######################");
            } else {
                System.out.println("#####################");
                System.out.println("#     You Lost      #");
                System.out.println("#                   #");
                System.out.println("# Sorry about that! #");
                System.out.println("#                   #");
                System.out.println("#####################");
            }
        }
        
        System.out.println("The word was: "+game.word);
    }
    
    public void changeGame(Game g) {
        game = g;
    }
}
