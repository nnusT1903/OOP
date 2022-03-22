public class ExpressionTest {

    /**
     * Main Function.
     * @param args Strings
     */
    public void main(String[] args) {
        Numeral ten = new Numeral(10);
        Numeral three = new Numeral(3);
        Numeral four = new Numeral(4);
        Numeral zero = new Numeral(0);

        Square square = new Square(ten);
        Multiplication multiplication = new Multiplication(four, three);
        Subtraction subtraction = new Subtraction(square, three);
        Addition addition = new Addition(subtraction, multiplication);
        Square finalAns = new Square(addition);

        System.out.println(finalAns);
    }
}
