package hw2;

import java.util.Arrays;

public class MainApp {
    private static boolean value;
    private static int year;
    private static boolean array;


    public static void main(String[] args) {
        System.out.println(myTask1(4, 8));
        myTask2();
        System.out.println(myTask3(-77));
        ;
        myTask4("Happy", 2);
        myTask5();
        myTask6();
        myTask7();
        changeArray();
        myTask9();
        myTask10(3, 1);
        System.out.println(Arrays.toString(myTaskk10(new int[]{7, 8, 3, 1, 28, 0, 33, 2, 4, 9, 9, 0})));
        ;
    }

    public static boolean myTask1(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        }
        return false;
    }

    public static void myTask2() {
        int a = -100;
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("число отрицательное");
        }
    }

    public static boolean myTask3(int i) {
        int value = -77;
        if (value >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void myTask4(String word, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("[" + i + "]" + "" + word);
        }
    }

    public static boolean myTask5() {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void myTask6() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
            System.out.print(array[i] + " ");
        }
    }

    public static void myTask7() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
    }

    static int[] changeArray() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int arrayLength = array.length;
        for (int i = 0; i < array.length; i++)
            if (array[i] < 6)
                array[i] *= 2;
        return array;
    }

    public static void myTask9() {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }
    }

    public static void myTask10(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");
        }
    }

    public static int[] myTaskk10(int[] array) {
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
        return array;
    }

}

/// Решение заданий 12 и 12 со звездочками есть в методичке, копировать не стала ///
