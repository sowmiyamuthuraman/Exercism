import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

class PigLatinTranslator {

    boolean isVowel(char characterToCheck) {
        characterToCheck = Character.toLowerCase(characterToCheck);
        if (characterToCheck == 'a' || characterToCheck == 'e' || characterToCheck == 'i' || characterToCheck == 'o'
                || characterToCheck == 'u') {
            return true;
        }
        return false;
    }

    int findVowel(String str, int count) {
        int index = -1;
        int counter = 0;
        for (int i = 0; i < str.length() && counter != count; i++) {
            if (isVowel(str.charAt(i))) {
                index = i;
                counter++;
            }
        }
        return index;
    }

    boolean isConsonantString(String word){
        boolean flag=true;
        for(char letter:word.toCharArray()){
            if(isVowel(letter)){
               flag=false;
               break; 
            }
        }
        return flag;
    }

    String translate(String input) {
        String words[] = input.split(" ");
        String PigLatinString = "";
        for (String word : words) {
            if (!PigLatinString.equals("")) {
                PigLatinString += ' ';
            }
            if (word.startsWith("xr") || word.startsWith("yt") || isVowel(word.charAt(0))) {
                PigLatinString += word + "ay";
            } else {
                int index = 0;
                if (word.indexOf('y') != -1 && (word.indexOf('y')==1|| isConsonantString(word)) ) {
                    index = word.indexOf('y');
                } else if (!(word.indexOf("qu") == 0 || word.indexOf("qu") == 1)) {
                    index = findVowel(word, 1);
                } else {
                    index = findVowel(word, 2);
                }
                PigLatinString += word.substring(index) + word.substring(0, index) + "ay";
            }
        }
        return PigLatinString;
    }
}