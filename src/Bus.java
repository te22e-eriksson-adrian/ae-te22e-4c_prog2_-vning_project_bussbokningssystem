import java.util.ArrayList;

public class Bus {
    // Attributes
    private ArrayList <Seat> seats = new ArrayList<>();
    private String destination;

    // Methods
    public Bus(){
        //jj
    }
    public Seat getSeatInfo(){  //Be aware of temporary fake return here!
        Seat x = new Seat();
        return x;
    }
}
