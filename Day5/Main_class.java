package Day5;

public class Main_class {
    public static void main(String[] args) {

        MathOperations math = new MathOperations();
        System.out.println("Sum of 2 and 3 : " + math.add(2,3));  // calls the int add(int a, int b) function
        System.out.println("Sum of 2 and 3 and 4 : " + math.add(2,3,4));// calls int add(int a,int b,int c) function
        System.out.println("Sum of 2.5 and 6.6 : " + math.add(2.5,6.6));// calls the double(double a, double b) function



    }
}
