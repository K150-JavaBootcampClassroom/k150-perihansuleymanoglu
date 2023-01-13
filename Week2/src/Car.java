public class Car {
    private String brand;
    private String color;
    private int age;

    private int baggageCapacity;

    private CarType carType;
    private RentInfo rentInfo;

    public Car(CarType carType, RentInfo rentInfo) {
        this.carType = carType;
        this.rentInfo = rentInfo;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getBaggageCapacity() {
        return baggageCapacity;
    }

    public void setBaggageCapacity(int baggageCapacity) {
        this.baggageCapacity = baggageCapacity;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public RentInfo getRentInfo() {
        return rentInfo;
    }

    public void setRentInfo(RentInfo rentInfo) {
        this.rentInfo = rentInfo;
    }
}
