import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
       
            if((a %4 == 0 && a%100 != 0) ||  (a % 400 == 0)){
                System.out.println("Leap Year");
            }
            else{
                System.out.println("Not a Leap Year");
            }
        
    }
}
