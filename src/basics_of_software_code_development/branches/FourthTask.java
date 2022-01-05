package basics_of_software_code_development.branches;

/**
 * @author Aliaksandr Yamrom
 * @task Заданы размеры А, В прямоугольного отверстия и размеры x, y, z кирпича. Определить, пройдет ли такой кирпич через отверстие.
 */

public class FourthTask {
    private static boolean fourthTask(double a, double b, double x, double y, double z) {
        double length = Math.max(Math.max(x,y),z); //Определение, какой из параметров
        if (x == length){                           //Является длиной кирпича
            return  (y < a && z < b) || (y < b && z < a);
        } else if (y == length){
            return  (x < a && z < b) || (x < b && z < a);
        } else {
            return  (x < a && y < b) || (x < b && y < a);
        }
    }

    public static void main(String[] args) {
        System.out.println(fourthTask(1, 5, 16, 1 ,1));
    }
}
