
public class Car implements CarMethods {

    private String brand;
    private String model;
    private int year;

    public Car(String brand, String model, int year, boolean driftButton){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }




    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    @Override
    public void driftMode() {
    }

    @Override
    public void speedMode() {

    }

}
