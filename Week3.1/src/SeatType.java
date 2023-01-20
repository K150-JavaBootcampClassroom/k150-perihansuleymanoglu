public enum SeatType {
    ECONOMY("Econmy"),
    BUSINESS("Business");

    String type;

    SeatType(String type){
        this.type = type;
    }

    public String getValue(){
        return type;
    }

}
