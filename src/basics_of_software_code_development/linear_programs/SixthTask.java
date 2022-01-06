package basics_of_software_code_development.linear_programs;
/**
 * @author Aliaksandr Yamrom
 * @task Для данной области составить линейную программу, которая печатает true, если точка с координатами (x, y)
 * принадлежит данной области, и false - в противном случае.
 * Заданная область:   -4 <= x <= 4
 *                     -3 <= y <= 3
 *
 */
public class SixthTask {
    private static boolean sixthTask(int x, int y) {
        /*
         */
        boolean a = ((x >= -4) && (x <= 4)) && ((y >= -3) && (y <= 4));
        boolean b = ((x >= -2) && (x <= 2)) && ((y >= -3) && (y <= 0));
        return a || b;
    }

    public static void main(String[] args) {
        System.out.println(sixthTask(4, 0));
    }
}
