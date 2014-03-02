package venerie

class Spectacle {

    String name
    String description

    static hasMany = [medias:Media, performances:Performance]


    static constraints = {
        name()
        description()
        performances()
        medias()
    }


    @Override
    public String toString() {
        return name
    }
}
