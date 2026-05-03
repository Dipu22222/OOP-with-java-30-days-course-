package Day7;
public class MethodOuterClass {

        void myMethod() {
            class MethodInner {
                void display() {
                    System.out.println("Inside method local inner class");
                }
            }
            MethodInner inner = new MethodInner();
            inner.display();
        }
    }