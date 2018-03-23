
public class Visuals
{
    private static String[] words = {"word1", "word1", "word1", "word1", "word1"};
    private static String word = words[(int) (Math.random() * words.length)];
    private static String star = new String(new char[word.length()]).replace("\0", "*");
    private static int count = 0;

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        while (count < 7 && star.contains("*"))
        {
            System.out.println("Guess any letter in the word");
            System.out.println(star);
            String guess = sc.next();
            hang(guess);
        }
        sc.close();
    }

    public static void CSGroupPojectAshvanthVisuals(String guess)
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
        } else
        {
            star = newstar;
        }
        
        if (star.equals(word))
        {
            System.out.println("Winner Winner, Chicken Dinner!: " + word);
        }
    }

    public static void hangmanImage() {

        if (count == 1)
        {
            System.out.println("Fail");
            System.out.println("   |           ");
            System.out.println("   |           ");
            System.out.println("   |           ");
            System.out.println("   |           ");
            System.out.println("   |           ");
            System.out.println("   |           ");
            System.out.println("   |           ");
            System.out.println("   |           ");
        }
        
        if (count == 2)
        {
            System.out.println("Fail");
            System.out.println("   ____________");
            System.out.println("   |           ");
            System.out.println("   |           ");
            System.out.println("   |           ");
            System.out.println("   |           ");
            System.out.println("   |           ");
            System.out.println("   |           ");
            System.out.println("   |           ");
            System.out.println(" __|__         ");
        }
        
        if (count == 3)
        {
            System.out.println("Fail");
            System.out.println("   ____________    ");
            System.out.println("   |          _|_  ");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \___/ ");
            System.out.println("   |               ");
            System.out.println("   |               ");
            System.out.println("   |               ");
            System.out.println(" __|__             ");
        }
        
        if (count == 4)
        {
            System.out.println("Fail");
            System.out.println("   ____________    ");
            System.out.println("   |          _|_  ");
            System.out.println("   |         /   \ ");
            System.out.println("   |        |     |");
            System.out.println("   |         \___/ ");
            System.out.println("   |           |   ");
            System.out.println("   |           |   ");
            System.out.println("   |               ");
            System.out.println(" __|__             ");
        }
        
        if (count == 5)
        {
            System.out.println("Fail");
            System.out.println("   ____________    ");
            System.out.println("   |          _|_  ");
            System.out.println("   |         /   \ ");
            System.out.println("   |        |     |");
            System.out.println("   |         \___/ ");
            System.out.println("   |           |   ");
            System.out.println("   |           |   ");
            System.out.println("   |          /    ");
            System.out.println(" __|__       /     ");
        }
        
        if (count == 6)
        {
            System.out.println("Fail");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |        \\___/");
            System.out.println("   |           |");
            System.out.println("   |           |");
            System.out.println("   |          / \\ ");
            System.out.println(" __|__       /   \\");
        }
        
        if (count == 7)
        {
            System.out.println("Fail");
            System.out.println("   ____________    ");
            System.out.println("   |           O  ");
            System.out.println("   |          _|_  ");
            System.out.println("   |         / |   ");
            System.out.println("   |          / \  ");
            System.out.println(" __|__       /   \ ");
        }
        if (count == 8)
        {
            System.out.println("YOU LOSE");
            System.out.println("   ____________    ");
            System.out.println("   |          _|_  ");
            System.out.println("   |         /   \ ");
            System.out.println("   |        |     |");
            System.out.println("   |         \___/ ");
            System.out.println("   |          _|_  ");
            System.out.println("   |         / | \ ");
            System.out.println("   |          / \  ");
            System.out.println(" __|__       /   \ ");
            System.out.println("GAME OVER! Answer was: " + word);
        }
    }
}
