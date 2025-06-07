public class Adres {
    private String вулиця;
    private String місто;
    private String поштовийІндекс;

    public Adres(String вулиця, String місто, String поштовийІндекс) {
        this.вулиця = вулиця;
        this.місто = місто;
        this.поштовийІндекс = поштовийІндекс;
    }

    public String повнаАдреса() {
        return вулиця + ", " + місто + ", " + поштовийІндекс;
    }
}
