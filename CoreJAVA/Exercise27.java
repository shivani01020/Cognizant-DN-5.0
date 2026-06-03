import java.util.*;
class Exercise27{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Enter a number");
        int n = sc.nextInt();
        for(int i =0; i< n; i++){
            String str = sc.next();
            list.add(str);
        }
        Collections.sort(list, (s1, s2) -> s1.compareTo(s2));
        System.out.println("Sorted List : ");
        for(String names: list){
            System.out.println(names);
        }

    }
}