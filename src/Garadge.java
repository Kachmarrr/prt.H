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
