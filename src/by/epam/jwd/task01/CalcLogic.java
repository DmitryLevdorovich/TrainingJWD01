package by.epam.jwd.task01;

public class CalcLogic {

    public boolean isInGrayZone(int x, int y) {
        boolean isInSquareX = (x >= -2 && x <= 2);
        boolean isInSquareY = (y >= 0 && y <= 4);
        boolean isInRectangleX = (x >= -4 && x <= 4);
        boolean isInRectangleY = (y >= -3 && y <= 0);

        return (isInSquareX && isInSquareY || isInRectangleX && isInRectangleY);
    }

    public double[][] calcFunctionOnSegment(double a, double b, double h) {
        double[][] resArray = new double[2][(int) ((b - a) / h + 1)];
        int j = 0;
        for (double i = a; i <= b; i += h) {
            resArray[0][j] = i;
            resArray[1][j] = Math.pow(Math.sin(i), 2) - Math.cos(2 * i);
            j++;
        }
        return resArray;
    }

    public int calcSumOfMultiples(int[] array, int K) {
        int sum = 0;
        for (int j : array) {
            if (j % K == 0)
                sum += j;
        }
        return sum;
    }

    public int[][] calcMatrix(int n) {
        int[][] matrix = new int[n][n];

        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = i % 2 == 0 ? j + 1 : n - j;
            }
        }

        return matrix;
    }
}
