public class Multiplication extends BinaryExpression{
    /**
     * Constructor.
     * @param left  Expression
     * @param right Expression
     */

    public Multiplication(Expression left, Expression right){
        super(left,right);
    }

    /**
     * Override Function for Multiplication.toString.
     * @return String
     */

    @Override
    public String toString() {
        return "(" + this.left + "*" + this.right + ")";
    }

    /**
     * Override Function for Multiplication.evaluate.
     * @return double
     */

    @Override
    public double evaluate() {
        return this.left.evaluate() * this.right.evaluate();
    }
}
