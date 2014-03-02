package venerie

class Booking {

    // not visible
    Date date = new Date()

    static belongsTo = [performance: Performance, spectator: Spectator]
    static hasMany = [bookingDetails: BookingDetail]


    static constraints = {
    }


}
