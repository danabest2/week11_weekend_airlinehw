import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    Flight flight;
    PlaneType planeType;
    Plane plane;
    Passenger passenger;

    @Before

    public void before(){
        plane = new Plane(PlaneType.Boeing777);
        flight = new Flight (plane, "50", FlightDestCode.OTP, FlightDepartCode.EDI, "10:50");
        passenger = new Passenger("Stefan", 3);
    }



    @Test
    public void canGetAvailableSeats(){
        assertEquals(150, plane.getSeatscapacity());
    }


    @Test
    public void canAddPassengerToFlight() {
        flight.addPassenger(passenger);
        assertEquals(1, flight.countPassengers());
    }

    @Test
    public void canCheckReaminingAvailableSeats(){
        flight.addPassenger(passenger);
        assertEquals(149, flight.planeSeatscapacity());
    }


    @Test
    public void canCheckPassengerNoOfBags(){
        flight.addPassenger(passenger);
        assertEquals(3, passenger.hasBags());
    }
    //@Test
    //public void canAddNewPassengerIfAvaivalbleSeats(){
       // //flight.addPassenger(passenger);
       // assertEquals(149, flight.plane.getPlaneTypeUpdatedSeatscapacity());

    //}

}
