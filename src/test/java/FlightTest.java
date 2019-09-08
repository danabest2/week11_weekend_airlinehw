import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    Flight flight;
    PlaneType planeType;
    Plane plane;
    Passenger passenger;
    Passenger passenger2;
    Passenger passenger3;

    @Before

    public void before(){
        plane = new Plane(PlaneType.Boeing777);
        flight = new Flight (plane, "50", FlightDestCode.OTP, FlightDepartCode.EDI, "10:50");
        passenger = new Passenger("Stefan", 3);
        passenger2 = new Passenger("Ion", 1);
        passenger3 = new Passenger("Fetita", 160);
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

//    @Test
//    public void tooManyBags(){
//        assertEquals("Sorry, too many bags, cant load so many bags on the flight", flight.addPassenger(passenger3));
//    }

//    @Test
//    public void insufficientSeats(){
//        flight.addPassenger(passenger);
//        flight.addPassenger(passenger2);
//        assertEquals("Sorry, not enough sits on this flight.", flight.addPassenger(passenger3));
//    }
    //@Test
    //public void canAddNewPassengerIfAvaivalbleSeats(){
       //flight.addPassenger(passenger);
      // assertEquals(149, flight.plane.getPlaneTypeUpdatedSeatscapacity());

    //}

}
