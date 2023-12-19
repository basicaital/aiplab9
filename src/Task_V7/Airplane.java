package Task;

public class Airplane extends Aircraft{
    private String model;
    private int passenger;
    private int cruisingSpeed;
    private int flightRange;

    public Airplane(){
        super();
        model="";
        passenger=0;
        cruisingSpeed=0;
        flightRange=0;
    }
    public Airplane(String modele, int speedcr, int passengep, int range, String firma, int speed){
        super(firma,speed );
        model=modele;
        passenger=passengep;
        cruisingSpeed=speedcr;
        flightRange=range;
    }
    public void setModel(String modele) {
        model = modele;
    }
    public String getModel() {
        return model;
    }

    public void setCruisingSpeed(int speedcr) {
        cruisingSpeed = speedcr;
    }

    public int getCruisingSpeed() {
        return cruisingSpeed;
    }

    public void setPassenger(int passengep) {
        passenger = passengep;
    }

    public int getPassenger() {
        return passenger;
    }

    public void setFlightRange(int range) {
        flightRange = range;
    }

    public int getFlightRange() {
        return flightRange;
    }
    @Override
    public String toString(){
        return getFirm()+" "+getMaxSpeed()+" "+model+" "+passenger+" "+cruisingSpeed+" "+flightRange;
    }
}
