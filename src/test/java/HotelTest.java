import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Bedroom singleBedroom;
    private Bedroom doubleBedroom;
    private ConferenceRoom conferenceRoom;
    private ConferenceRoom smallConferenceRoom;
    private Guest guest;

    @Before
    public void setUp(){
        singleBedroom = new Bedroom(1, 1, "single");
        doubleBedroom = new Bedroom(2, 2, "double");
        conferenceRoom = new ConferenceRoom("Hopper", 100);
        smallConferenceRoom = new ConferenceRoom("Neumann", 1);

        ArrayList<Bedroom> bedrooms = new ArrayList<Bedroom>();
        bedrooms.add(singleBedroom);
        bedrooms.add(doubleBedroom);

        ArrayList<ConferenceRoom> conferenceRooms = new ArrayList<ConferenceRoom>();
        conferenceRooms.add(conferenceRoom);
        conferenceRooms.add(smallConferenceRoom);

        guest = new Guest("Louise");

        hotel = new Hotel(bedrooms, conferenceRooms);
    }

    @Test
    public void canCheckInGuest(){
        hotel.checkInGuestToRoom(guest, singleBedroom);
        assertEquals(1, singleBedroom.numberOfGuests());
    }

}
