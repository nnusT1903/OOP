public class Point {
    private double pointX;
    private double pointY;

    /**
     * Constructor.
     *
     * @param pointX x coordinate
     * @param pointY y coordinate
     */

    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    /**
     * Get x coordinate.
     *
     * @return x
     */

    public double getPointX() {
        return pointX;
    }

    /**
     * Set x coordinate.
     *
     * @param pointX x coordinate
     */

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    /**
     * Get y coordinate.
     *
     * @return y
     */

    public double getPointY() {
        return pointY;
    }

    /**
     * Set the y coordinate.
     *
     * @param pointY y coordinate
     */

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    /**
     * Calculate the distance between two points.
     *
     * @param p the other point
     * @return the distance between two points
     */

    public double distance(Point p) {
        return Math.sqrt(Math.pow(p.getPointX() - this.getPointX(), 2)
                + Math.pow(p.getPointY() - this.getPointY(), 2));
    }

    /**
     * Check whether this point is on another point.
     *
     * @param otherPoint the other point
     * @return true if the points are one
     */

    public boolean equals(Point otherPoint) {
        return this.pointX == otherPoint.pointX
                && this.pointY == otherPoint.pointY;
    }

    /**
     * Get Info.
     *
     * @return String
     */

    public String getInfo() {
        return String.format("(%.2f,%.2f)", this.getPointX(), this.getPointY());
    }
}
