package Day10;
import java.util.HashSet;
public class HashSetExample {
    public static void main(String[] args) {
        // Creating hashset
        HashSet<String> fruits = new HashSet<>();
        // adding elements to the HashSet
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherray");
        fruits.add("Banana");
        // Duplicate will not be added
        //Displaying the hashset
        System.out.println("Fruits in the HashSet: " + fruits);
        //checking if an element exists
        if(fruits.contains("Apple")) {
            System.out.println("Apple is present in the hashset");
        }
        // remove an element
        fruits.remove("Apple");
        // After removal the fruits in the hash set
        System.out.println("The fruits are : " + fruits);

    }

}
