public class RentCarImplService implements IRentCarService {

    IRentStrategy iRentStrategy;
    @Override
    public void rentACar(Car car, Customer customer) {
        iRentStrategy.rentACar(car, customer);
    }

    public RentCarImplService(IRentStrategy iRentStrategy) {
        this.iRentStrategy = iRentStrategy;
    }
}
