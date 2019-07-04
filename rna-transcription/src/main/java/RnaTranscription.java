import java.util.Map;
import java.util.HashMap;
class RnaTranscription {
    Map<Character,Character> getDnaNucleotidesComplement(){
        Map<Character,Character> map=new HashMap<Character,Character>();
        map.put('G','C');
        map.put('C','G');
        map.put('T','A');
        map.put('A','U');
        return map;
    }
    String transcribe(String dnaStrand) {
        Map dnaNucleotidesComplement= getDnaNucleotidesComplement();
        String rnaStrand="";
        int length=dnaStrand.length();
        for(int i=0;i<length;i++){
            rnaStrand+=dnaNucleotidesComplement.get(dnaStrand.charAt(i));
        }
        return rnaStrand;
        
    }

}
