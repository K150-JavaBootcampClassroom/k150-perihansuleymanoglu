public enum FlightType {
    YURTICI("Yurt içi"),
    YURTDISI("Yurt dışı");

    String type;

    FlightType(String type){
        this.type = type;
    }

    public String getValue(){
        return type;
    }
}
