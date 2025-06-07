import java.util.List;
import java.util.ArrayList;

public class Kohuk {
    private List<strava> страви = new ArrayList<>();

    public void додатиСтраву(strava страва) {
        страви.add(страва);
        System.out.println("Додано до кошика: " + страва.отриматиІнформацію());
    }

    public List<strava> getСтрави() {
        return страви;
    }

    public double загальнаСума() {
        return страви.stream().mapToDouble(strava::getЦіна).sum();
    }
}