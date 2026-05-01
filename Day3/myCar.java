package Day3;

public class myCar {
    String model;
    int year;
    // no argument constructor with default attributes value
    myCar() {
        model = "Default";
        year = 2025;
    }
    void displayinfor() {
        System.out.println("car model: " + model);
        System.out.println("car year: " + year);
    }
}
