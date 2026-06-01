import java.util.Random;
import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int a = r.nextInt(0, 100);
        while(true){
        System.out.println("Guess a number");
        int b = sc.nextInt();

        if(a < b){
            System.out.println("Number is large");
        }

        else if(a > b){
            System.out.println("Number is low");
        }

        else if ( a == b){
            System.out.println("The number is correct");
            break;
        }
        }
    }
}
