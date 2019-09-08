public class Plane {
    public int getPlaneTypeweight;
    private PlaneType planeType;


    public Plane(PlaneType planeType) {
        this.planeType = planeType;
    }


    public PlaneType getPlaneType() {
        return this.planeType;
    }

    public PlaneType getPlaneTypeFromEnum() {

        return planeType;
    }


    public int countSeatscapacity() {

        return this.planeType.getSeatscapacity();
    }

    public int countWeight() {

        return this.planeType.getWeight();
    }

    public int getSeatscapacity() {

        return this.planeType.getSeatscapacity();
    }


    public int bagsweight() {
        return this.planeType.weight / 2;
    }

    public int bagweightperperson() {
        return this.bagsweight() / this.countSeatscapacity();
    }

    public int getPlaneTypeUpdatedSeatscapacity() {

        return 1;
    }

    public int getPlaneTypeReaminingWeight(Flight flight) {
        return this.bagsweight() - flight.passengertotalbagsweight();
    }

    private int getPlaneTypeweight() {
        final int weight = this.planeType.weight;
        return weight;
    }
}


