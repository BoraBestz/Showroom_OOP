public class Car2 extends Showroom implements Testdrive{
    public void showCar2() {
        setCarbrand("Honda");
        setCarname("Civic");
        setPrice(1200000);
        displayShowroom();
    }

    @Override
    public void testDrive() {
        System.out.println("Top speed: "+ "200 "+ "kmh");
        System.out.println("0-100 in 10 sec");
        System.out.println("feeling: good");
    }
}
