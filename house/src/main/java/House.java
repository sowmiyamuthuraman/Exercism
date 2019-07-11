package main.java;

public class House {

    private static final String[] nouns = { "the house that Jack built", "the malt", "the rat", "the cat", "the dog",
            "the cow with the crumpled horn", "the maiden all forlorn", "the man all tattered and torn",
            "the priest all shaven and shorn", "the rooster that crowed in the morn", "the farmer sowing his corn",
            "the horse and the hound and the horn" };
    private static final String[] verbs = { "lay in", "ate", "killed", "worried", "tossed", "milked", "kissed",
            "married", "woke", "kept", "belonged to" };
    private String songVerses;

    public House() {
        songVerses = "";
    }

    public String verse(int verse) {
        songVerses = "This is " + nouns[verse - 1];
        return String.format("%s.",constructVerse(verse - 2));
    }

    private String constructVerse(int index) {
        if (index < 0) {
            return songVerses;
        }
        songVerses += String.format(" that %s %s",verbs[index],nouns[index]);
        return constructVerse(--index);
    }

    public String verses(int start, int end) {
        for (int i = start; i <= end; i++) {
            songVerses += verse(i);
            if (i != end) {
                songVerses +=String.format("\n");
            }
        }
        return songVerses;
    }

    public String sing() {
        return verses(1, 12);
    }

}