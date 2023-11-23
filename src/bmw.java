public class bmw extends Car {

    private boolean speedButton;


    public bmw(String brand, String model, int year, boolean speedButton) {
        super(brand, model, year, speedButton);
    }

    public void speedMode() {
        speedButton = !speedButton;

        if (speedButton) {
            System.out.println("speedMode (onn)");
        } else {
            System.out.println("speedMode (off)");
        }
    }

}