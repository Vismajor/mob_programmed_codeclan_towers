import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int capacity;
    private ArrayList<Guest> guests;
    private String type;

    public Bedroom(
            int roomNumber,
            int capacity,
            String type
    ){
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
        this.type = type;
    }

    public int numberOfGuests() {
        return this.guests.size();
    }

    public void addGuest(Guest guest){
        if(isFull()) { return; }

        this.guests.add(guest);
    }

    public void removeGuest(Guest guest) {
        this.guests.remove(guest);
    }

    public boolean isEmpty() {
        return this.guests.isEmpty();
    }

    public boolean isFull() {
        return numberOfGuests() >= this.capacity;
    }

}
