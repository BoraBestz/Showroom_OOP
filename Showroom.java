public class Showroom {
    private String carbrand;
    private String carname;
    private Integer price;

    public Showroom() {

    }

    public Showroom(String carbrand,String carname,Integer price) {
        this.carbrand = carbrand;
        this.carname = carname;
        this.price = price;
    }


    public String getCarbrand() {
        return this.carbrand;
    }

    public void setCarbrand(String carbrand) {
        this.carbrand = carbrand;
    }

    public String getCarname() {
        return this.carname;
    }

    public void setCarname(String carname) {
        this.carname = carname;
    }

    public Integer getPrice() {
        return this.price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void displayShowroom(){
        System.out.println("carbrand = " + this.carbrand);
        System.out.println("carname = " + this.carname);
        System.out.println("price = " + this.price);
    }


}


