import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Multiplication Table");
        for(int i = 1 ; i<=10; i++){
            System.out.println(a* i);
        }
    }
}
