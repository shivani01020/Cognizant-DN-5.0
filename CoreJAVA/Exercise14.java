public class Exercise14 {

    int arraysum(int [] arr){
        int sum = 0;
        for(int i=0; i< arr.length; i++){
            sum = sum + arr[i];
        }
        return sum;
    }

    float arrayAvg(int [] arr){
        int sum = arraysum(arr);
        float avg = sum / arr.length;
        return avg;
    }
    
    public static void main(String[] args) {
        int [] arr = {4, 5, 7, 89, 100};
        Exercise14 obj = new Exercise14();
        System.out.println(obj.arraysum(arr));
        System.out.println(obj.arrayAvg(arr));
    }
}
