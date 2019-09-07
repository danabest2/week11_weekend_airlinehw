import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {
    private Passenger passenger1;
    private Passenger passenger2;

    @Before
    public void setup() {
        passenger1 = new Passenger("Alex", 2);
        passenger2 = new Passenger("John", 1);
    }
    @Test

    public void getName() {
        assertEquals("Alex", passenger1.hasName());
    }

    @Test
    public void getBags() {
        assertEquals( 2, passenger1.hasBags());
    }


}

