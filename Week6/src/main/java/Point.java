import java.util.Objects;

public class Point {
    private double pointX;
    private double pointY;

    /**
     * Initialize coordinates of a point on the Descartes system.
     *
     * @param pointX X coordinate
     * @param pointY Y coordinate
     */
    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    /**
     * Getter for X coordinate.
     *
     * @return X coordinate
     */

    public double getPointX() {
        return this.pointX;
    }

    /**
     * Setter for X coordinate.
     */

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    /**
     * Getter for Y coordinate.
     *
     * @return Y coordinate
     */

    public double getPointY() {
        return this.pointY;
    }

    /**
     * Setter for Y coordinate.
     */

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    /**
     * Distance between 2 points.
     *
     * @return distance
     */

    public double distance(Point p) {
        return Math.abs(Math.pow(this.pointX - p.pointX, 2) + Math.pow(this.pointY - p.pointY, 2));
    }

    /**
     * Override equals method.
     */

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Point) {
            Point p = (Point) obj;
            return (this.getPointX() == p.getPointX() && this.getPointY() == p.getPointY());
        }
        return false;
    }

    /**
     * Override hashCode method.
     */

    @Override
    public int hashCode() {
        return Objects.hash(this.pointX, this.pointY);
    }

    @Override
    public String toString() {
        return "(" + getPointX() + "," + getPointY() + ")";
    }
}
