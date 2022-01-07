package programming_with_classes.simplest_classes.seventhTask;

/**
 * Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
 * площади, периметра и точки пересечения медиан.
 */

public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    private final double sideA;
    private final double sideB;
    private final double sideC;

    public Triangle(Point a, Point b, Point c) {
        this.sideA = Point.getSide(a, b);
        this.sideB = Point.getSide(b, c);
        this.sideC = Point.getSide(a, c);
    }

    public double getArea() {
        double halfPerimeter = (this.sideA + this.sideB + this.sideC) / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - this.sideA) * (halfPerimeter - this.sideB) * (halfPerimeter - sideC));
    }

    public double getPerimeter() {
        return this.sideA + this.sideB + this.sideC;
    }

    public Point getMedianIntersection() {
        return new Point((a.getX() + b.getX() + c.getX()) / 3, (a.getY() + b.getY() + c.getY()) / 3);
    }
}
