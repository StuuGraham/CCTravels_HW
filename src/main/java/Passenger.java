public class Passenger {

    private String name;
    private int baggage;

    public Passenger(String name, int baggage){
        this.name = name;
        this.baggage = baggage;
    }

    public String getName(){
        return name;
    }

    public int getPassengerBaggage(){
        return baggage;
    }
}
