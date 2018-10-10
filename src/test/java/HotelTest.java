import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    ConferenceRoom conferenceRoom;
    DiningRoom diningRoom;
    Bedroom bedroom;
    Guest guest;

    @Before
    public void before() {
        hotel = new Hotel();
        conferenceRoom = new ConferenceRoom("Conference 1", 100);
        diningRoom = new DiningRoom("Dining 1", 100);
        bedroom = new Bedroom(1, 2 , "double", 100.00);
        guest = new Guest("Bob");
    }

    @Test
    public void numberOfBedrooms(){
        assertEquals(0, hotel.getNumberOfBedrooms());
    }

    @Test
    public void numberOfConferenceRooms(){
        assertEquals(0, hotel.getNumberOfConferenceRooms());
    }

    @Test
    public void numberOfDiningRooms(){
        assertEquals(0, hotel.getNumberOfDiningRooms());
    }

    @Test
    public void addBedroom(){
        hotel.addBedroom(bedroom);
        assertEquals(1, hotel.getNumberOfBedrooms());
    }

    @Test
    public void checkInGuest(){
        hotel.checkInGuest(guest, bedroom);
        assertEquals(1, bedroom.getGuests());
    }

    @Test
    public void checkOutGuest(){
        hotel.checkInGuest(guest, bedroom);
        hotel.checkOutGuest(guest, bedroom);
        assertEquals(0, bedroom.getGuests());
    }

    @Test
    public void canBookRoom(){
        Booking booking =  hotel.bookRoom(bedroom, 2);
        assertEquals(bedroom, booking.getBedroom());
        assertEquals(2, booking.getNights());

    }

    @Test
    public void getTotal() {
        Booking booking = hotel.bookRoom(bedroom, 2);
        assertEquals(200.00, hotel.getTotalBill(booking), 0.01);
    }

}
