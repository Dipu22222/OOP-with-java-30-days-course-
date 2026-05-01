package Day2;

public class MainPerson {
    public static void main(String[] args) {
        // creating a new person object
        person MYPerson = new person("Dipu Mondol",23);
        // accessing the name using getter method
        System.out.println("Name: " + MYPerson.getName());
        // accessing the age using getter method
        System.out.println("age: " + MYPerson.getAge());
        System.out.println("\n******UPDATED USING SETTER METHOD******\n");
        // modifying information using setter
        MYPerson.setName("Dipto Mondol");
        MYPerson.setAge(28);
        // Displaying the updated information
        System.out.println("Updated Name: " + MYPerson.getName());
        System.out.println("Updated age: " + MYPerson.getAge());
        // Trying to set negative age
        MYPerson.setAge(-20);
    }
}
