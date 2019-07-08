import java.util.HashMap;
import java.util.Map;

class TwelveDays {

    String digitsInWords[][] = getdigitsInWords();
    String gifts[] = getGifts();
    String startPhrase = "On the nth day of Christmas my true love gave to me: ";

    String[][] getdigitsInWords() {
        String[][] digitsInWords = { { "first", "a " }, { "second", "two " }, { "third", "three " },
                { "fourth", "four " }, { "fifth", "five " }, { "sixth", "six " }, { "seventh", "seven " },
                { "eighth", "eight " }, { "ninth", "nine " }, { "tenth", "ten " }, { "eleventh", "eleven " },
                { "twelfth", "twelve " } };
        return digitsInWords;
    }

    String[] getGifts() {
        String gifts[] = { "Partridge in a Pear Tree.", "Turtle Doves", "French Hens", "Calling Birds", "Gold Rings",
                "Geese-a-Laying", "Swans-a-Swimming", "Maids-a-Milking", "Ladies Dancing", "Lords-a-Leaping",
                "Pipers Piping", "Drummers Drumming" };
        return gifts;
    }

    String verse(int verseNumber) {
        StringBuilder verse = new StringBuilder(startPhrase.replace("nth", digitsInWords[verseNumber - 1][0]));
        for (int i = verseNumber - 1; i > 0; i--) {
            verse.append(digitsInWords[i][1]);
            verse.append(gifts[i] + ", ");
        }
        verse = verseNumber != 1 ? verse.append("and ") : verse;
        verse.append(digitsInWords[0][1] + gifts[0] + "\n");
        return verse.toString();
    }

    String verses(int startVerse, int endVerse) {
        StringBuilder verses = new StringBuilder("");
        for (int i = startVerse; i <= endVerse; i++) {
            verses.append(verse(i));
            verses = i != endVerse ? verses.append("\n") : verses;
        }
        return verses.toString();
    }

    String sing() {
        return verses(1, 12);
    }

}
