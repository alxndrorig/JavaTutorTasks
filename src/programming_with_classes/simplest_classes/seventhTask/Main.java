package programming_with_classes.simplest_classes.seventhTask;

public class Main {

    private static Triangle getTriangle() {
        Point a = new Point(0, 0);
        Point b = new Point(1, 3);
        Point c = new Point(5, 7);
        if (isCorrectTriangle(a, b, c)) {
            System.out.println("Triangle is created!");
            Triangle triangle = new Triangle(a, b, c);
            return triangle;
        } else {
            System.out.println("Points don't form a triangle. Default triangle is created!");
            Triangle triangle = new Triangle(new Point(0, 0), new Point(1, 0), new Point(0, 1));
            return triangle;
        }
    }

    private static boolean isCorrectTriangle(Point a, Point b, Point c){
        return (Point.getSide(a, b) + Point.getSide(b, c) > Point.getSide(a, c)) &&
                (Point.getSide(a, b) + Point.getSide(a, c) > Point.getSide(b, c)) &&
                (Point.getSide(a, c) + Point.getSide(b, c) > Point.getSide(a, b));
    }

    public static void main(String[] args) {
        Triangle triangle = getTriangle();
        System.out.printf("%.3f %n", triangle.getArea());
        System.out.printf("%.3f", triangle.getPerimeter());
        triangle.getMedianIntersection();
    }
}
