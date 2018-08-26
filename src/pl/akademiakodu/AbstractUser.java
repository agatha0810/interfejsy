package pl.akademiakodu;


public abstract class AbstractUser {

    private String username;

    abstract String go();

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    /*
        Jeżeli klasa jest abstrakcyjna
        to znaczy, że nie mogę tworzyć obiektów danej klasy
        // nie działa konstuktor
        // klasa abstrakcyjna plus natomiast jej jest to, że
        może zawierać metody abstrakcyjne
        podobnie interfejs


     */




}
