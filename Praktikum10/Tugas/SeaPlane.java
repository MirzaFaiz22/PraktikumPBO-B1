public class SeaPlane extends Airplane {
    
    private double maxLoad;

    public SeaPlane (double maxLoad){
        this.maxLoad = maxLoad;
    }

    public double calcFuelEfficiency() {
        return maxLoad*0.0;
    }

    public double calcTripDistance() {
        return maxLoad*0.0;
    }
    
    public void takeOff() {
        System.out.println("SeaPlane taking off");
    }

    public void land() {
        System.out.println("SeaPlane landing");
    }

    public void fly() {
        System.out.println("SeaPlane flying");
    }
    
    @Override
    public String toString(){
        return "SeaPlane dapat take-off dan mendarat di perairan laut";
    }
}
