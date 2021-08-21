package hw1;

public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 5;
        int b = 1;
        int sum = a + b;

        if (sum >= 0)
            System.out.println("Сумма положительная");
        if (sum < 0)
            System.out.println("Сумма отрицательная");

    }

    public static void printColor() {        // реализую эту задачу с помощью оператора if (по методичке)
        int value = 111;

        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() { // реализую эту задачу уже с помощью if - else
        int a = 27;
        int b = 72;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}

