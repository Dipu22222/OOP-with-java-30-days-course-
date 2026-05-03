package Day7;

public class OuterClass {
    int outerVariable = 10;
    class InnerClass {
        void display() {
            System.out.println("Outer variable: " + outerVariable);
        }
    }
}
