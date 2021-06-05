
public class Supra extends Mobil {
    @Override
    public void show() {
        System.out.println("Engine : " + super.engine);
        System.out.println("Torque : " + super.torque);
        System.out.println("Power : " + super.power);
        System.out.println("Market : " + super.Market);
        System.out.println("Year : " + super.Year);
        System.out.println("Transmission : " + super.Transmission);
        System.out.println();
    }

    public Supra(String engine, String power, String torque, String market, String transmission, String year) {
        super(engine, power, torque, market, transmission, year);
    }

    public static void main(String[] args) {
        Mobil m1 = new Supra("Engine supra 1", "Power Supra 1", "Torque Supra 1", "Japan", "Manual", "2021");
        Mobil m2 = new Supra("Engine supra 2", "Power Supra 2", "Torque Supra 2", "Netherlands", "Automatic", "2020");
        Mobil[] mobils = {m1, m2};
        for (Mobil m : mobils ) {
            m.show();
        }
    }

}
