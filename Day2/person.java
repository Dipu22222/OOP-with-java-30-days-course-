package Day2;

public class person {
    // private attributes
    private String name;
    private int age;
    // Initializing the attributes through public constructor while creating objects
    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // public method to get the name
    public String getName() {
        return name;
    }
    // public method to set the name
    public void setName(String name) {
        this.name = name;
    }
    // public method to get age
    public int getAge() {
        return age;
    }
    // public method to set age
    public void setAge(int age) {
        if(age >= 0) {
            this.age = age;
        }
        else {
            System.out.println("age can't be negative");
        }
    }

}
