public class Main {
    public static void main(String[] args) {
        Showroom showroom = new Showroom();
        Car mazda2 = new Car("Mazda", "2", 600000.00);
        Car civic = new Car("Honda", "Civic", 1200000.00);
        Car accord = new Car("Toyota", "Accord", 1600000.00);
        showroom.addCar(mazda2, civic, accord);
        mazda2.testDrive("180", "10", "not good");
        civic.testDrive("200", "8", "good");
        accord.testDrive("220", "7", "love it");


        showroom.displayShowroom();
        showroom.displayCars();

        mazda2.displayTestdrive();
        civic.displayTestdrive();
        accord.displayTestdrive();
    }
}
