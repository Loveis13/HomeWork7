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
        while (start < 10) {
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
        for (int year = 1; year < 10; year++) {
            Y += Y * (fertility - dead) / 1000;
            System.out.println("Год " + year + " численность населения состовляет " + Y + " человек");
        }


        /// task4
        double moneey = 15_000;
        int l = 0;
        double bankStavka = 0.07;
        int allMoney =  12_000_000;
        while (moneey < allMoney) {
            l = l +1;
            moneey = moneey + moneey * bankStavka;
            System.out.println("Сумма " + moneey + " , количество месяцев " + l);
        }


        ///task 5
        double month = 15_000;
        double bankStavkaa = 0.07;
        int all = 12_000_000;
        int period = 6;
        for (int k = 0; month< all; k++){
            month = month + month * bankStavka;
            if (k % period == 0){
                System.out.println( "сумма" + month +"количество " + k);
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
        int firstFriday = 10;
        for (firstFriday = 1; firstFriday < 31; firstFriday += 7) {
            System.out.println("Сегодня пятница " + firstFriday + " необходимо подготовить отчет");
        }


        /// task 8

        int currentYear = 2023;
        int startYear = currentYear - 200;
        int lastYear = currentYear + 100;
        for(int year = 0; year <= lastYear; year += 79){

            if(year >= startYear) {

                System.out.println(year);

            }

        }


    }
}