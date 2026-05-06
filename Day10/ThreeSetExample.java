package Day10;
import java.util.TreeSet;
public class ThreeSetExample {
    public static void main(String[] args) {
        // Creating a treeset
        TreeSet<Integer> numbers = new TreeSet<>();
        // Adding elements in the treeset
        numbers.add(1);
        numbers.add(4);
        numbers.add(3);
        numbers.add(5);
        numbers.add(3); // duplicate will not be allowed
        // Displaying the numbers elements
        System.out.println("The numbers are: " + numbers);
        // Checking if an element exists or not
        if(numbers.contains(5)) {
            System.out.println("The number 5 is in the numbers TreeSet");
        }
        // Removing an element
        numbers.remove(5);
        System.out.println("After removal the numbers : " + numbers);

    }
}
