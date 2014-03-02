package venerie

class Performance {

    Date date
    int duration

    static belongsTo = [spectacle: Spectacle, ]

    static hasMany = [entries: Entry, rates:Rate, bookings:Booking]

    Auditorium auditorium


    static constraints = {
        spectacle()
        date()

    }


    @Override
    public String toString() {
        return "$spectacle ($date)"
    }
}
