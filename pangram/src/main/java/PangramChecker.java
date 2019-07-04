import java.util.*;
public class PangramChecker {

    public boolean isPangram(String input) {
        Set<Character> alphabhets=new HashSet<Character>();
        input=input.toLowerCase();
        boolean isPangram=false;
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)>=97 && input.charAt(i)<=122){
            alphabhets.add(input.charAt(i));
            }
        }
        if(alphabhets.size()==26){
            isPangram=true;
        }
        return isPangram;

    }

}
