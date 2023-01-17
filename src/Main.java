import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) throws FileNotFoundException {

            Scanner scanner = new Scanner(new File("ord.txt"));

            int slumptal = (int) (Math.random() * 156) * 2;

            for (int i = 0; i < slumptal; i++) {
                scanner.nextLine();
            }
            String hiddenWord = GabrielMetoder.countChar(scanner.nextLine());
            System.out.println(hiddenWord);
            GabrielMetoder.guessing(hiddenWord);
            {

            }
        }



    public static String Gamecheck(String y, int numberOfWrongGuesses) {

        String correctWord = "nlkhsdflh";
        String _a____B_ ;

        if (correctWord.equals(y)) {
            // you win
        }

        if (y.contains("_")) {
            // Play on
            return y;

        }
        return correctWord;
    }
}

