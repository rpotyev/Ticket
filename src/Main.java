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

        System.out.println("итоговый бонус : " + bonus);
    }
}