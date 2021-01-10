import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Passenger passenger;
    Plane plane;
    Flight flight;

    @Before
    public void setUp() {
        passenger = new Passenger("Rhian Thomas", 1);
        plane = new Plane(PlaneType.BOEING737);
        flight = new Flight(plane, "CCA123", "EDI", "AMS", "1730");
    }

    @Test
    public void flightHasPlane(){
        assertEquals(PlaneType.BOEING737, flight.getPlane());
    }

    @Test
    public void flightHasIdentifier(){
        assertEquals("CCA123", flight.getFlightNumber());
    }

    @Test
    public void flightHasDepartureLocation(){
        assertEquals("EDI", flight.getDepartureAirport());
    }

    @Test
    public void flightHasDestination(){
        assertEquals("AMS", flight.getDestination());
    }

    @Test
    public void flightHasDepartureTime(){
        assertEquals("1730", flight.getDepartureTime());
    }

    @Test
    public void flightStartsEmpty(){
        assertEquals(0, flight.getFlightPassengers().size());
    }

    @Test
    public void flightHasCapacity(){
        assertEquals(4, flight.flightCapacity());
    }

    @Test
    public void flightHasAvailableSeatsAndCanBookPassenger(){
        flight.bookAPassenger(passenger);
        assertEquals(3, flight.availableSeats());
        assertEquals(1, flight.getFlightPassengers().size());
    }

    @Test
    public void flightWillNotBookBeyondCapacity(){
        flight.bookAPassenger(passenger);
        flight.bookAPassenger(passenger);
        flight.bookAPassenger(passenger);
        flight.bookAPassenger(passenger);
        flight.bookAPassenger(passenger);
        assertEquals(4, flight.getFlightPassengers().size());
    }
}
