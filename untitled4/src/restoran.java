import java.util.List;
import java.util.ArrayList;

public class restoran {
    // Поля класу оголошено як private тому що доступ через методи класу
    private String назва;
    private List<strava> меню;

    // Метод зазначено public тому що ця інформація публічна ресторану та меню
    public restoran(String назва, List<strava> меню) {
        this.назва = назва;
        this.меню = меню;
    }

    // Зазгачено метод public. цей метод отримання замовлення — публічний, тому що  викликається ззовні і взаємодіє з Замовленням
    public void отриматиЗамовлення(Zamovlen замовлення) {
        System.out.println("\nРесторан \"" + назва + "\" отримав замовлення:");
        замовлення.переглянути(); // виклик методу перегляду вмісту замовлення
    }

    // Показати меню ресторану для всіх
    public void показатиМеню() {
        System.out.println("\n--- Меню ресторану \"" + назва + "\" ---");
        for (strava страва : меню) {
            System.out.println(страва.отриматиІнформацію());
        }
    }

    // Дає доступ до списку меню
    public List<strava> getМеню() {
        return меню;
    }
}
