import javax.swing.*;

public class GabrielMetoder {
    public static void main(String[] args) {
        // String name = "Gabriel"; (ordet som ska bli hemligt)
        // String secret = countChar(name); (gör ordet till underscores)
        // System.out.println(secret); (printa ut alla underscores)

    }
    public static String countChar(String x) {
        String maskedWord = "";
        int i = 0;
        for (i = 0 ; i < x.length() ; i++) {
            maskedWord += "_";
        }
        return maskedWord;
    }

    public static String list() {
        String guessedLetters = "";
        return guessedLetters;
    }

    public static boolean listContainsLetter(String list, char c) {
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] == c) {
                if (list.contains("" + c)) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    public static String guessing(String y) {
        int guesses = 0;
        while (guesses < 15) {
            String letter = JOptionPane.showInputDialog("Guess a letter");
            char c = letter.charAt(0);
            guesses++;
            if (listContainsLetter(y,c)) {
                int arrayNumber = 0;
                char[] lettersGuessed = new char[26];
                arrayNumber++;
            }
        }
        return ;

    }

}
