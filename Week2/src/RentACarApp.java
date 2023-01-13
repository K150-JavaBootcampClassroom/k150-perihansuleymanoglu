import java.util.Date;

public class RentACarApp
{
    public static void main(String[] args) {

        Car car = new Car(CarType.HATCHBACK, new RentInfo(RentType.MOUNTHLY, 150, 2500));

        Citizen citizen = new Citizen();
        citizen.setTCKN(2947594);
        citizen.setSurname("Süleymanoğlu");
        citizen.setBirthDate(new Date( ));


        HatchBackStrategyImpl hatchBackStrategy = new HatchBackStrategyImpl();
        RentCarImplService rentCarService = new RentCarImplService(hatchBackStrategy);
        rentCarService.rentACar(car, citizen);
    }
}
