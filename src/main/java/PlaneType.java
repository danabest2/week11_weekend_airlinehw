public enum PlaneType {

    Boeing777(150, 3000),
    Boeing737(200, 4000);

    //Airbus319(180, 4600),
    // Bombardier(130, 5000)


    public int seatscapacity;
    public int weight;

    PlaneType(int seatscapacity, int weight) {
        this.seatscapacity = seatscapacity;
        this.weight = weight;
    }

    public int getSeatscapacity() {

        return this.seatscapacity;
    }

    public int getWeight() {

        return this.weight;
    }

    }






