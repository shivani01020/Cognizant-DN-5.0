class Animal{
    void makeSound(){
        System.out.println("Sound of Animal");
    }
}

class Dog extends Animal{
    void makeSound(){
        System.out.println("Bark");
    }
}

public class Exercise18 {
    public static void main(String args[]){
        Animal a= new Dog();
        a.makeSound();
    }
}
