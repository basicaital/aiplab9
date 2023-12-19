package Task;

public class Main {
    public static void main(String[] args) {
        Airplane Airbus = new Airplane("A320neo", 845, 164, 6000, "S7", 845);
        Helicopter helicopter1 = new Helicopter("Robinson R44", 150, 10000);
        Helicopter helicopter2 = new Helicopter("Sikorsky UH-60 Black Hawk", 300, 20000);

        AviationCompany aviationCompany = new AviationCompany();

        aviationCompany.addAircraft(Airbus);
        aviationCompany.addAircraft(helicopter1);
        aviationCompany.addAircraft(helicopter2);

        System.out.println("Количество самолетов: "+aviationCompany.countAirplane());
        System.out.println("Количество вертолетов: "+aviationCompany.countHelicopter());
    }
}
