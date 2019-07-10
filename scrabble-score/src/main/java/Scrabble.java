import java.util.HashMap;

class Scrabble {
    String word;
    int score;
    public static final String PATTERNS[]={"[AEIOULNRST]","[DG]","[BCMP]","[FHVWY]","[K]","[JX]"};

    Scrabble(String word) {
        this.word = word.toUpperCase();
        score = calCulateScore(this.word);
    }

    int getScore() {
        return score;
    }

    int calCulateScore(String word) {

        for (char letter : word.toCharArray()) {
            if (String.valueOf(letter).matches(PATTERNS[0])) {
                score += 1;
            } else if (String.valueOf(letter).matches(PATTERNS[1])) {
                score += 2;
            } else if (String.valueOf(letter).matches(PATTERNS[2])) {
                score += 3;
            } else if (String.valueOf(letter).matches(PATTERNS[3])) {
                score += 4;
            } else if (String.valueOf(letter).matches(PATTERNS[4])) {
                score += 5;
            } else if (String.valueOf(letter).matches(PATTERNS[5])) {
                score += 8;
            } else {
                score += 10;
            }
        }

        return score;

    }

}
