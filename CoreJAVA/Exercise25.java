import java.util.HashMap;
import java.util.Scanner;
public class Exercise25{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        HashMap<Integer, String> map = new HashMap<>();
        System.out.println("Enter the number of students you want to add");
        int n = sc.nextInt();
        for(int i=0 ; i< n; i++){
            System.out.println("Enter the id");
            int id = sc.nextInt();
            System.out.println("Enter the name");
            String name = sc.next();
            map.put(id, name);
        }
        System.out.println("Enter the id of student you want to search");

        int id = sc.nextInt();
        System.out.println(map.get(id)); 
        
    }
}