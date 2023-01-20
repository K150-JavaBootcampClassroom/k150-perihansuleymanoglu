public class Seat {
    private String seatNumber;
    private SeatType seatType;
    private boolean isEmpty = false;
    private FlightType flyType;

    public Seat(String seatNumber, SeatType seatType, boolean isEmpty, FlightType flyType) {
        this.seatNumber = seatNumber;
        this.seatType = seatType;
        this.isEmpty = isEmpty;
        this.flyType = flyType;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public SeatType getSeatType() {
        return seatType;
    }

    public void setSeatType(SeatType seatType) {
        this.seatType = seatType;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    public FlightType getFlyType() {
        return flyType;
    }

    public void setFlyType(FlightType flyType) {
        this.flyType = flyType;
    }
}
