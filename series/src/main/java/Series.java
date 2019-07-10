package main.java;
import java.util.ArrayList;;
import java.util.List;
public class Series{

    String number;
    public static final String SMALL_SLICE_SIZE="Slice size is too small.";
    public static final String LARGE_SLICE_SIZE="Slice size is too big.";

    public Series(String number){
        this.number=number;
    }
    public List<String> slices(int slices){
        String errorMsg="";
        List<String> series=new ArrayList<String>();
        errorMsg=slices<=0?SMALL_SLICE_SIZE:slices>number.length()?LARGE_SLICE_SIZE:errorMsg;
        if(errorMsg!=""){
            throw new IllegalArgumentException(errorMsg);
        }
        for(int i=0;i<=number.length()-slices;i++){
            series.add(number.substring(i,i+slices));
        }
        return series;
    }
}