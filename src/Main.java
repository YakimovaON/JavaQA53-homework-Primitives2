public class Main {
    public static void main(String[] args) {
        int startCheck = 700;
        int addend = 1500;

        int bonus = addend > 1000 ? addend / 100 : 0;

        int finishCheck = startCheck + addend + bonus;

        System.out.println("Итоговый счет: " + finishCheck);
        System.out.println("Бонус " + bonus);

    }
}
