import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArrayFlattenerTest {
    private ArrayFlattener arrayFlattener;

    @Before
    public void setUp() {
        arrayFlattener = new ArrayFlattener();
    }

    @Test
    public void testFlattenArray() {
        int[][] inputArray = {{1, 3}, {0}, {4, 5, 9}};
        int[] expected = {1, 3, 0, 4, 5, 9};
        int[] result = arrayFlattener.flattenArray(inputArray);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void testFlattenArrayNull() {
        int[][] inputArray = null;
        int[] expected = {};
        int[] result = arrayFlattener.flattenArray(inputArray);
        Assert.assertArrayEquals(expected, result);
    }
}
