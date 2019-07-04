class RaindropConverter {

    String convert(int number) {
        String numberToString="";
        if(number%3==0){
            numberToString+="Pling";
        }
        if(number%5==0){
            numberToString+="Plang";
        }
        if(number%7==0){
            numberToString+="Plong";
        }
        if(numberToString.equals("")){
            numberToString+=number;
        }
        return numberToString;
    }

}
