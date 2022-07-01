public class Car extends Vehicle implements TestDrive{

    protected String topspeed;
    protected String acceleration;
    protected String feeling;

    public Car(String brand, String model, double price) {
        setBrand(brand);
        setModel(model);
        setPrice(price);
    }

    public String getTopspeed() {
        return this.topspeed;
    }

    public void setTopspeed(String topspeed) {
        this.topspeed = topspeed;
    }

    public String getAcceleration() {
        return this.acceleration;
    }

    public void setAcceleration(String acceleration) {
        this.acceleration = acceleration;
    }

    public String getFeeling() {
        return this.feeling;
    }

    public void setFeeling(String feeling) {
        this.feeling = feeling;
    }

    @Override
    public void testDrive(String topspeed,String acceleration,String feeling) {
        setTopspeed(topspeed);
        setAcceleration(acceleration);
        setFeeling(feeling);
    }

    @Override
    public void displayTestdrive() {
        System.out.println(this.brand + " " + this.model);
        System.out.println("Top Speed: "+ this.getTopspeed() + " kmh");
        System.out.println("Acceleration 0-100kmh: "+ this.getAcceleration() + " sec");
        System.out.println("Feeling: "+ this.getFeeling());
    }

}
