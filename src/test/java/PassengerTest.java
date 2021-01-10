import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void setUp(){
        passenger = new Passenger("Rhian Thomas", 2);
    }

    @Test
    public void passengerHasName(){
        assertEquals("Rhian Thomas", passenger.getName());
    }

    @Test
    public void passengerHasBaggage(){
        assertEquals(2, passenger.getPassengerBaggage());
    }
}
