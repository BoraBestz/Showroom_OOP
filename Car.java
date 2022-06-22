public abstract class Car implements TestDrive{
    protected String brand;
    protected String model;
    protected double price;

    protected String topspeed;
    protected String acceleration;
    protected String feeling;

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
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
