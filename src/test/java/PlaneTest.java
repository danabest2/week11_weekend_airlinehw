import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before

    public void before(){
        plane = new Plane(PlaneType.Boeing777);
    }


    @Test
    public void countSeatsCapacity(){
        assertEquals(150, plane.countSeatscapacity());
    }

    @Test

    public void checkPlaneWeight(){
        assertEquals(3000, plane.countWeight());
    }
}
