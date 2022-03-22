import java.util.Objects;

public class Rectangle extends Shape {
    protected double width;
    protected double length;
    protected Point topLeft;

    /**
     * Constructor 1.
     */

    public Rectangle() {
        super();
        this.width = 0;
        this.length = 0;
    }

    /**
     * Constructor 2.
     *
     * @param width  width of the rectangle
     * @param length length of the rectangle
     */

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    /**
     * Constructor 3.
     *
     * @param width  width of the rectangle
     * @param length length of the rectangle
     * @param color  color of the rectangle
     * @param filled whether the rectangle is filled or not
     */

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    /**
     * Constructor 4.
     *
     * @param width   width of the rectangle
     * @param length  length of the rectangle
     * @param color   color of the rectangle
     * @param filled  whether the rectangle is filled or not
     * @param topLeft upper left Point of the rectangle
     */

    public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
        super(color, filled);
        this.topLeft = topLeft;
        this.width = width;
        this.length = length;
    }

    /**
     * Getter for width.
     *
     * @return width of the rectangle
     */

    public double getWidth() {
        return width;
    }

    /**
     * Setter for width.
     *
     * @param width width of the rectangle
     */

    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Getter for length.
     *
     * @return length of the rectangle
     */

    public double getLength() {
        return length;
    }

    /**
     * Setter for length.
     *
     * @param length length of the rectangle
     */

    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Calculates the area of the rectangle.
     *
     * @return area of the rectangle
     */

    public double getArea() {
        return getWidth() * getLength();
    }

    /**
     * Calculates the perimeter of the rectangle.
     *
     * @return perimeter of the rectangle
     */

    public double getPerimeter() {
        return (getWidth() + getLength()) + (getWidth() + getLength());
    }

    /**
     * Getter for topLeft.
     *
     * @return topLeft of the rectangle
     */

    public Point getTopLeft() {
        return topLeft;
    }

    /**
     * Setter for topLeft.
     *
     * @param topLeft topLeft of the rectangle
     */

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    /**
     * Overrides the equal method.
     */

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) obj;
            return (this.topLeft.equals(rectangle.topLeft)
                    && this.width == rectangle.width && this.length == rectangle.length);
        }
        return false;
    }

    /**
     * Overrides the hashCode method.
     */

    @Override
    public int hashCode() {
        return Objects.hash(getWidth(), getLength(), getTopLeft());
    }

    /**
     * Overrides the toString method.
     */


    @Override
    public String toString() {
        return "Rectangle[topLeft=" + getTopLeft()
                + ",width=" + getWidth()
                + ",length=" + getLength()
                + ",color=" + getColor()
                + ",filled=" + isFilled() + "]";
    }


}
