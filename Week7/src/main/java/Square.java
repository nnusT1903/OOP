public class Square extends Expression {
    private Expression expression;

    /**
     * Constructor.
     *
     * @param expression Expression
     */

    public Square(Expression expression) {
        this.expression = expression;
    }

    /**
     * Override Function for Square.toString.
     * @return String
     */

    @Override
    public String toString() {
        return "(" + this.expression.toString() + ") ^ 2";
    }

    /**
     * Override function for Square.evaluate.
     * @return double
     */

    @Override
    public double evaluate() {
        return Math.pow(this.expression.evaluate(),2);
    }
}
