import java.util.ArrayList;
import java.util.List;

public class Showroom {
    private String name;
    private String address;
    private String phone;
    private List<Car> cars;

    public Showroom() {
        this.name = "BestShowroom";
        this.address = "528 donmuang bangkok 10210";
        this.phone = "0899999999";
        this.cars = new ArrayList<>();
    }

    public Showroom(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.cars = new ArrayList<>();
    }

    public String getname() {
        return this.name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getphone() {
        return this.phone;
    }

    public void setphone(String phone) {
        this.phone = phone;
    }

    public void displayShowroom() {
        System.out.println("name = " + this.name);
        System.out.println("address = " + this.address);
        System.out.println("phone = " + this.phone);
    }

    public List<Car> getCars() {
        return cars;
    }

    public void displayCars() {
        String detail = "Car Brand : %s, Model :  %s,  Price : %s";
        for (int i = 0; i < this.cars.size(); i++) {
            System.out.println(String.format(detail, this.cars.get(i).getBrand(), this.cars.get(i).getModel(),
                   String.valueOf(this.cars.get(i).getPrice())));
        }
    }

    public void addCar(Car... car) {
        for (int i = 0; i < car.length; i++) {
            this.cars.add(car[i]);
        }
    }

}
