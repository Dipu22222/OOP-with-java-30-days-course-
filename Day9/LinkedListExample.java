package Day9;
import Day7.Library;

import java.util.LinkedList;
public class LinkedListExample {
    public static void main(String[] args) {
        // creating a linked list
        LinkedList<String> colors = new LinkedList<>();
        // Adding elements to the Linked list
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        // Accessing an element
        System.out.println("First color: " + colors.get(0));
        // Remove an element
        colors.remove("Green");
        // Printing the elements
        System.out.println("The Colors: " + colors);
        
    }
}
