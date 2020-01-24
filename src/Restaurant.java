import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class Restaurant {
    private String restaurantName ;
    private int guestCapacity;
    private int guestCount;



    public void openRestaurantSummary(String name, int capacity,int count){
        this.restaurantName=name;
        this.guestCapacity=capacity;
        this.guestCount=count;
        System.out.println("name"+ name);
        System.out.println("capacity"+capacity);
        System.out.println("count"+ count);

    }

    public boolean isAvailableSeats(int partySize) {
        boolean available = false;
        int availableSeats = guestCapacity - guestCount;
        if (availableSeats >= partySize) {
            available = true;
            System.out.println( "the number of seats " +availableSeats);
        }
        return available;
    }
    public void seatParty(int partySize) {

        guestCount = guestCount + partySize;
    }
    public void removeParty(int partySize) {

        guestCount = guestCount-partySize;
    }

//   public void setHost (String name, int capacity){
//       this.restaurantName=name;
//        this.guestCapacity=capacity;
    }


