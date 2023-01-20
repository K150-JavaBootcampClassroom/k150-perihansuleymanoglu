public class Passenger{

    private String name;
    private String surname;
    private int TCKN;
    private int phone;

    public Passenger(String name, String surname, int TCKN, int phone) {
        this.name = name;
        this.surname = surname;
        this.TCKN = TCKN;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getTCKN() {
        return TCKN;
    }

    public void setTCKN(int TCKN) {
        this.TCKN = TCKN;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
