class Acronym {
    String phrase;

    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {
        String words[] = phrase.replaceAll("[\\W && [^']]", " ").split("[\\s_]+");
        String acronym = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i] != "") {
                acronym += Character.toUpperCase(words[i].charAt(0));
            }
        }
        return acronym;
    }

}
