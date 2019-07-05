import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ProteinTranslator {

    List<String> translate(String rnaSequence) {
        List<String> proteinTranslation=new ArrayList<String>();
        Map<String,String> codonProteinMap=getCodonProteinMap();
        for(int i=0;i<rnaSequence.length();i=i+3){
            String protein=codonProteinMap.get(rnaSequence.substring(i, i+3));
            if(protein.equals("STOP")){
                break;
            }
            proteinTranslation.add(protein);
        }
        return proteinTranslation;
    }
    Map<String,String> getCodonProteinMap(){
        Map<String,String> map=new HashMap<String,String>();
        map.put("AUG","Methionine");
        map.put("UUU","Phenylalanine");
        map.put("UUC","Phenylalanine");
        map.put("UUA","Leucine");
        map.put("UUG","Leucine");
        map.put("UCU","Serine");
        map.put("UCC","Serine");
        map.put("UCA","Serine");
        map.put("UCG","Serine");
        map.put("UAU","Tyrosine");
        map.put("UAC","Tyrosine");
        map.put("UGU", "Cysteine");
        map.put("UGC","Cysteine");
        map.put("UGG","Tryptophan");
        map.put("UGC","Cysteine");
        map.put("UAA", "STOP");
        map.put("UAG","STOP");
        map.put("UGA", "STOP");
        return map;
    }
}
