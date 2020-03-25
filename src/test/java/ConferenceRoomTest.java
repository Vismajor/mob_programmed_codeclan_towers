import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ConferenceRoomTest {

    private ConferenceRoom conferenceRoom;
    private Guest guest;

    @Before
    public void setUp(){
        conferenceRoom = new ConferenceRoom(
                "Hopper",
                100
        );
        guest = new Guest("Sky Su");
    }

    @Test
    public void shouldStartEmpty(){
        assertEquals(0, conferenceRoom.numberOfGuests());
    }

    @Test
    public void canAddGuest(){
        conferenceRoom.addGuest(guest);
        assertEquals(1, conferenceRoom.numberOfGuests());
    }

    @Test
    public void canRemoveGuest(){
        conferenceRoom.addGuest(guest);
        conferenceRoom.removeGuest(guest);
        assertEquals(0, conferenceRoom.numberOfGuests());
    }

    @Test
    public void canCheckIfFull(){
        ConferenceRoom smallConferenceRoom = new ConferenceRoom("Small room", 1);
        smallConferenceRoom.addGuest(guest);
        assertTrue(smallConferenceRoom.isFull());
    }

    @Test
    public void cannotAddGuestIfFull(){
        ConferenceRoom smallConferenceRoom = new ConferenceRoom("Small room", 1);
        smallConferenceRoom.addGuest(guest);
        smallConferenceRoom.addGuest(guest);
        assertEquals(1, smallConferenceRoom.numberOfGuests());
    }


}
