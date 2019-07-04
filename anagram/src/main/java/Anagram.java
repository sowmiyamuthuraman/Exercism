import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

class Anagram {
    String input;

    Anagram(String input) {
        this.input = input.toLowerCase();
    }

    private String getSortedString(String str) {
        char[] strCharacters = str.toLowerCase().toCharArray();
        Arrays.sort(strCharacters);
        return new String(strCharacters);
    }

    List<String> match(List<String> words) {
        List<String> anagram = new ArrayList<String>();
        String word;
        String sortedInput = getSortedString(input);
        for (int i = 0; i < words.size(); i++) {
            word = words.get(i);
            if ((!input.equals(word.toLowerCase()) && input.length() == word.length())) {
                word = getSortedString(words.get(i));
                if (sortedInput.equals(word)) {
                    anagram.add(words.get(i));

                }
            }
        }
        return anagram;
    }
}