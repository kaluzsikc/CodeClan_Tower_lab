import java.util.ArrayList;

public class Bedroom {

        private int number;
        private int capacity;
        private String type;
        private double rate;
        private ArrayList<Guest> guests;

        public Bedroom(int number, int capacity, String type, double rate){
            this.number = number;
            this.capacity = capacity;
            this.type = type;
            this.rate = rate;
            this.guests = new ArrayList<>();
        };

    public int getNumber() {
        return number;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getType() {
        return type;
    }

    public double getRate() {
        return rate;
    }

    public int getGuests() {
        return guests.size();
    }

    public void addGuest(Guest guest) {
        guests.add(guest);
    }

    public void removeGuest(Guest guest) {
        guests.remove(guest);
    }
}
