package venerie

class Entry {

    static belongsTo = [performance: Performance]
    Rate rate

    static constraints = {
    }


    @Override
    public String toString() {
        return rate
    }
}
