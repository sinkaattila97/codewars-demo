import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class DescendingOrder {

    public static int sortDesc(final int num) {
        return Integer.parseInt(            //converts the final sorted string back to an integer.
                Integer.toString(num)       //convert to string
                        .chars()    //converts the string to an IntStream of characters
                        .mapToObj(c -> (char) c)    //converts each character code to a Character object
                        .sorted(Collections.reverseOrder())    //sort in reverse order
                        .map(String::valueOf)       //converts each Character object back to a string
                        .collect(Collectors.joining())      //joins the sorted characters into a single string
        );
    }

    public static int sortDesc2(final int num) {
        String[] array = String.valueOf(num).split(""); //converts the integer num to its string representation.split("") splits the string into an array of its individual characters.
        Arrays.sort(array, Collections.reverseOrder());
        return Integer.parseInt(String.join("", array));
    }

    public static int sortDesc1(final int num) {
        String numStr = Integer.toString(num);
        Character[] digits = new Character[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i);
        }
        Arrays.sort(digits, Collections.reverseOrder());
        StringBuilder sortedNumStr = new StringBuilder(digits.length);
        for (char digit : digits) {
            sortedNumStr.append(digit);
        }
        return Integer.parseInt(sortedNumStr.toString());
    }
}
