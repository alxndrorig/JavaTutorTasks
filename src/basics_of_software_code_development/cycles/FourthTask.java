package basics_of_software_code_development.cycles;

import java.math.BigInteger;

/**
 * @author Aliaksandr Yamrom
 * @task Составить программу нахождения квадратов первых двухсот чисел.
 */

public class FourthTask {
    private static BigInteger fourthTask() {
        BigInteger composition = BigInteger.ONE;
        for (int i = 2; i <= 200; i++) {
            composition = composition.multiply(BigInteger.valueOf(i*i));
        }
        return composition;
    }

    public static void main(String[] args) {
        System.out.println(fourthTask());
    }
}
