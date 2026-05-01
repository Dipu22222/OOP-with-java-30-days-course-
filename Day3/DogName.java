package Day3;

public class DogName {
    String Name;
    // parameterize constructor
    public DogName(String Name) {
        this.Name = Name;
    }
    public void display() {
        System.out.println("The Dog Name: " + Name);
    }
}
