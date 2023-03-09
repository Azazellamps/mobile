
public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int money = 2222;


        int bonus;
        if (money > 1000) {
            bonus = money / 100;
        } else {
            bonus = 0;
        }

        int totalBalance = balance + money + bonus;


        System.out.println(totalBalance);
        System.out.println(bonus);
    }
}