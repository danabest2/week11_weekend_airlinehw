
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
    public Plane plane;
    private String flightNumber;
    private FlightDestCode destinationAirport;
    private FlightDepartCode departureAirport;
    private String departureTime;
    private Passenger passenger;

    public Flight(Plane plane, String flightNumber,
                  FlightDestCode destinationAirport,
                  FlightDepartCode departureAirport,
                  String departureTime) {
        this.passengerList = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destinationAirport = destinationAirport;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;

    }

    public void addPassenger(Passenger passenger) {

        this.passengerList.add(passenger);
    }

    public int countPassengers() {

        return this.passengerList.size();
    }

    public int planeSeatscapacity() {

        return this.plane.countSeatscapacity() - this.passengerList.size();
    }


    public int passengertotalbagsweight() {
        //System.out.println(this.passengerList.size());
        //return 30;
        int totalBaggages123 =0;
            for (int i = 0; i < this.passengerList.size(); i ++){
                totalBaggages123 = totalBaggages123 + passengerList.get(i).hasBags();

            }
        final int i = totalBaggages123 * this.plane.bagweightperperson();
        return i;
        }
    }



