
public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        long amount = 1000;
        boolean isRegistered = true;
        long expected = 30;

        long actual = service.calculate(amount, isRegistered);
        System.out.println("1. " + expected + "==?==" + actual);
    }
}