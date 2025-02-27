import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TwoToOne {

    public static String longest(String s1, String s2) {
        return Stream.concat(s1.chars().boxed(), s2.chars().boxed())    //Combine the character streams of s1 and s2 using Stream.concat()
                .distinct()     //Remove duplicates
                .sorted()       //Sort the characters
                .map(c -> String.valueOf((char) c.intValue()))  //Convert each character from int to String
                .collect(Collectors.joining()); //Collect the characters into a single string
    }

    /*the chars() method of a String returns an IntStream of the Unicode code points of the characters in the string.
    Therefore, when you concatenate the character streams of s1 and s2, you are working with streams of integers.
    To convert these integers back to characters and then to strings, you use the mapToObj() method
     */

}