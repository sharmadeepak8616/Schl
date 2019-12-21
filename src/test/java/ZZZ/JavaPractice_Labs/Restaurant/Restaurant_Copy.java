package ZZZ.JavaPractice_Labs.Restaurant;

public class Restaurant_Copy {

/**
 * Create a restaurant class with attribute name, guestCapacity, guestCount
 * 1. Create a method that tells user if the seats are available
 * 2. Create a method that seatsParty
 * 3. Create a method that removesParty
 * 4. Create a method that allows host open for services by passing restaurant name/guestCapacity
 * 5. Create a method that printsRestaurantSummary
 */

    /** Method 1 : Create a method that tells user if the seats are available
     * return : boolean
     * arguments : howManySeats (int)
     */

    int max = 20;
    int seatsOccupied;

    public void checkAvailability(int howManySeats) {
        /**
         * max-seatsOccupied >= howManySeats
         *  if above logic is true : return true
         *  else return false
         */
        if (max-seatsOccupied >= howManySeats) {
            //return true;
            seatParty(howManySeats);
        } else {
            System.out.println("Pls wait");
            //return false;
        }
    }

    /** Method 2 : Create a method that seatsParty
     *  return : void
     *  arguments : howManySeats (int)
     */
    public void seatParty(int howManySeats) {
        /**
         * int availability = max-seatsOccupied (20 - 12)
         * availability = availability - howManySeats (8-2) = 6
         */
        seatsOccupied = seatsOccupied + howManySeats;
/*        int availability = max-seatsOccupied;
        availability = availability - howManySeats;*/
    }

    /**Method 3 : Create a method that removesParty
     * return : void
     * arguments : howManySeats (int)
     */
    public void removeParty(int howManySeats) {
        /**
         * int availability = max-seatsOccupied
         * availability = availability + howManySeats
         */
        seatsOccupied = seatsOccupied - howManySeats;
    }


}
