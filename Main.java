public class Main {
    public static void main(String[] args) {
        Showroom showroom = new Showroom();
        Car mazda2 = new CarDetail("Mazda", "2", 600000.00);
        Car civic = new CarDetail("Honda", "Civic", 1200000.00);
        showroom.addCar(mazda2, civic);

        showroom.displayCars();
    }
}
