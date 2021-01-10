import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    Passenger passenger;
    Plane plane;
    Plane plane2;
    Flight flight;
    Flight flight2;
    FlightManager flightmanager;
    FlightManager flightmanager2;

    @Before
    public void setUp() {
        passenger = new Passenger("Rhian Thomas", 1);
        plane = new Plane(PlaneType.BOEING737);
        plane2 = new Plane(PlaneType.AIRBUSA380);
        flight = new Flight(plane, "CCA123", "BFS", "EDI", "1730");
        flight2 = new Flight(plane2, "CCA123", "BFS", "EDI", "1730");
        flightmanager = new FlightManager(flight);
        flightmanager2 = new FlightManager(flight2);
    }

    @Test
    public void getPassengerBaggageAllowance(){
        assertEquals(1, flightmanager.baggagePerPassenger());
        assertEquals(3, flightmanager2.baggagePerPassenger());
    }

    @Test
    public void getBaggageOnFlight(){
        flight.bookAPassenger(passenger);
        flight.bookAPassenger(passenger);
        assertEquals(2, flightmanager.baggageOnFlight());
    }

    @Test
    public void getRemainingBaggageRoom(){
        flight.bookAPassenger(passenger);
        flight.bookAPassenger(passenger);
        flight.bookAPassenger(passenger);
        assertEquals(1, flightmanager.baggageRoomRemaining());
    }
}
