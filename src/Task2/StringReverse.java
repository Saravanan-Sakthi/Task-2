package Task2;
public class StringReverse {
    String masterstring;
    StringReverse(String masterstring){
        this.masterstring= masterstring;
    }
    public String reverse(){
        StringBuilder output=new StringBuilder(masterstring);
        output.reverse();
        return output.toString();
    }
}
