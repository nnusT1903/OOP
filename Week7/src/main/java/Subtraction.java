public class Subtraction extends BinaryExpression {

    /**
     * Constructor.
     *
     * @param left  Expression
     * @param right Expression
     */

    public Subtraction(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * Override Function for Subtraction.toString.
     *
     * @return String
     */

    @Override
    public String toString() {
        return "(" + this.left.toString() + "-" + this.right.toString() + ")";
    }

    /**
     * Override Function for Subtraction.evaluate.
     *
     * @return double
     */

    @Override
    public double evaluate() {
        return this.left.evaluate() - this.right.evaluate();
    }
}
