public class Circle implements GeometricObject {
    public static final double PI = 3.14;
    private Point center;
    private double radius;

    /**
     * Constructor.
     *
     * @param center Point
     * @param radius double
     */

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    /**
     * Get center.
     *
     * @return Point
     */

    public Point getCenter() {
        return center;
    }

    /**
     * Set center.
     *
     * @param center Point
     */

    public void setCenter(Point center) {
        this.center = center;
    }

    /**
     * Get radius.
     *
     * @return double
     */

    public double getRadius() {
        return radius;
    }

    /**
     * Set radius.
     *
     * @param radius double
     */

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Get the Circle's Area.
     *
     * @return double
     */

    public double getArea() {
        return radius * radius * PI;
    }

    /**
     * Get the Circle's Perimeter.
     *
     * @return double
     */

    public double getPerimeter() {
        return 2 * radius * PI;
    }

    public String getInfo() {
        return String.format("Circle[(%.2f,%.2f),r=%.2f]",
                center.getPointX(), center.getPointY(), radius);
    }
}
