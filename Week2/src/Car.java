public abstract class Car {
    private String brand;
    private String color;
    private int age;

    private int baggageCapacity;
    private int dailyPrice;
    private int monthlyPrice;

    public Car(){

    };

    public String getBrandName() {
        return brand;
    }

    public void setBrandName(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getBaggageCapacity() {
        return baggageCapacity;
    }

    public void setBaggageCapacity(int baggageCapacity) {
        this.baggageCapacity = baggageCapacity;
    }

    public int getDailyPrice() {
        return dailyPrice;
    }

    public void setDailyPrice(int dailyPrice) {
        this.dailyPrice = dailyPrice;
    }

    public int getMonthlyPrice() {
        return dailyPrice;
    }

    public void setMonthlyPrice(int monthlyPrice) {
        this.monthlyPrice = monthlyPrice;
    }

}
