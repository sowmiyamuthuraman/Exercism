class ReverseString {

    String reverse(String inputString) {
        String reversedString="";
        int length=inputString.length();
        for(int i=length-1;i>=0;i--){
            reversedString+=inputString.charAt(i);
        }
        return reversedString;
    }
  
}