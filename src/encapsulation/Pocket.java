package encapsulation;

public class Pocket {


    private int money;

    public Pocket(int money) {
        setMoney(money);
    }

    public int getMoney() {

        if (money <= 10) {
            return 0;
        } else {
            System.out.print("You Have: ");
            return money;
        }
    }

    public int getMoneyFromPocket(int amount) {
        if (amount <= 0) {
            return money;
        } else if (amount > money) {
            System.out.println("Is to much");
            return 0;
        } else {
            System.out.print("Now you have : ");
            return money = money - amount;
        }
    }

    public void setMoney(int money) {
        if (money <= 0 || this.money + money > 3000) {
            System.out.println("I don’t have enough space in my pocket for as much money");
        } else {
            this.money = this.money + money;
        }
    }
}
