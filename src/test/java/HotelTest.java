import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    ConferenceRoom conferenceRoom;
    DiningRoom diningRoom;
    Bedroom bedroom;
    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;
    Bedroom bedroom4;
    Guest guest;

    @Before
    public void before() {
        hotel = new Hotel();
        conferenceRoom = new ConferenceRoom("Conference 1", 100);
        diningRoom = new DiningRoom("Dining 1", 100);
        bedroom = new Bedroom(1, 2 , "double", 100.00);
        bedroom1 = new Bedroom(1, 2 , "double", 100.00);
        bedroom2 = new Bedroom(1, 2 , "double", 100.00);
        bedroom3 = new Bedroom(1, 2 , "double", 100.00);
        bedroom4 = new Bedroom(1, 2 , "double", 100.00);
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
    public void checkInGuestEmptyRoom(){
        hotel.checkInGuest(guest, bedroom);
        assertEquals(1, bedroom.getGuests());
    }

    @Test
    public void checkInGuestBookedRoom(){
        hotel.checkInGuest(guest, bedroom);
        assertEquals(1, bedroom.getGuests());

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

    @Test
    public void getListOfVacantBedrooms() {
        hotel.addBedroom(bedroom1);
        hotel.addBedroom(bedroom2);
        hotel.addBedroom(bedroom3);
        hotel.addBedroom(bedroom4);

        hotel.checkInGuest(guest, bedroom1);

        assertEquals(3, hotel.getVacantBedrooms().size());

    }

}
