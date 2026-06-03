import java.util.Scanner;

public class Exercise20 {
   public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    try{
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a/b;
        System.out.println("Result : " + c); 
    }
    catch(ArithmeticException e){
        System.out.println("Cannot divide by zero");
        System.out.println(e.getMessage());
    }
   } 
}
