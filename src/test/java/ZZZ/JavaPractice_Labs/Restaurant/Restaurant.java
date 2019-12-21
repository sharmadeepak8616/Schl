package ZZZ.JavaPractice_Labs.Restaurant;

public class Restaurant {

/**
 * Create a restaurant class with attribute name, guestCapacity, guestCount
 * 1. Create a method that tells user if the seats are available
 * 2. Create a method that seatsParty
 * 3. Create a method that removesParty
 * 4. Create a method that allows host open for services by passing restaurant name/guestCapacity
 * 5. Create a method that printsRestaurantSummary
 */

    int max;
    int seatsOccupied;
    String name;


    public Restaurant(String rName, int rCapacity) {
        name = rName;
        max = rCapacity;
        System.out.println("In restaurant constructor");
    }

    public void setMaxCapacity(int maxCapacity) {
        max = maxCapacity;
    }

    public void setRestaurantName(String restaurantName) {
        name = restaurantName;
    }


    public void checkAvailability(int howManySeats) {
        if (max-seatsOccupied >= howManySeats) {
            //return true;
            seatParty(howManySeats);
        } else {
            System.out.println("Pls wait");
            //return false;
        }
    }

    public void seatParty(int howManySeats) {
        seatsOccupied = seatsOccupied + howManySeats;
    }

    public void removeParty(int howManySeats) {
        seatsOccupied = seatsOccupied - howManySeats;
    }


}
