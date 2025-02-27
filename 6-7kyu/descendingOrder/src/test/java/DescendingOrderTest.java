import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DescendingOrderTest {
    @Test
    public void test1() {
        assertEquals(0, DescendingOrder.sortDesc(0));
    }

    @Test
    public void test2() {
        assertEquals(321, DescendingOrder.sortDesc(123));
    }

    @Test
    public void test3() {
        assertEquals(987654321, DescendingOrder.sortDesc(123456789));
    }
}
