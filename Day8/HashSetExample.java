package Day8;
import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // Creating a Hash Set
        HashSet<String> Colors = new HashSet<>();
        // adding elements
        Colors.add("Red");
        Colors.add("Blue");
        Colors.add("Green");
        Colors.add("Violet");
        Colors.add("Red"); // Duplicate element
        // Displaying the elements
        System.out.println("The colors: " + Colors);


    }
}
