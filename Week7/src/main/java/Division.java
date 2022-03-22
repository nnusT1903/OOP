public class Division extends  BinaryExpression {

    /**
     * Constructor.
     * @param left Expression
     * @param right Expression
     */

    public Division(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * Override Function for Division.toString.
     * @return String
     */

    @Override
    public String toString() {
        return "(" + left.toString() + "/" + right.toString() + ")";
    }

    /**
     * Override Function for Division.evaluate.
     * @return double
     */

    @Override
    public double evaluate() {
        if (right.evaluate() == 0) {
            throw new ArithmeticException("Lỗi chia cho 0");
        } else {
            return this.left.evaluate() / this.right.evaluate();
        }
    }
}
