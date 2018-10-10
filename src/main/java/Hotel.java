import java.util.ArrayList;
import java.util.BitSet;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<DiningRoom> diningRooms;

    public Hotel(){
        this.bedrooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
        this.diningRooms = new ArrayList<>();
//        ArrayList<Bedroom> bedrooms = new ArrayList<>();
//        ArrayList<ConferenceRoom> conferenceRooms = new ArrayList<>();
//        ArrayList<DiningRoom> diningRooms = new ArrayList<>();
//        this.rooms.add(bedrooms);
//        this.rooms.add(conferenceRooms);
//        this.rooms.add(diningRooms);
    }

    public int getNumberOfBedrooms() {
        return bedrooms.size();
    }

    public int getNumberOfConferenceRooms() {
        return conferenceRooms.size();
    }

    public int getNumberOfDiningRooms() {
        return diningRooms.size();
    }

    public void addBedroom(Bedroom bedroom) {
        bedrooms.add(bedroom);
    }

    public void checkInGuest(Guest guest, Bedroom bedroom) {
        if(bedroom.getGuests() == 0 ){
            bedroom.addGuest(guest);
        }
    }

    public void checkOutGuest(Guest guest, Bedroom bedroom) {
        bedroom.removeGuest(guest);
    }

    public Booking bookRoom(Bedroom bedroom, int nights) {
        Booking booking = new Booking(bedroom, 2);
        return booking;
    }

    public double getTotalBill(Booking booking) {
       return booking.getBedroom().getRate() * booking.getNights();
    }

    public ArrayList getVacantBedrooms() {
        ArrayList<Bedroom> vacantBedrooms = new ArrayList<>();
        for (Bedroom bedroom : this.bedrooms){
            if(bedroom.getGuests() == 0 ){
                vacantBedrooms.add(bedroom);
            }
        }
        return vacantBedrooms;
    }
}
