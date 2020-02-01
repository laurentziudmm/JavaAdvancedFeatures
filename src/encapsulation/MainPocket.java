package encapsulation;

public class MainPocket {
    public static void main(String[] args) {

        Pocket pocket = new Pocket(33);
        System.out.println(pocket.getMoney());
        pocket.setMoney(9);
        System.out.println(pocket.getMoney());
        pocket.setMoney(3001);

        System.out.println();

        Pocket pocket1 = new Pocket(3500);

        System.out.println(pocket1.getMoney());

        System.out.println(pocket1.getMoneyFromPocket(4000));

        System.out.println(pocket1.getMoneyFromPocket(2000));

        System.out.println();
        pocket1.setMoney(1500);
        System.out.println(pocket1.getMoney());
        System.out.println();
        System.out.println(pocket1.getMoneyFromPocket(1000));

    }
}
