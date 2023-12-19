package Task;

public class Helicopter extends Aircraft{
    private int maxLiftingHeight;

    public void setMaxLiftingHeight(int height){
        maxLiftingHeight=height;
    }

    public int getMaxLiftingHeight() {
        return maxLiftingHeight;
    }
    public Helicopter(){
        super();
        maxLiftingHeight=0;
    }
    public Helicopter(String firma, int speed, int height){
        super(firma, speed);
        maxLiftingHeight=height;
    }
    @Override
    public String toString(){
        return getFirm()+" "+getMaxSpeed()+" "+maxLiftingHeight;
    }
}
