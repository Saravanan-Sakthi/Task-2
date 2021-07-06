package Task2;
import java.util.*;
public class ConvertToArrayList {
    Integer [] masterarray;
    ConvertToArrayList(Integer [] masterarray){
        this.masterarray= masterarray;
    }
    public ArrayList convert(){
        List list= Arrays.asList(masterarray);
        ArrayList <Integer>arraylist=new ArrayList<Integer>(list);
        return arraylist;
    }
}
