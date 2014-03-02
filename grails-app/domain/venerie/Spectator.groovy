package venerie

class Spectator {

    String name
    // link to certain user?

    static hasMany = [bookings: Booking]


    static constraints = {
    }
}
