package by.epam.jwd.task01;

public class Main {

    public static void main(String[] args) {
        CalcInput input = new CalcInput();
        CalcLogic logic = new CalcLogic();
        CalcView view = new CalcView();

        //task4
        int x = input.inputRandomInt(-10, 10);
        int y = input.inputRandomInt(-10, 10);
        boolean result = logic.isInGrayZone(x, y);
        view.outputValueToConsole("Point is in gray zone: ", result);

        //task7
        double a = input.inputRandomDouble(0.0, 5.0);
        double b = input.inputRandomDouble(10.0, 20.0);
        double h = input.inputRandomDouble(1.0, 1.5);
        double[][] resMatrix = logic.calcFunctionOnSegment(a, b, h);
        view.outputMatrixToConsole(resMatrix);

        //task8
        int N = input.inputRandomInt(10, 50);
        int[] array = input.inputRandomIntArray(N);
        int K = input.inputRandomInt(2, 5);
        int sum = logic.calcSumOfMultiples(array, K);
        view.outputValueToConsole("Sum of multiples of K: ", sum);

        //task10
        int n = input.inputRandomInt(10, 30);
        int[][] matrix = logic.calcMatrix(n);
        view.outputMatrixToConsole(matrix);
    }
}
