class BeerSong{
    static final String VERSE1="%s %s of beer on the wall, %s %s of beer.\n";
    static String VERSE2="Take %s down and pass it around, %s %s of beer on the wall.\n\n";
    static String FINALVERSE="Go to the store and buy some more, 99 bottles of beer on the wall.\n\n";


   String sing(int bottles,int verses){
    StringBuilder song=new StringBuilder("");
    for(int i=0;i<verses;i++,bottles--){
        song.append(constructVerse(bottles));
    }
    return song.toString();
    }

    String constructVerse(int numOfBottles){
        String verse="";
        if(numOfBottles==0){
            verse+=String.format(VERSE1,"No more","bottles","no more","bottles");
            verse+=FINALVERSE;
        }
        else{
            verse+=String.format(VERSE1,String.valueOf(numOfBottles),numOfBottles==1?"bottle":"bottles",String.valueOf(numOfBottles),numOfBottles==1?"bottle":"bottles");
            verse+=String.format(VERSE2,numOfBottles==1?"it":"one",--numOfBottles==0?"no more":numOfBottles,numOfBottles==1?"bottle":"bottles");
        }
        return verse;
    }
   String singSong(){
        return sing(99,100);
    }
}