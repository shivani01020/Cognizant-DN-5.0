import java.util.ArrayList;
import java.util.Scanner;
public class Exercise24{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>(); 
        System.out.println("Enter the number of name you want to add");
        int n = sc.nextInt();
        for(int i=0; i<=n ; i++){
            String str = sc.nextLine();
            list.add(str);
        }

        for(String s : list){
            System.out.println(s);
        }
    }
}