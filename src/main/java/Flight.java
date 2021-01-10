import java.util.ArrayList;

public class Flight {

    private Plane plane;
    private String flightNumber;
    private String departureAirport;
    private String destination;
    private String departureTime;
    private ArrayList<Passenger> flightPassengers;

    public Flight(Plane plane, String flightNumber, String departureAirport,
                  String destination, String departureTime){
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.departureAirport = departureAirport;
        this.destination = destination;
        this.departureTime = departureTime;
        this.flightPassengers = new ArrayList<Passenger>();
    }

    public PlaneType getPlane() {
        return plane.getPlaneType();
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getDestination() {
        return destination;
    }

    public ArrayList<Passenger> getFlightPassengers() {
        return flightPassengers;
    }

    public int flightWeightCapacity(){
        return this.plane.getPlaneTypeTotalWeight();
    }

    public int flightCapacity(){
        return this.plane.getPlaneTypeCapacity();
    }

    public int availableSeats(){
        int emptySeats = this.flightCapacity() - this.getFlightPassengers().size();
        return emptySeats;
    }

    public void bookAPassenger(Passenger passenger){
        if (this.availableSeats() > 0){
            flightPassengers.add(passenger);
        }
    }
}
