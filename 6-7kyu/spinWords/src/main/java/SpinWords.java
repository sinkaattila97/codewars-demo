public class SpinWords {

    public String spinWords(String sentence) {
        String[] words = sentence.split(" "); //splits the string at each space character
        StringBuilder result = new StringBuilder();

        for (String word : words) { //iterates through each word in the array
            if (word.length() >= 5) {
                result.append(new StringBuilder(word).reverse());
            } else {
                result.append(word);
            }
            result.append(" "); //after each word (reversed or not), a space character is appended
        }
        return result.toString().trim(); //convert it to a string and remove any trailing spaces
    }
}