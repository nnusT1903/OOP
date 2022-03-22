public class Numeral extends Expression {
    private double value;

    /**
     * Constructor.
     *
     * @param value double
     */

    public Numeral(double value) {
        this.value = value;
    }

    /**
     * Constructor.
     */
    public Numeral() {

    }

    /**
     * Override Function for Numeral.toString
     *
     * @return String
     */

    @Override
    public String toString() {
        return String.format("%.0f", this.value);
    }

    /**
     * Override Function for Numeral.evaluate.
     *
     * @return double
     */

    @Override
    public double evaluate() {
        return this.value;
    }
}
