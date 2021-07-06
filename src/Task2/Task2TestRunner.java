package Task2;
import java.io.IOException;
import java.util.*;
public class Task2TestRunner {
    public static Scanner getin= new Scanner(System.in);
    public static Integer [] getArray(){
        System.out.print("Enter the size of the array: ");
        int size= getin.nextInt();
        Integer [] masterarray=new Integer[size];
        System.out.print("Enter the elements: ");
        for (int iterator=0;iterator<size;iterator++) masterarray[iterator]= getin.nextInt();
        return masterarray;
    }
    public static void main(String[] args)throws IOException {
        inputloop: while(true){
            System.out.println("Task 2");
            System.out.println("------");
            System.out.println("1. Second Largest\n2. Segregate 0's and 1's\n3. Alternate maximum and minumum\n4. Reverse a String");
            System.out.println("5. Reverse words in message\n6. Convert Array to ArrayList\n7. Print POJO object\n8. Overloaded constructors");
            System.out.println("9. Enum for rainbow colours\n10. Create a File\n11. Exit");
            System.out.print("Enter the option: ");
            int option= getin.nextInt();
            getin.nextLine();
            switch (option){
                case 1:
                    System.out.println("Find Second largest in the array");
                    Integer [] masterarray= getArray();
                    System.out.println("The second largest number is: "+ new SecondLargest(masterarray).secondLargest()+"\n");
                    break;
                case 2:
                    System.out.println("Segregate 0's and 1's");
                    masterarray=getArray();
                    String output= Arrays.toString(new Segregate(masterarray).segregate());
                    System.out.println("The segregated array is : "+output+"\n");
                    break;
                case 3:
                    System.out.println("Alternate maximum and minimum");
                    masterarray= getArray();
                    output= Arrays.toString(new AlternateMaxMin(masterarray).alternateElements(0));
                    System.out.println("The Alternated array is : "+output+"\n");
                    break;
                case 4:
                    System.out.println("Reverse the letters in a string");
                    System.out.print("Enter the string: ");
                    output= new StringReverse(getin.next()).reverse();
                    System.out.println("The reversed string is : "+output+"\n");
                    break;
                case 5:
                    System.out.println("Reverse the words in given message");
                    System.out.print("Enter the message: ");
                    output= new ReverseWords(getin.nextLine()).reverse_words();
                    System.out.println("The Words are reversed: "+output+"\n");
                    break;
                case 6:
                    System.out.println("Convert an Array to ArrayList");
                    masterarray= getArray();
                    ArrayList arraylist= new ConvertToArrayList(masterarray).convert();
                    System.out.print("The ArrayList is: "+arraylist+"\n");
                    break;
                case 7:
                    System.out.println("POJO - Book in Library");
                    BookInLibrary book= new BookInLibrary();
                    System.out.print("Enter the book name:");
                    book.setBookName(getin.nextLine());
                    System.out.print("Enter the author name:");
                    book.setAuthor(getin.nextLine());
                    System.out.print("Enter the number of pages:");
                    book.setPages(getin.nextInt());
                    System.out.print("Enter the rating for the book:");
                    book.setRating(getin.nextInt());
                    System.out.println("\nThe details of the book");
                    System.out.println(book+"\n");
                    break;
                case 8:
                    System.out.println("Overloaded Constrctors");
                    new OverloadedConstructors(5);
                    new OverloadedConstructors(5.0f);
                    new OverloadedConstructors("Saravanan");
                    System.out.println("\n");
                    break;
                case 9:
                    System.out.println("Enum for rainbow colours");
                    RainbowColours [] colours= RainbowColours.values();
                    for (int iterator=0;iterator<colours.length;iterator++) System.out.println("Colour code of "+colours[iterator]+" is "+colours[iterator].code);
                    System.out.println("\n");
                    break;
                case 10:
                    System.out.println("Creating a file");
                    new CreateFile().create();
                    break;
                case 11:
                    System.out.println("The End");
                    break inputloop;
                default:
                    System.out.println("Please enter valid input\n");
            }
        }
    }
    
}
