

public class MainAnimal {
    public static void main(String[] args) {
        subDog mydog = new subDog();
        mydog.name = "Buddy"; // setting the name
        mydog.eat(); // Inherited method from Animal super class
        mydog.bark(); // Method from Dog class
    }
}
