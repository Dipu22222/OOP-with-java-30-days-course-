package Day9;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        //Creating an ArrayList
        ArrayList<String> fruits = new ArrayList<>();
        // Adding element to the exiting arraylist
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("water fruit");
        //Accessing an elemet
        System.out.println("First Fruit: " + fruits.get(0));
        // Removing an element
        fruits.remove("water fruit");
        //printing all element
        System.out.println("Fruits are: " + fruits);
    }
}
