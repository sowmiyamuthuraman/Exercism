class IsogramChecker {

    boolean isIsogram(String phrase) {
     boolean isIsogram=true;
     int flags[]=new int[26];
     phrase=phrase.toLowerCase();
     for(int i=0;i<phrase.length();i++){
         if(phrase.charAt(i)>=97 && phrase.charAt(i)<=122){
             flags[phrase.charAt(i)-97]++;
             if(flags[phrase.charAt(i)-97]>1){
                 isIsogram=false;
                 break;
             }
         }
     }
     return isIsogram;
 }

}
