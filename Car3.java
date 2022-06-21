public class Car3 extends Showroom implements Testdrive{
    public void showCar3() {
        setCarbrand("Toyota");
        setCarname("Camry");
        setPrice(1700000);
        displayShowroom();
    }

    @Override
    public void testDrive() {
        System.out.println("Top speed: "+ "230 "+ "kmh");
        System.out.println("0-100 in 8 sec ");
        System.out.println("feeling: love it");

    }
}
