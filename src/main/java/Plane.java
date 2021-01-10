public class Plane {

    private PlaneType plane;

    public Plane(PlaneType plane){
        this.plane = plane;
    }

    public PlaneType getPlaneType(){
        return plane;
    }

    public int getPlaneTypeCapacity(){
        return this.plane.getPlaneCapacity();
    }

    public int getPlaneTypeTotalWeight(){
        return this.plane.getPlaneTotalWeight();
    }
}
