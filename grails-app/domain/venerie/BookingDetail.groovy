package venerie

class BookingDetail {

    Rate rate
    int numberOfPlace
    static belongsTo = [booking: Booking]

    static constraints = {
    }


    @Override
    public String toString() {
        return "$numberOfPlace $rate"
    }




}
