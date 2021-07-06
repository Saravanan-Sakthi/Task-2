package Task2;
public class ReverseWords {
    String masterstring;
    ReverseWords(String masterstring){
        this.masterstring= masterstring;
    }
    public String reverse_words(){
        String [] stringarray= masterstring.split(" ");
        String output="";
        for (int iterator= stringarray.length-1;iterator>=0;iterator--){
            output=output+stringarray[iterator]+" ";
        }
        return output;
    }
}
