package main.java;
import java.util.Map;
import java.util.HashMap;
public class NucleotideCounter {

    String nucleotide;
    Map<Character,Integer> nucleotideCountsmap;

    public NucleotideCounter(String nucleotide) {
        if(!nucleotide.matches("[ACGT]*")){
            throw new IllegalArgumentException();
        }
        this.nucleotide = nucleotide;
        nucleotideCountsmap=new HashMap<Character,Integer>();
        nucleotideCountsmap.put('A',0);
        nucleotideCountsmap.put('C',0);
        nucleotideCountsmap.put('G',0);
        nucleotideCountsmap.put('T',0);
    }

    public Map<Character, Integer> nucleotideCounts() {
        for (char strand : nucleotide.toCharArray()) {
            nucleotideCountsmap.put(strand, nucleotideCountsmap.get(strand) + 1);
        }
        return nucleotideCountsmap;
    }

}