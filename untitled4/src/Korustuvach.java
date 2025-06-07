public class Korustuvach {
    private String імʼя;
    private Adres адреса;

    // Правильно названий конструктор
    public Korustuvach(String імʼя) {
        this.імʼя = імʼя;
    }

    // Метод введення адреси
    public void ввестиАдресу(Adres адреса) {
        this.адреса = адреса; // Виправлена змінна
        System.out.println("Введено адресу доставки: " + адреса.повнаАдреса());
    }

    // Метод оформлення замовлення
    public Zamovlen оформитиЗамовлення(Kohuk кошик, int номер) {
        System.out.println("Замовлення оформлено.");
        return new Zamovlen(номер, this, кошик, адреса, "Створено");
    }

    // Геттер для імені
    public String getІмʼя() {
        return імʼя;
    }
}
