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
        int FinalBalance = balance + replenishment;

        System.out.println("Итоговый баланс : " + FinalBalance);
        System.out.println("Итоговый бонус : " + bonus);
    }
}