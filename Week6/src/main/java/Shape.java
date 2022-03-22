public abstract class Shape {
    protected String color;
    protected boolean filled;

    /**
     * Initialize.
     */
    public Shape() {
        color = null;
        filled = false;
    }

    /**
     * 2nd Constructor.
     *
     * @param color  color of the shape.
     * @param filled filled or not.
     */

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    /**
     * getColor.
     *
     * @return color of the shape
     */

    public String getColor() {
        return color;
    }

    /**
     * Color setter.
     *
     * @param color color of the Shape
     */

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * isFilled.
     *
     * @return true/false depends on boolean value.
     */

    public boolean isFilled() {
        return filled;
    }

    /**
     * Filled Setter.
     *
     * @param filled boolean
     */

    public void setFilled(boolean filled) {
        this.filled = filled;
    }


    /**
     * Abstract method for area.
     *
     * @return area of the shape.
     */

    public abstract double getArea();

    /**
     * Abstract method for perimeter.
     *
     * @return perimeter of the shape.
     */

    public abstract double getPerimeter();

    /**
     * String Output.
     *
     * @return string representation of the shape.
     */

    public String toString() {
        return "Shape[color=" + color + ",filled=" + filled + "]";
    }
}
