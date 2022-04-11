package school.lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    ///task2
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    ///task3
    public static void checkSumSign() {
        int a = 5;
        int b = -51;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    ///task4
    public static void printColor() {
        int value = 0;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }
        ///task 5
    }

    public static void compareNumbers() {
        int a = 32;
        int b = 213;
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a < b");
        }
    }
}
