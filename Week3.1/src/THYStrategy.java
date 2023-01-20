public class THYStrategy implements ITicketStrategy {


    @Override
    public void FlightTicket(FlightType flightType, SeatType seatType) {
        System.out.println("---- THY ----");
        if( flightType == FlightType.YURTICI){
            System.out.println(" Yurt içi uçuş seçildi.");
        }
        else if( flightType == FlightType.YURTDISI){
            System.out.println("Yurt dışı uçuş seçildi.");
        }
    }
}
