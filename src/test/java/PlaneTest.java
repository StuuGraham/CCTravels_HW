import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void setUp(){
        plane = new Plane(PlaneType.BOEING737);
    }

    @Test
    public void planeHasAType(){
        assertEquals(PlaneType.BOEING737, plane.getPlaneType());
    }

    @Test
    public void planeHasACapacity(){
        assertEquals(4, plane.getPlaneTypeCapacity());
    }

    @Test
    public void planeHasATotalWeight(){
        assertEquals(10, plane.getPlaneTypeTotalWeight());
    }
}
