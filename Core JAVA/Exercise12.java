class Exercise12{
    int add(int a, int b){
        return a+ b;
    }

    int add(int a, int b, int c){
        return a + b + c;
    }

    double add(double a, double b){
        return a + b;
    }
    
    public static void main(String args[]){
        Exercise12 obj = new Exercise12();
        System.out.println(obj.add(56,78));
        System.out.println(obj.add(45, 78, 23));
        System.out.println(obj.add(23.567, 72.56));
    }
}