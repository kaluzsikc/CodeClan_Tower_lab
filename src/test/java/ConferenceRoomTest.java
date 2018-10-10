import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;

    @Before
    public void before() {
        conferenceRoom = new ConferenceRoom("Conference Room 1", 100 );
    }

    @Test
    public void hasName(){
        assertEquals("Conference Room 1", conferenceRoom.getName());
    }

    @Test
    public void hasCapacity(){
        assertEquals(100, conferenceRoom.getCapacity());
    }

    @Test
    public void emptyArray(){
        assertEquals(0, conferenceRoom.getGuests());
    }

}
