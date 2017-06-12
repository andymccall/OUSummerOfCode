package day1;

/**
 * Created by Andy McCall on 12/06/2017.
 */
public class Holiday {

    private String dealId;
    private int price;
    private String location;
    private int surcharge;

    public String getDealId() {
        return dealId;
    }

    public void setDealId(String dealId) {
        this.dealId = dealId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getSurcharge() {
        return surcharge;
    }

    public void setSurcharge(int surcharge) {
        this.surcharge = surcharge;
    }

    @Override
    public String toString() {
        return "Holiday{" +
                "dealId='" + dealId + '\'' +
                ", price=" + price +
                ", location='" + location + '\'' +
                ", surcharge=" + surcharge +
                '}';
    }
}
