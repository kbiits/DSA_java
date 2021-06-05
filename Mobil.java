

public abstract class Mobil extends Engine implements MobilCanShow {
    String Market;
    String Transmission;
    String Year;

    public Mobil(String engine, String power, String torque, String market, String transmission, String year) {
        super(engine, power, torque);
        Market = market;
        Transmission = transmission;
        Year = year;
    }
}
