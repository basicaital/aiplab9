package Task;

import java.util.ArrayList;

public class AviationCompany {
    private ArrayList<Aircraft> masAir = new ArrayList<Aircraft>();

    public void addAircraft(Aircraft aircraft){
        masAir.add(aircraft);
    }
    public int countAirplane(){
        int count =0;
        for (Aircraft aircraft : masAir){
            if (aircraft instanceof Airplane){
                count++;
            }
        }
        return count;
    }
    public int countHelicopter(){
        int count =0;
        for (Aircraft aircraft : masAir){
            if (aircraft instanceof Helicopter){
                count++;
            }
        }
        return count;
    }
}
