public class ZooPark {

    String name;
    String city;
    int amount;
    int cage;

    @Override
    public String toString() {
        return "ZooPark{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", amount=" + amount +
                ", cage=" + cage +
                '}';
    }

    public ZooPark(String name, String city, int amount, int cage) {
        this.name = name;
        this.city = city;
        this.amount = amount;
        this.cage = cage;

    }
}
