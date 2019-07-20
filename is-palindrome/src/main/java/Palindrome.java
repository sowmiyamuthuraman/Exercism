public class Palindrome {
    public boolean check(String sentence) {
        sentence=sentence.replaceAll("[\\W\\s]","").toLowerCase();
        StringBuilder reversedSentence=new StringBuilder(sentence).reverse();
        return sentence.equals(reversedSentence.toString());
    }
}
