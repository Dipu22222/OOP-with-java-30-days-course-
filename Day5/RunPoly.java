package Day5;

public class RunPoly {
    public static void main(String[] args) {
        Animal myAnimal; // Declared and Animal reference
        myAnimal = new Dog();// Assign Dog object
        myAnimal.sound(); // outputs Dog barks
        myAnimal = new Cat(); // Assign cat object
        myAnimal.sound(); // output cats meow
    }
}
