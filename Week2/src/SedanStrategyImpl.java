public class SedanStrategyImpl implements IRentStrategy{
    @Override
    public void rentACar(Car car, Customer customer) {
        System.out.println("Sedan kiralama");
    }
}
