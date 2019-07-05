import java.util.Optional;

class IsbnVerifier {

    boolean isValid(String stringToVerify) {
        stringToVerify=stringToVerify.replaceAll("-","");
        boolean isIsbnNumber=false;
        int value=0;
        int counter=10;
        if(stringToVerify.matches("^[\\d*]{9}[X|\\d]$")){
        for(char letter:stringToVerify.toCharArray()){
            letter = letter=='X'?10:letter;
            int intValue=Character.getNumericValue(letter);
            value+=(counter*intValue);
            counter--;
        }
        if(value%11==0){
            isIsbnNumber=true;
        }
    }
        return isIsbnNumber;
    }

}
