public class CarDetail extends Car implements Testdrive {

    public CarDetail(String brand, String model, double price) {
        setBrand(brand);
        setModel(model);
        setPrice(price);
    }

    @Override
    public void testDrive() {

    }
}
