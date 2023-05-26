public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int replenishment = 200;

        int bonus;
        if (replenishment > 100) {
            bonus = 100;
        } else {
            bonus = 0;
        }

        if (bonus > 100) {
            bonus = 100;
        }
        int finalBalance = balance + replenishment + bonus;

        System.out.println("Итоговый баланс : " + finalBalance);
        System.out.println("Итоговый бонус : " + bonus);
    }
}