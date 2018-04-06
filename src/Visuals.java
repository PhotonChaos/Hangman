import java.util.Random;
import java.util.Scanner;

public class Visuals
{
    private static String[] words = {"word1", "word2", "word3", "word4", "word5"};
    private static String word = words[(int) (Math.random() * words.length)];
    private static String star = new String(new char[word.length()]).replace("\0", "*");
    private static int count = 0;
    
    private Game game;
    
    public Visuals(Game g) {
        game = g;
    }

    public void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        while (count < 8 && star.contains("*"))
        {
            System.out.println("Guess A Letter / Press ? To Guess The Word"); //replace ?
            System.out.println(star);
            String guess = sc.next();
            //hang(guess);
        }
        sc.close();
    }

    public void CSGroupPojectAshvanthVisuals(String guess)
    {
        String newstar = "";
        for (int i = 0; i < word.length(); i++)
        {
            if (word.charAt(i) == guess.charAt(0))
            {
                newstar += guess.charAt(0);
            } else if (star.charAt(i) != '*')
            {
                newstar += word.charAt(i);
            } else
            {
                newstar += "*";
            }
        }

        if (star.equals(newstar))
        {
            count++;
            hangmanImage();
        }
        else
        {
            star = newstar;
        }
        
        if (star.equals(word))
        {
            System.out.println("Winner Winner, Chicken Dinner!: " + word);
        }
    }

    public void hangmanImage(String error) {

        if (count == 1)
        {
            System.out.println("Fail");
            //System.out.println("                    "); //1
            System.out.println("   |                  "); //2
            System.out.println("   |                  "); //3
            System.out.println("   |                  "); //4
            System.out.println("   |                  "); //5
            System.out.println("   |                  "); //6
            System.out.println("   |                  "); //7
            System.out.println("   |                  "); //8
            System.out.println("   |                  "); //9
            System.out.println("   |                  "); //10
        }
        
        if (count == 2)
        {
            System.out.println("Fail");
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
        
        if (count == 3)
        {
            System.out.println("Fail");
            System.out.println("   _____________      "); //1
            System.out.println("   |          _|_     "); //2
            System.out.println("   |        //   \\   "); //3
            System.out.println("   |       ||     ||  "); //4
            System.out.println("   |        \\___//   "); //5
            System.out.println("   |                  "); //6
            System.out.println("   |                  "); //7
            System.out.println("   |                  "); //8
            System.out.println("   |                  "); //9
            System.out.println(" __|__                "); //10
        }
        
        if (count == 4)
        {
            System.out.println("Fail");
            System.out.println("   _____________      "); //1
            System.out.println("   |          _|_     "); //2
            System.out.println("   |        //   \\   "); //3
            System.out.println("   |       ||     ||  "); //4
            System.out.println("   |        \\___//   "); //5
            System.out.println("   |           |      "); //6
            System.out.println("   |           |      "); //7
            System.out.println("   |           |      "); //8
            System.out.println("   |                  "); //9
            System.out.println(" __|__                "); //10
        }
        
        if (count == 5)
        {
            System.out.println("Fail");
            System.out.println("   _____________      "); //1
            System.out.println("   |          _|_     "); //2
            System.out.println("   |        //   \\   "); //3
            System.out.println("   |       ||     ||  "); //4
            System.out.println("   |        \\___//   "); //5
            System.out.println("   |           |      "); //6
            System.out.println("   |           |      "); //7
            System.out.println("   |           |      "); //8
            System.out.println("   |         //       "); //9
            System.out.println(" __|__      //        "); //10
        }
        
        if (count == 6)
        {
            System.out.println("Fail");
            System.out.println("   _____________      "); //1
            System.out.println("   |          _|_     "); //2
            System.out.println("   |        //   \\   "); //3
            System.out.println("   |       ||     ||  "); //4
            System.out.println("   |        \\___//   "); //5
            System.out.println("   |           |      "); //6
            System.out.println("   |           |      "); //7
            System.out.println("   |           |      "); //8
            System.out.println("   |         // \\    "); //9
            System.out.println(" __|__      //   \\   "); //10
        }
        
        if (count == 7)
        {
            System.out.println("Fail");
            System.out.println("   _____________      "); //1
            System.out.println("   |          _|_     "); //2
            System.out.println("   |        //   \\   "); //3
            System.out.println("   |       ||     ||  "); //4
            System.out.println("   |        \\___//   "); //5
            System.out.println("   |          _|      "); //6
            System.out.println("   |        // |      "); //7
            System.out.println("   |           |      "); //8
            System.out.println("   |         // \\    "); //9
            System.out.println(" __|__      //   \\   "); //10
        }
        
        if (count == 8)
        {
            System.out.println("YOU LOSE");
            System.out.println("   _____________      "); //1
            System.out.println("   |          _|_     "); //2
            System.out.println("   |        //x x\\   "); //3
            System.out.println("   |       || ___ ||  "); //4
            System.out.println("   |        \\___//   "); //5
            System.out.println("   |          _|_     "); //6
            System.out.println("   |        // | \\   "); //7
            System.out.println("   |           |      "); //8
            System.out.println("   |         // \\    "); //9
            System.out.println(" __|__      //   \\   "); //10
        }
        
        // Guesses left
        
        System.out.println(); // to space it out
        
        
        
        // error line
        
        // word with dashes
        
        // space
        
        // input (>)
        
        
    }
}
