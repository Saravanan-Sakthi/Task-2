package Task2;
import java.util.Arrays;
public class Segregate {
    Integer [] masterarray;
    Segregate(Integer [] masterarray){
        this.masterarray= masterarray;
    }
    Integer[] segregate (){
        Arrays.sort(masterarray);
        return masterarray;
    }
}
