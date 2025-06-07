public class Zamovlen {
    private int ідентифікатор;
    private Korustuvach користувач;
    private Kohuk кошик;
    private Adres адресаДоставки;
    private String статус;

    public Zamovlen(int ідентифікатор, Korustuvach користувач, Kohuk кошик, Adres адресаДоставки, String статус) {
        this.ідентифікатор = ідентифікатор;
        this.користувач = користувач;
        this.кошик = кошик;
        this.адресаДоставки = адресаДоставки;
        this.статус = статус;
    }
    public void переглянути() {
        System.out.println("\n--- Деталі замовлення ---");
        System.out.println("Замовлення №" + ідентифікатор);
        System.out.println("Користувач: " + користувач.getІмʼя());
        System.out.println("Адреса доставки: " + адресаДоставки.повнаАдреса());
        System.out.println("Статус: " + статус);
        System.out.println("Страви у замовленні:");

        for (strava страва : кошик.getСтрави()) {
            System.out.println(" - " + страва.отриматиІнформацію());
        }

        System.out.println("Загальна сума: " + кошик.загальнаСума() + " грн");
    }
}