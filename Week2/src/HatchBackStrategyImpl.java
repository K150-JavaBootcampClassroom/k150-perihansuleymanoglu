public class HatchBackStrategyImpl implements IRentStrategy{

    double hatchBackMounthlyParam = 1.1;
    @Override
    public void rentACar(Car car, Customer customer) {
        if(customer instanceof  Citizen){
            System.out.println("you re not allowed for this operation!!");
        }else{
            if(RentType.MOUNTHLY.equals(car.getRentInfo().getRentType())){
//                RentInfo rentInfo = new RentInfo();
  //              double mounthlyRentPrice = hatchBackMounthlyParam * car.getRentInfo().getMounthlyRentPrice();
    //            rentInfo.setTotalPrice(mounthlyRentPrice);
            }
        }

        System.out.println("Hatchback kiralama");
    }
}
