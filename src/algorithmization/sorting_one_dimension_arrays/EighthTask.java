package algorithmization.sorting_one_dimension_arrays;

/**
 * @author Aliaksandr Yamrom
 * @task Даны дроби p1/q1, p2/q2, ..., pn/qn, (pi, qi - натуральные). Составить программу, которая приводит эти дроби к
 * общему знаменателю и упорядочивает их в порядке возрастания.
 */

public class EighthTask {
    private static void eighthTask(int[] numerator, int[] denominator) {
        for (int i = 0; i < denominator.length-1; i++) {
            for (int j = i+1; j < denominator.length; j++) {
                if (denominator[i] < denominator[j]) {
                    int temp = denominator[i];
                    denominator[i] = denominator[j];
                    denominator[j] = temp;

                    temp = numerator[i];
                    numerator[i] = numerator[j];
                    numerator[j] = temp;
                }
            }
        }

        int common_denominator = 1;
        for (int k : denominator) {
            if (common_denominator % k != 0) {
                common_denominator *= k;
            }
        }

        for (int i = 0; i < denominator.length; i++) {
            numerator[i] *= ((double) common_denominator / denominator[i]);
            denominator[i] = common_denominator;
        }

        for (int i = 0; i < numerator.length-1; i++) {
            for (int j = i+1; j < numerator.length; j++) {
                if (numerator[i] > numerator[j]) {
                    int temp = numerator[i];
                    numerator[i] = numerator[j];
                    numerator[j] = temp;
                }
            }
        }

        for (int i = 0; i < numerator.length; i++) {
            System.out.println(numerator[i] + "\\" + denominator[i]);
        }
    }

    public static void main(String[] args) {
        eighthTask(new int[]{3, 5, 8}, new int[]{4, 3, 5});
    }
}
