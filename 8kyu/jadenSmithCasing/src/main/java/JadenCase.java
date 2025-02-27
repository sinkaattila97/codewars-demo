import java.util.Arrays;
import java.util.stream.Collectors;

public class JadenCase {
    public static void main(String[] args) {
        System.out.println(toJadenCase("How can mirrors be real if our eyes aren't real")); // "How Can Mirrors Be Real If Our Eyes Aren't Real"
        System.out.println(toJadenCase("")); // null
        System.out.println(toJadenCase(null)); // null
    }

    public static String toJadenCase(String phrase) {
        if (phrase == null || phrase.isEmpty()) {
            return null;
        }

        return Arrays.stream(phrase.split(" "))
                .filter(word -> !word.isEmpty())
                .map(word -> Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase())
                .collect(Collectors.joining(" "));
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