import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Exercise21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int age = sc.nextInt();
            if(age < 18){
                throw new InvalidAgeException("Illegal Age");
            }
            System.out.println(age);
        }
        catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
        
        
    }
}
