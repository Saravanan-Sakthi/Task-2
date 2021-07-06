package Task2;
import java.io.*;
public class CreateFile {
    public void create()throws IOException{
        String output="Programmatically created file.\n";
        try{
            FileOutputStream filestream= new FileOutputStream("sample.txt");
            byte [] content= output.getBytes();
            filestream.write(content);
            output="These words were written programmatically.\n";
            content= output.getBytes();
            filestream.write(content);
            output="All is Well. Be happy & enjoy the moment.\n";
            content= output.getBytes();
            filestream.write(content);
            filestream.close();
            System.out.println("File created successfully\n");
        }
        catch(FileNotFoundException exception){
            System.out.println("File not created");
        }
    }
}
