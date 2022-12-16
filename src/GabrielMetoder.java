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
    public static String Guesses() {
        String[] alfabet = {};
        String[] guesses = {};
        return;
    }
}
