public class Main {
    public static void main(String[] args) {
        // task 1
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.print(i + " ");
        }
        // task 2
        System.out.println();
        System.out.println("Задача 2");
        for (int i = 10; i > 0; i = i - 1) {
            System.out.print(i + " ");
        }
        // task 3
        System.out.println();
        System.out.println("Задача 3");
        for (int i = 0; i < 17; i = i + 2) {
            System.out.print(i + " ");
        }
        //task 4
        System.out.println();
        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i = i - 1) {
            System.out.print(i + " ");
        }
        //task 5
        System.out.println();
        System.out.println("Задача 5");
        for (int i = 1904; i < 2096; i = i + 4) {
            System.out.println(i + "год является високосным");
        }
        // task 6
        System.out.println();
        System.out.println("Задача 6");
        for (int i = 7; i < 99; i = i + 7) {
            System.out.print(i + " ");
        }
        // task 7
        System.out.println();
        System.out.println("Задача 7");
        for (int i = 1; i < 513; i = i * 2) {
            System.out.print(i + " ");
        }
        // task 8
        System.out.println();
        System.out.println("Задача 8");
        int savings = 29000;
        int sum = 0;
        for (int month = 1; month <= 12; month = month + 1) {
            sum += savings;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
        }
        //task 9
        System.out.println();
        System.out.println("Задача 9");
        int deposit = 29000;
        int total2 = 0;
        for (int i = 1; i <= 12; i++) {
            total2 = total2 + deposit;
            total2 = total2 + total2 / 100;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total2 + " рублей");
        }
        //task 9
        System.out.println();
        System.out.println("Задача 10");
        for (int multiplier = 1; multiplier <= 10; multiplier = multiplier + 1) {
            System.out.printf("%d x %d = %d%n", 2, multiplier, 2 * multiplier);
        }
    }
}