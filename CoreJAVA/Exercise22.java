import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Exercise22 {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
       try{
        FileWriter f = new FileWriter("output.txt");
        f.write(str);
        f.close();
       } 
       catch(IOException e){
        System.out.println("Can't write to file");
        
       }
    }
}
