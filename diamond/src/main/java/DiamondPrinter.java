import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

class DiamondPrinter {

    List<String> printToList(char a) {
        int n = (a - 65) + 1;
        int numberOfRows = (2 * (n - 1)) + 1;
        int space = n - 1;
        String pattern = "";
        List<String> patternList = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            pattern = String.join("", Collections.nCopies(space, " "));
            int spaceBetweenLetters = (2 * i) - 1 < 0 ? 0 : (2 * i) - 1;
            String val = "" + (char) ('A' + i) + String.join("", Collections.nCopies(spaceBetweenLetters, " "));
            pattern += String.join("", Collections.nCopies(i==0?1:2, val));
            pattern += String.join("", Collections.nCopies(space, " "));
            patternList.add(pattern.substring(0, numberOfRows));
            space--;

        }
        List<String> tempList = new ArrayList<String>(patternList.subList(0, n - 1));
        Collections.reverse(tempList);
        patternList.addAll(tempList);
        return patternList;
    }
}
