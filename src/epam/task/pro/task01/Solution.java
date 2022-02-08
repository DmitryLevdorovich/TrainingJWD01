package epam.task.pro.task01;

import java.util.Random;

public class Solution {

    public static void main(String[] args) {
        fun1(1524);
        System.out.println("------");
        fun2(1,2,3);
        System.out.println("------");
        fun3(3, 4);
        System.out.println("------");
        fun4(5,-2);
        System.out.println("------");
        fun5(2, -3, 4);
        System.out.println("------");
        fun6(1, 3, 6);
        System.out.println("------");
        fun7(1, 5, 0.5);
        System.out.println("------");
        fun8(5,2);
        System.out.println("------");
        fun9(3, 5, 1);
        System.out.println("------");
        fun10(5);
    }

    static void fun1(int number) {
        int pos1000 = number / 1000;
        int pos100 = (number - pos1000 * 1000) / 100;
        int pos10 = (number - pos1000 * 1000 - pos100 * 100) / 10;
        int pos1 = number % 10;

        boolean result = (pos1000 + pos100 == pos10 + pos1);
        System.out.println(result);
    }

    static void fun2(double a, double b, double c) {
        double sqrtArg = Math.pow(b, 2) + 4 * a * c;
        if (a != 0 && sqrtArg >= 0) {
            double add1 = (b + Math.sqrt(sqrtArg)) / (2 * a);
            double add2 = (-1) * Math.pow(a, 3) * c;
            double add3 = Math.pow(b, -2);
            double result = add1 + add2 + add3;
            System.out.println(result);
        }
    }

    static void fun3(double a, double b) {
        double P = a + b + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("P = " + P);
        System.out.println("S = " + 0.5 * a * b);
    }

    static void fun4(int x, int y) {
        boolean isInSquareX = (x >= -2 && x <= 2);
        boolean isInSquareY = (y >= 0 && y <= 4);
        boolean isInRectangleX = (x >= -4 && x <= 4);
        boolean isInRectangleY = (y >= -3 && y <= 0);
        boolean result = isInSquareX && isInSquareY || isInRectangleX && isInRectangleY;
        System.out.println(result);
    }

    static void fun5(double a, double b, double c) {
        double[] array = new double[3];
        double[] result = new double[3];
        array[0] = a;
        array[1] = b;
        array[2] = c;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0)
                result[i] = Math.pow(array[i], 2);
            else
                result[i] = Math.pow(array[i], 4);

            System.out.println(result[i]);
        }
    }

    static void fun6 (int a, int b, int c) {
        int ab = a + b;
        int ac = a + c;
        int bc = b + c;

        if ((ab < ac || ab < bc) && (ab > ac || ab > bc))
            System.out.println(ab);

        if ((ac < ab || ac < bc) && (ac > ab || ac > bc))
            System.out.println(ac);

        if ((bc < ac || bc < ab) && (bc > ac || bc > ab))
            System.out.println(bc);
    }

    static void fun7 (double a, double b, double h) {
        System.out.println("  Argument|  Function");
        for (double i = a; i <= b; i += h) {
            System.out.format("%10.4f|%10.4f%n", i, Math.pow(Math.sin(i), 2) - Math.cos(2 * i));
        }
    }

    static void fun8(int N, int K) {
        Random random = new Random();
        int[] array = random.ints(N, 1, 20).toArray();

        int sum = 0;
        for (int j : array) {
            if (j % K == 0)
                sum += j;
        }
        System.out.println(sum);
    }

    static void fun9(int len1, int len2, int k) {
        Random random = new Random();
        int[] array1 = random.ints(len1, 1, 20).toArray();
        int[] array2 = random.ints(len2, 1, 20).toArray();
        int[] resultArray = new int[len1 + len2];

        if (k < 0 || k >= len1 - 1)
            return;

        for (int i = 0, j = 0; i < array1.length && j < resultArray.length; i++, j++) {
            resultArray[j] = array1[i];
            if (i == k) {
                j++;
                for (int value : array2) {
                    resultArray[j] = value;
                    j++;
                }
                j--;
            }
            System.out.print(resultArray[j] + "  ");
        }

        System.out.println();
    }

    static void fun10(int n) {
        int[][] matrix = new int[n][n];

        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = i % 2 == 0 ? j + 1 : n - j;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
