import java.util.ArrayList;

public class ConferenceRoom {

    private String name;
    private int capacity;
    private ArrayList<Guest> guests;

    public ConferenceRoom(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
    }


    public int numberOfGuests() {
        return this.guests.size();
    }

    public void addGuest(Guest guest) {
        if(isFull()){return;}

        this.guests.add(guest);
    }

    public void removeGuest(Guest guest) {
        this.guests.remove(guest);
    }

    public boolean isFull() {
        return numberOfGuests() >= this.capacity;
    }

}
