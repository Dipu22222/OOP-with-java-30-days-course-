package Day8;
import java.util.HashMap;
public class HashMapExample {
    public static void main(String[] args) {
        //Creating a hash map
        HashMap<String, Integer> ageMap = new HashMap<>();
        // Adding key-value pair
        ageMap.put("Alice",30);
        ageMap.put("Bob", 25);
        ageMap.put("Charlie", 35);
        //Displaying the pairs
        System.out.println("The AgeMap: " + ageMap);
        // Accessing HashMap by key
         int AliceAge = ageMap.get("Alice");
        System.out.println("The age of Alice: " + AliceAge);
        
    }
}
