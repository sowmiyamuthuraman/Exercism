class Proverb {
    String words[];
    Proverb(String[] words) {
        this.words=words;
    }

    String recite() {
        String proverb="";
        if(words.length!=0){
        for(int i=0;i<words.length-1;i++){
            proverb+=String.format("For want of a %s the %s was lost.\n",words[i],words[i+1]);
        }
        proverb+=String.format("And all for the want of a %s.",words[0]);
    }
        return proverb;
    }

}
