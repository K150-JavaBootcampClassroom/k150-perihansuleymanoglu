public class PegasusStrategy implements ITicketStrategy {

    @Override
    public void FlightTicket(FlightType flightType, SeatType seatType) {
        System.out.println("---- PEGASUS ----");
        if( flightType == FlightType.YURTICI){
            System.out.println(" Yurt içi uçuş seçildi. Yurt içi uçuşlarda yemek hizmeti yoktur !!!");
        }
        else if( flightType == FlightType.YURTDISI){
            System.out.println("Yurt dışı uçuş seçildi.");
        }

    }
}
