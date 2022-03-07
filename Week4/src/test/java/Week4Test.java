import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Week4Test {

    @Test
    public void testMax2Int1() {
        assertEquals(2, Week4.max2Int(1, 2));
    }

    @Test
    public void testMax2Int2() {
        assertEquals(2, Week4.max2Int(2, 2));
    }

    @Test
    public void testMax2Int3() {
        assertEquals(2, Week4.max2Int(2, 1));
    }

    @Test
    public void testMax2Int4() {
        assertEquals(2, Week4.max2Int(2, 2));
    }

    @Test
    public void testMax2Int5() {
        assertEquals(3, Week4.max2Int(3, 2));
    }

    @Test
    public void testMinArray1() {
        assertEquals(1, Week4.minArray(new int[]{1, 2, 3}));
    }

    @Test
    public void testMinArray2() {
        assertEquals(1, Week4.minArray(new int[]{1, 1, 1}));
    }

    @Test
    public void testMinArray3() {
        assertEquals(1, Week4.minArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    }

    @Test
    public void testMinArray4() {
        assertEquals(1, Week4.minArray(new int[]{1, 2}));
    }

    @Test
    public void testMinArray5() {
        assertEquals(1, Week4.minArray(new int[]{1}));
    }

    @Test
    public void testCalculateBMI1() {
        assertEquals("Thiếu cân", Week4.calculateBMI(272, 4));
    }

    @Test
    public void testCalculateBMI2() {
        assertEquals("Thiếu cân", Week4.calculateBMI(68, 2));
    }

    @Test
    public void testCalculateBMI3() {
        assertEquals("Thiếu cân", Week4.calculateBMI(153, 3));
    }

    @Test
    public void testCalculateBMI4() {
        assertEquals("Bình thường", Week4.calculateBMI(304, 4));
    }

    @Test
    public void testCalculateBMI5() {
        assertEquals("Thừa cân", Week4.calculateBMI(600, 5));
    }

}