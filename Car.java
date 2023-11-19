public class Main {
    public static void main(String[] args) {

        Garadge garadge = new Garadge();

        Mersedes mersedesE63amg = new Mersedes("Mersedes", "E63amg", 2020, false);
        bmw bmwm8 = new bmw("BMW", "M8", 2021, false);

        //add
        garadge.addCar(mersedesE63amg);
        garadge.addCar(bmwm8);

        garadge.displayCars();

        System.out.println("\n");

        System.out.println("mersedes drift mode: ");
        mersedesE63amg.driftMode();
        mersedesE63amg.driftMode();

        System.out.println("\n");

        System.out.println("bmv drift mode: ");
        bmwm8.speedMode();
        bmwm8.speedMode();

    }
}



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


import java.util.Vector;

public class Garadge {
    private Vector<Car> cars;


    public Garadge(){
        cars = new Vector<>();
    }

    public void addCar(Car car){
        cars.add(car);
    }
    public void removeCar(Car car) {
        cars.remove(car);
    }

    public void displayCars() {
        System.out.println("List of cars: \n");
        for (Car car : cars) {
            System.out.println("Brand: " + car.getBrand() +
                    ", Model: " + car.getModel() +
                    ", Published Year: " + car.getYear());
        }
    }
}


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


public interface CarMethods {
    public void driftMode();

    public void speedMode();
}

