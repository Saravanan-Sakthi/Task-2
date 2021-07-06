package Task2;
import java.util.Arrays;
public class AlternateMaxMin {
    Integer []masterarray;
    AlternateMaxMin(Integer [] masterarray){
        Arrays.sort(masterarray);
        this.masterarray= masterarray;
    }
    Integer [] alternateElements(int nth){
        if (nth<masterarray.length){
            int temp=masterarray[masterarray.length-1];
            for (int i=masterarray.length-1;i>nth;i--){
                masterarray[i]=masterarray[i-1];
            }
            masterarray[nth]=temp;
            alternateElements(nth+2); 
        }
        return masterarray;
    }
}
