public class Exercise13 {
    int fibo(int n){
        if(n == 0){
            return 0;
        }
        else if(n ==1){
            return 1;
        }

        return fibo(n-1) + fibo(n-2);
    }

    public static void main(String args[]){
        Exercise13 obj = new Exercise13();
        System.out.println(obj.fibo(3));
    }
}
