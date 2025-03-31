public class Main {
    public static void main(String[] args) {
        // Demonstrate polymorphism
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        
        System.out.println("Dog says: " + myDog.makeSound());
        System.out.println("Cat says: " + myCat.makeSound());
    }
}
