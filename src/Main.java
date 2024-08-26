public class Main {
    public static void main(String[] args) {
        int ticketPrice = 9875;  // измененная стоимость билета
        int milesPerRuble = 20;   // количество рублей за одну милю

        int bonusMiles = ticketPrice / milesPerRuble;  // расчет бонусных миль

        System.out.println("Количество бонусных миль: " + bonusMiles);
    }
}
