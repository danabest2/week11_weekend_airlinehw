public class Plane {
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



}


