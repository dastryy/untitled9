
public class strava {
    private int ідентифікатор;
    private String назва;
    private double ціна;

    public strava(int ідентифікатор, String назва, double ціна) {
        this.ідентифікатор = ідентифікатор;
        this.назва = назва;
        this.ціна = ціна;
    }

    public String отриматиІнформацію() {
        return назва + " - " + ціна + " грн";
    }

    public double getЦіна() {
        return ціна;
    }

    public String getНазва() {
        return назва;
    }
}