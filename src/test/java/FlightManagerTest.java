import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {
    private FlightManager flightManager;
    private Flight flight;
    private Passenger passenger;
    private Plane plane;

    @Before
    public void before(){

        plane = new Plane(PlaneType.Boeing777);
        flight = new Flight(plane, "50", FlightDestCode.OTP, FlightDepartCode.EDI, "10:50");
        passenger= new Passenger("Silvia", 3);
    }

    @Test
    public void getTotalWeightForBags(){
        assertEquals(1500, plane.bagsweight());
    }

    
}
