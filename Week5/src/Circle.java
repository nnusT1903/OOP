public class Circle {
    protected static final double PI = Math.PI;
    private double radius;
    private String color;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return PI * this.getRadius() * this.getRadius();
    }

    public String toString() {
        return "Circle[radius=" + this.getRadius() + ",color=" + this.getColor();
    }
}
