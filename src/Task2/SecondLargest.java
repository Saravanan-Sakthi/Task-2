package Task2;
import java.util.Arrays;
public class SecondLargest {
    Integer [] masterarray;
    SecondLargest(Integer [] masterarray){
        this.masterarray= masterarray;
    }
    public int secondLargest(){
        Arrays.sort(masterarray);
        int nthlarge=2-1;
        int nthlargest=masterarray[masterarray.length-1];
        for (int iterator=masterarray.length-2;iterator>=0;iterator--){
            if (masterarray[iterator]!=nthlargest) {
                if (nthlarge<=0) break;
                nthlargest=masterarray[iterator];
                nthlarge--;
            }
        }
        return (nthlargest);
    }
}
