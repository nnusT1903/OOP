public class Addition extends BinaryExpression {

    /**
     * Constructor.
     *
     * @param left  Expression
     * @param right Expression
     */

    public Addition(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * Override Function for Addition.toString.
     *
     * @return String
     */

    @Override
    public String toString() {
        return "(" + left.toString() + " + " + right.toString() + ")";
    }

    /**
     * Override Function for Addition.evaluate.
     *
     * @return double
     */

    @Override
    public double evaluate() {
        return left.evaluate() + right.evaluate();
    }
}
