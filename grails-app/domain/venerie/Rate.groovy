package venerie

class Rate {

    String description
    int price

    static belongsTo = [performance: Performance]

    static constraints = {
    }


    @Override
    public String toString() {
        return  "$description ($price euro)"
    }
}
