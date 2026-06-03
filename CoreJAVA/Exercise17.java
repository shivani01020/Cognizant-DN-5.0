class car{
    String make;
    String model;
    int year;

    void displaydetails(String make, String model, int year){
        System.out.println("Make : " +make);
        System.out.println("Model : " + model);
        System.out.println("Year : " + year);
    }

}

public class Exercise17 {

    public static void main(String[] args) {
        car c1 = new car();
        c1.displaydetails("Maruti", "Swift", 2019);
        
    }
}
