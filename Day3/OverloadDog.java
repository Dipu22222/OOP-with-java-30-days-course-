

public class OverloadDog {
    String name;
    int age;
    // Default constructor
    OverloadDog() {
        name = "UNKNOWN";
        age = 0;
    }
    // parameterize constructor with one parameter
    OverloadDog(String name) {
        this.name = name;
        age = 0;
    }
    // parameterize constructor with two parameter
    OverloadDog(String name,int age) {
        this.name = name;
        this.age = age;
    }
    public void display() {
        System.out.println("Dog Name: " + name);
        System.out.println("Dog age: " + age);
    }
}
