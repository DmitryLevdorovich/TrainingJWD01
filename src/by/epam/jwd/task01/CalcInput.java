package by.epam.jwd.task01;

import java.util.Random;

public class CalcInput {

    public double inputRandomDouble(double min, double max) {
        double value;
        Random random = new Random();
        value = min + (max - min) * random.nextDouble();
        return value;
    }

    public int inputRandomInt(int min, int max) {
        int value;
        Random random = new Random();
        value = random.nextInt(max - min) + min;
        return value;
    }

    public int[] inputRandomIntArray(int N) {
        Random random = new Random();
        return random.ints(N, 1, 20).toArray();
    }
}
