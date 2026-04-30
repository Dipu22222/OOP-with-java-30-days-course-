public class day1_Main {
    public static void main(String[] args) {
        // creating an object of day1_car class
        day1_car mycar = new day1_car();
        // Assigning value to the object's attributes
        mycar.model = "Pagani";
        mycar.color = "Silver";
        mycar.year = 2040;
        // showing the information of the object
        mycar.displayinfo();
    }
}
