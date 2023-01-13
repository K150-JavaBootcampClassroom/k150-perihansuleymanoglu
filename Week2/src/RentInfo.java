public class RentInfo {
    private RentType rentType;
    private double  dailyRentPrice;
    private double mounthlyRentPrice;

    private double totalPrice;

    public RentInfo(RentType rentType, double dailyPrice, double mounthlyPrice) {
        this.rentType = rentType;
        this.dailyRentPrice = dailyPrice;
        this.mounthlyRentPrice = mounthlyPrice;
    }

    public RentType getRentType() {
        return rentType;
    }

    public void setRentType(RentType rentType) {
        this.rentType = rentType;
    }

    public double getDailyRentPrice() {
        return dailyRentPrice;
    }

    public void setDailyPrice(double dailyRentPrice) {
        this.dailyRentPrice = dailyRentPrice;
    }

    public double getMounthlyRentPrice() {
        return mounthlyRentPrice;
    }

    public void setMounthlyRentPrice(double mounthlyRentPrice) {
        this.mounthlyRentPrice = mounthlyRentPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
