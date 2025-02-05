import java.util.Scanner;
import java.util.Random;

public class Person {
    // Attributs
    private int id;
    private String name;
    //private Booking booking = new Booking();

    Scanner keyboard = new Scanner(System.in);
    Random generator = new Random();

    // Methods
    public Person(){
        System.out.print("Creating new person... \n- Name: ");
        String newName = keyboard.nextLine();
        newName = name;

        int idGen = generator.nextInt(0, 1000000);  //How to know wether its uniqe or not?
        idGen = id;
        System.out.println("- id: "+idGen);
    }
    public String getName(){
        return name;
    }
    public void addBooking(){
        //jj
    }
}
