import java.util.ArrayList;
import java.util.List;

public class ExpressionTest {


    public void main(String[] args) {
        ArrayList<Numeral> list = new ArrayList<>();
        Numeral n1 = new Numeral(10);
        Numeral n2 = new Numeral(3);
        Numeral n3 = new Numeral(4);
        Numeral n4 = new Numeral(0);
        list.add(n1);
        list.add(n2);
        list.add(n3);
        list.add(n4);

        Square square = new Square(list.get(1));

    }
}
