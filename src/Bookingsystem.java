import java.util.Scanner;
import java.util.ArrayList;

public class Bookingsystem {
    // Attrinutes
    private ArrayList <Booking> bookings = new ArrayList<>();
    private ArrayList <Person> costumers = new ArrayList<>();
    private Bus bus = new Bus();

    Scanner keyboard = new Scanner(System.in);

    public Bookingsystem(){
        createInfo();

        menu();
    }

    // Methods
    public void menu(){
        int choice = 0;

        while (choice != 5){
            System.out.println("Menu:       (Please answer by using only any of the numbers corresponding to each option mentioned below.) \n1. Create a new booking \n2. Se your current valid bookings \n3. Change booking \n4. Cancell booking \n5. Shut down program.");
            System.out.print("Choice: ");
            choice = keyboard.nextInt();
            keyboard.nextLine();

            switch (choice) {
                case 1:
                    
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                default:
                    System.out.println("Faulty input, please start the program and try again using the numbers displayed to navigate the program.");
                    choice = 5;
                    break;
            }
        }
        System.out.println("Shuting down...");
    }
    public void createBooking(){
        //jj
    }
    public void createInfo(){
        for (int i = 0; i < 3; i++) {
            Person standardCostumer = new Person();
        }
    }
}
