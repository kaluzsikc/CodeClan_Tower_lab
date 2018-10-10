import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest;

    @Before
    public void before() {
        bedroom = new Bedroom(1, 2,"Double", 100.00 );
        guest = new Guest("Bob");
    }

    @Test
    public void hasNumber(){
        assertEquals(1, bedroom.getNumber());
    }

    @Test
    public void hasCapacity(){
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void hasType(){
        assertEquals("Double", bedroom.getType());
    }

    @Test
    public void hasRate(){
        assertEquals(100.00, bedroom.getRate(),  0.01);
    }

    @Test
    public void emptyArray(){
        assertEquals(0, bedroom.getGuests());
    }

    @Test
    public void addGuest() {
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.getGuests());
    }

    @Test
    public void removeGuest() {
        bedroom.addGuest(guest);
        bedroom.removeGuest(guest);
        assertEquals(0, bedroom.getGuests());
    }

}
