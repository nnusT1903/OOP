import java.util.Objects;

public class Circle extends Shape {
    protected final double pi = Math.PI;
    protected double radius;
    protected Point center;

    /**
     * Constructor 1.
     */

    public Circle() {
        super();
        this.radius = 0;
    }

    /**
     * Constructor 2.
     *
     * @param radius radius of the circle
     */

    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Constructor 3.
     *
     * @param radius radius of the circle
     * @param color  color of the circle
     * @param filled filled or not
     */

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    /**
     * Constructor 4.
     *
     * @param center center of the circle
     * @param radius radius of the circle
     * @param color  color of the circle
     * @param filled filled or not
     */

    public Circle(Point center, double radius, String color, boolean filled) {
        super(color, filled);
        this.center = center;
        this.radius = radius;
    }

    /**
     * Getter for radius.
     *
     * @return radius
     */

    public double getRadius() {
        return radius;
    }

    /**
     * Setter for radius.
     *
     * @param radius radius of the circle
     */

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Getter for center.
     *
     * @return center of the circle
     */

    public Point getCenter() {
        return center;
    }

    /**
     * Setter for Center.
     */

    public void setCenter(Point center) {
        this.center = center;
    }

    /**
     * Calculate the area of the circle.
     *
     * @return area
     */

    @Override
    public double getArea() {
        return getRadius() * getRadius() * pi;
    }

    /**
     * Calculate the perimeter of the circle.
     *
     * @return perimeter
     */

    public double getPerimeter() {
        return 2 * getRadius() * pi;
    }

    /**
     * Override toString method.
     */

    public String toString() {
        return "Circle[center=" + getCenter()
                + ",radius=" + getRadius()
                + ",color=" + getColor()
                + ",filled=" + isFilled() + "]";
    }

    /**
     * Override equals method.
     */

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Circle) {
            Circle circle = (Circle) obj;
            return (this.center.equals(circle.center) && this.radius == circle.radius);
        }
        return false;
    }

    /**
     * Override hashCode method.
     */

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), center, radius);
    }

}
