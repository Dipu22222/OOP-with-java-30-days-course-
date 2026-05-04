package Day8;
import java.util.ArrayList;
import java.util.List;
public class ListExample {
    public static void main(String[] args) {
        // Creating a list
        List<String> fruits = new ArrayList<>();
        // Adding elements
        fruits.add("Apple");
        fruits.add("Bannana");
        fruits.add("Cherray");
        //Displaying the list
        System.out.println("Fruits are: " + fruits);
        //Accessing an element
        String firstFruit = fruits.get(0);
        System.out.println("First fruit: " + firstFruit);

    }
}
