
//Create a `Flight` class which has:
//* an empty list of booked `Passenger`'s
//* a `Plane`
//* flight number (i.e. "FR756")
//* destination (i.e. GLA, EDI)
//* departure airport (i.e. GLA, EDI)
//* departure time (use a String)
//



import java.util.ArrayList;

public class Flight {
    private ArrayList<Passenger> passengerList;
    public PlaneType planeType;
    private String flightNumber;
    private FlightDestCode destinationAirport;
    private FlightDepartCode departureAirport;
    private String departureTime;

    public Flight(PlaneType planeType, String flightNumber,
                  FlightDestCode destinationAirport,
                  FlightDepartCode departureAirport,
                  String departureTime)

    {
        this.passengerList = new ArrayList<Passenger>();
        this.planeType = planeType;
        this.flightNumber = flightNumber;
        this.destinationAirport = destinationAirport;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;

    }


    public Flight(PlaneType boeing777) {

    }
}
