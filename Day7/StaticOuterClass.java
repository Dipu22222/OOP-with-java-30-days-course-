package Day7;



public class StaticOuterClass {
    static int StaticVariable = 20;
    static class StaticNestedClass {
        void show() {
            System.out.println("Static variable value: " + StaticVariable);
        }
    }
}
