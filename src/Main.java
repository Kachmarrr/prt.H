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