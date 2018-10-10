import java.util.ArrayList;

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
        bedroom.addGuest(guest);
    }

    public void checkOutGuest(Guest guest, Bedroom bedroom) {
        bedroom.removeGuest(guest);
    }
}
