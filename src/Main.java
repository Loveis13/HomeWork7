public class Main {
    public static void main(String[] args) {
        /// task 1
        int save = 15_000;
        int accumulate = 2_459_000;
        int now = 0;
        int moneySave = 0;
        while (moneySave < accumulate) {
            now = now + 1;
            moneySave = now * save;
            System.out.println(" месяц " + now + " сумма накоплания равна " + moneySave);
        }

        /// task 2

        int start = 1;
        while (start < 11) {
            System.out.print(" " + start);
            start = start + 1;
        }
        System.out.println(" ");
        for (int o = 10; o > 0; o--) {
            System.out.print(" " + o);
        }
        System.out.println();

        /// task 3

        int Y = 12_000_000;
        int fertility = 17;
        int dead = 8;
        for (int year = 1; year < 11; year++) {
            Y += Y * (fertility - dead) / 1000;
            System.out.println("Год " + year + " численность населения состовляет " + Y + " человек");
        }


        /// task4
        double moneey = 15_000;
        int l = 0;
        while (moneey < 12_000_000) {
            l = l + 1;
            moneey = moneey + moneey * 0.07;
            System.out.println("Сумма " + moneey + " , количество месяцев " + l);
        }
        ///task 5
        double moneyy = 15_000;
        int s = 0;
        for (; moneyy < 12_000_000; s++) {
            moneyy = moneyy + moneyy * 0.07;
            if (s % 6 == 0) {
                System.out.println("Сумма " + moneyy + " , количество месяцев " + s);
            }
        }


        /// task 6
        double money = 15_000d;
        int i = 0;
        for (; i <= 9 * 12; i++) {
            money = money + money * 0.07;
            if (i % 6 == 0) {
                System.out.println("Сумма " + money + " , количество месяцев " + i);
            }
        }


        /// task 7
        int n = 10;
        for (; n < 31; n += 7) {
            System.out.println("Сегодня пятница " + n + " необходимо подготовить отчет");
        }


        /// task 8
        for (int b = 0; b < 2123; b += 79) {
            if (b > 1823) {
                System.out.println(b);
            }
        }


    }
}