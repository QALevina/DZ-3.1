public class Main {
    public static void main(String[] args) {

        BonusMilesService service = new BonusMilesService();
        int price = 1222;
        int miles = service.calculate(price);
        System.out.println("Ваш бонус " + miles + " миль(я)");

        /*int ticketPrice = 1222;
        int bonusMile = 20;
        int finalBonus = ticketPrice / bonusMile;
        System.out.println("Ваш бонус " + finalBonus + " миль(я)");*/

    }
}