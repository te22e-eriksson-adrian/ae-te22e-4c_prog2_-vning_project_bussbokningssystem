import java.util.ArrayList;
import java.util.Scanner;

public class Bus {
    // Attributes
    private ArrayList <Seat> seats = new ArrayList<>();
    private String destination;

    Scanner keyboard = new Scanner(System.in);

    // Methods
    public Bus(){
        System.out.print("Creating new Bus... \n- Bus destination: ");
        String destinationChoice = keyboard.nextLine();
        destinationChoice = destination;
        
        for (int i = 0; i < 47; i++) {  //Adds 47 seats per added bus.
            Seat seat = new Seat();
            seats.add(seat);
        }

        System.out.println("A bus with 47 seats with '"+destinationChoice+"' as its destination was successfully created.");
    }
    public Seat getSeatInfo(){  //Be aware of temporary fake return here!
        Seat x = new Seat();
        return x;
    }
}
