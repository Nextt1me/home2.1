public class Main {
    public static void Main(String[] args) {

        int ticket = 24_350; // стоимость билета
        int mile = 20; // количество рублей для одной бонусной мили

        int bonus = ticket / mile; // количество бонусных миль

        System.out.println(" Количество бонусных миль " + bonus);
    }
}