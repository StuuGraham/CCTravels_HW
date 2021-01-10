public enum PlaneType {

    BOEING737(4,8),
    BOEING747(6, 12),
    AIRBUSA330(10, 30),
    AIRBUSA380(15, 60);

    private final int capacity;
    private final int totalWeight;

    PlaneType(int capacity, int totalWeight){
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getPlaneCapacity(){
        return capacity;
    }

    public int getPlaneTotalWeight(){
        return totalWeight;
    }

}
