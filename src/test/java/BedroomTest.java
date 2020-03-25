import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BedroomTest {

    Bedroom singleBedroom;
    Guest guest;

    @Before
    public void setUp(){
        singleBedroom = new Bedroom(
                9,
                1,
                "single"
        );
        guest = new Guest("John Harper");
    }

    @Test
    public void roomShouldStartEmpty(){
        assertEquals(0, singleBedroom.numberOfGuests());
    }

    @Test
    public void canAddGuest(){
        singleBedroom.addGuest(guest);
        assertEquals(1, singleBedroom.numberOfGuests());
    }

    @Test
    public void canRemoveGuest(){
        singleBedroom.addGuest(guest);
        singleBedroom.removeGuest(guest);
        assertEquals(0, singleBedroom.numberOfGuests());
    }

    @Test
    public void checkIfRoomIsEmpty(){
        singleBedroom.addGuest(guest);
        assertFalse(singleBedroom.isEmpty());
    }

    @Test
    public void checkIfRoomIsFull(){
        singleBedroom.addGuest(guest);
        assertTrue(singleBedroom.isFull());
    }

    @Test
    public void cannotAddGuestIfFull(){
        singleBedroom.addGuest(guest);
        singleBedroom.addGuest(guest);
        assertEquals(1, singleBedroom.numberOfGuests());
    }

}
