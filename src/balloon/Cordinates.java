package balloon;

import java.util.Random;

public class Cordinates {
    private static Random random = new Random();

    public static int randomInt(int lowerLimit, int upperLimit) {
        return Cordinates.random.nextInt(upperLimit - lowerLimit ) + lowerLimit;
    }

}


