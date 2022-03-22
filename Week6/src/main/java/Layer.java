import java.util.List;

public class Layer {
    private List<Shape> shapes;

    /**
     * Initialize Array of Shapes.
     */

    public Layer() {
        this.shapes = new java.util.ArrayList<>();
    }

    /**
     * Function to add a shape into the given list.
     * @param x Shape
     */

    public void addShape(Shape x) {
        this.shapes.add(x);
    }

    /**
     * Function to remove all Circles from the Array.
     */

    public void removeCircles() {
        shapes.removeIf(shape -> shape instanceof Circle);
    }

    /**
     * Information about the Array of Shapes.
     * @return Info String
     */
    public String getInfo() {
        String str = "Layer of crazy shapes:\n";
        for (Shape shape : shapes) {
            str += shape.toString() + "\n";
        }
        return str.toString();
    }

    /**
     * Function to remove Duplicated Shapes.
     */
    public void removeDuplicates() {
        for (int i = 0; i < shapes.size(); i++) {
            for (int j = i + 1; j < shapes.size(); j++) {
                if (shapes.get(i).equals(shapes.get(j))) {
                    shapes.remove(j);
                }
            }
        }
    }
}
