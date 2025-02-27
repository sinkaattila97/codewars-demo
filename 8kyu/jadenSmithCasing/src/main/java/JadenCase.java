import java.util.Arrays;
import java.util.stream.Collectors;

public class JadenCase {
    public static void main(String[] args) {
        System.out.println(toJadenCase("How can mirrors be real if our eyes aren't real")); // "How Can Mirrors Be Real If Our Eyes Aren't Real"
        System.out.println(toJadenCase("")); // null
        System.out.println(toJadenCase(null)); // null
    }

    public static String toJadenCase(String phrase) {
        if (phrase == null || phrase.isEmpty()) { //empty string or null check
            return null;
        }

        return Arrays.stream(phrase.split(" ")) //splits the string by spaces
                .filter(word -> !word.isEmpty()) //ensures that any empty words (which can occur due to multiple spaces) are ignored
                .map(word -> Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase()) //capitalizes the first letter of each word and converts the rest of the letters to lowercase
                .collect(Collectors.joining(" ")); //processed words are then joined back into a single string with spaces between them
    }

    //other soultion
    public static String toJadenCase2(String phrase) {
        if (phrase == null || phrase.isEmpty()) {
            return null;
        }

        String[] words = phrase.split(" ");
        StringBuilder jadenCased = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                jadenCased.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1).toLowerCase())
                        .append(" ");
            }
        }

        return jadenCased.toString().trim();
    }

}