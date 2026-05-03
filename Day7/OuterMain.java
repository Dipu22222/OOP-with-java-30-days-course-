package Day7;

public class OuterMain {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass(); // create an instance of outer class
        OuterClass.InnerClass inner = outer.new InnerClass(); // create an instance of inner class
        inner.display(); // call the display method

    }
}
