import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Booking booking;
    Bedroom bedroom;

    @Before
    public void before() {
        bedroom = new Bedroom(1,2,"double", 100.00);
        booking = new Booking(bedroom, 2);
    }

    @Test
    public void hasBedroom(){
        assertEquals( bedroom, booking.getBedroom() );
    }

    @Test
    public void hasNights() {
        assertEquals(2, booking.getNights());
    }
}
