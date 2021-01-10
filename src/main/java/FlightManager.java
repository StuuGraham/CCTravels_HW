public class FlightManager {

    private Flight flight;

    public FlightManager(Flight flight){
        this.flight = flight;
    }

    public int baggageWeightAllocation(){
        return flight.flightWeightCapacity() - flight.flightCapacity();
    }

    public int baggagePerPassenger(){
        return this.baggageWeightAllocation() / flight.flightCapacity();
    }

    public int baggageOnFlight(){
        int totalBaggage = 0;
        for (Passenger passenger : flight.getFlightPassengers()){
            totalBaggage += passenger.getPassengerBaggage();
        }
        return totalBaggage;
    }

    public int baggageRoomRemaining(){
        return baggageWeightAllocation() - baggageOnFlight();
    }
}
