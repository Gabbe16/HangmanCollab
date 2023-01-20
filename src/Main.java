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
            String word = scanner.nextLine();
            String hiddenWord = GabrielMetoder.countChar(word);
            System.out.println(hiddenWord);
            GabrielMetoder.guessing(hiddenWord);
            char lastLetterGuessed = GabrielMetoder.guessing(hiddenWord).charAt(word.length()-1);

            if (word.contains(""+ lastLetterGuessed)) {
                GabrielMetoder.countLetterInString(word, lastLetterGuessed);
                int[] letterPos = GabrielMetoder.locationOfLetter(hiddenWord, lastLetterGuessed);

                for (int i = 0 ; i < letterPos.length ; i++) {
                    hiddenWord = GabrielMetoder.replaceLetter(hiddenWord, lastLetterGuessed, letterPos[i]);
                }
            }

        }

}

