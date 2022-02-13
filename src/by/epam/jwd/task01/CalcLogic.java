package by.epam.jwd.task01;

import java.util.Random;

public class CalcLogic {

    public boolean fun4(int x, int y) {
        boolean isInSquareX = (x >= -2 && x <= 2);
        boolean isInSquareY = (y >= 0 && y <= 4);
        boolean isInRectangleX = (x >= -4 && x <= 4);
        boolean isInRectangleY = (y >= -3 && y <= 0);

        return (isInSquareX && isInSquareY || isInRectangleX && isInRectangleY);
    }

    public double[][] fun7 (double a, double b, double h) {
        double[][] resArray = new double[2][(int) ((b - a) / h + 1)];
        int j = 0;
        for (double i = a; i <= b; i += h) {
            resArray[0][j] = i;
            resArray[1][j] = Math.pow(Math.sin(i), 2) - Math.cos(2 * i);
            //System.out.format("%10.4f|%10.4f%n", i, Math.pow(Math.sin(i), 2) - Math.cos(2 * i));
            j++;
        }
        return resArray;
    }

    public int fun8(int[] array, int K) {
        int sum = 0;
        for (int j : array) {
            if (j % K == 0)
                sum += j;
        }
        return sum;
    }

    public int[][] fun10(int n) {
        int[][] matrix = new int[n][n];

        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = i % 2 == 0 ? j + 1 : n - j;
                //System.out.print(matrix[i][j] + " ");
            }
            //System.out.println();
        }

        return matrix;
    }
}