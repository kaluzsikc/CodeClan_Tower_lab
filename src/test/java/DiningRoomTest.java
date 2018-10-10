import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {
    DiningRoom diningRoom;

    @Before
    public void before() {
        diningRoom = new DiningRoom("Dining Room 1", 100 );
    }

    @Test
    public void hasName(){
        assertEquals("Dining Room 1", diningRoom.getName());
    }

    @Test
    public void hasCapacity(){
        assertEquals(100, diningRoom.getCapacity());
    }

    @Test
    public void emptyArray(){
        assertEquals(0, diningRoom.getGuests());
    }
}
