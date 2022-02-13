package by.epam.jwd.task01;

public class CalcView {

    public void outputValueToConsole(String text, boolean value) {
        System.out.println(text + value);
    }

    public void outputValueToConsole(String text, int value) {
        System.out.println(text + value);
    }

    public void outputMatrixToConsole(double[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            for (double[] doubles : matrix) {
                System.out.printf("|%10.4f", doubles[i]);
            }
            System.out.print("|");
            System.out.println();
        }
    }

    public void outputMatrixToConsole(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
