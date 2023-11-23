public class Mersedes extends Car {

    public boolean driftButton;

    public Mersedes(String brand, String model, int year, boolean driftButton) {
        super(brand, model, year, driftButton);
    }
    @Override
    public void driftMode() {
        driftButton = !driftButton;

        if (driftButton) {
            System.out.println("driftMode (onn)");
        } else {
            System.out.println("driftMode (off)");
        }
    }
}