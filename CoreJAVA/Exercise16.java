import java.util.Scanner;

public class Exercise16 {
    boolean isPalindrome(String str){
        String cleaned = String.valueOf(str).replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String original = cleaned;
        String rev = "";
        for(int i = cleaned.length() -1 ; i>=0; i--){
            rev = rev + cleaned.charAt(i);
        }

        if(original.equals(rev)){
            return true;
        }
        return false;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Exercise16 obj = new Exercise16();
        String str = sc.nextLine();
        System.out.println(obj.isPalindrome(str));
    }
}
