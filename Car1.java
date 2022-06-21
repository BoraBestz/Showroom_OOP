public class Car1 extends Showroom implements Testdrive{
    public void showCar1() {
        setCarbrand("Mazda");
        setCarname("Mazda3");
        setPrice(950000);
        displayShowroom();
    }

    @Override
    public void testDrive() {
        System.out.println("Top speed: "+ "180 "+ "kmh");
        System.out.println("0-100 in 12 sec");
        System.out.println("feeling: not good");
    }
}
