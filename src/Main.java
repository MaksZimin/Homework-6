public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("Задача №2");
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }

        System.out.println("Задача №3");
        for (int i = 0; i < 17; i += 2) {
            System.out.println(i);
        }

        System.out.println("Задача №4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        System.out.println("Задача №5");
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + " год является високосным.");
        }

        System.out.println("Задача №6");
        for (int i = 0; i <= 98; i += 7) {
            System.out.println(i);
        }

        System.out.println("Задача №7");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(i);
        }

        System.out.println("Задача №8");
        int money = 29000;
        for (int month = 1; month <= 12; month++) {
            int saving = (money * month);
            System.out.println("Месяц " + month + " сумма накоплений равна " + saving + " рублей.");
        }

        System.out.println("Задача №9");
        int money1 = 29000;
        for (int month = 1; month <= 12; month++) {
            int saving = ((money1 + (money1 / 100)) * month);
            System.out.println("Месяц " + month + " сумма накоплений равна " + saving + " рублей.");
        }

        System.out.println("Задача №10");
        int multiplier1 = 2;
        for (int multiplier2 = 1; multiplier2 <= 10; multiplier2++) {
            int equaliti = (multiplier1 * multiplier2);
            System.out.println(multiplier1 + "*" + multiplier2 + "=" + equaliti);
        }

    }
}