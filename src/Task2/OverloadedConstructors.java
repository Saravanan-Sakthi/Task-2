package Task2;
public class OverloadedConstructors {
    OverloadedConstructors(int number){
        System.out.println("integer constructor is called "+number);
    }
    OverloadedConstructors(float number){
        System.out.println("float constructor is called "+number);
    }
    OverloadedConstructors(String word){
        System.out.println("String constructor is called "+word);
    }
}
