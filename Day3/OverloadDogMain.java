

public class OverloadDogMain {
    public static void main(String[] args) {
        OverloadDog Dog1 = new OverloadDog(); // calls default constructor
        OverloadDog Dog2 = new OverloadDog("charlie");// one parameterize constructor
        OverloadDog Dog3 = new OverloadDog("ki***r", 23);//two parameterise constructor
        Dog1.display();
        Dog2.display();
        Dog3.display();
    }
}
