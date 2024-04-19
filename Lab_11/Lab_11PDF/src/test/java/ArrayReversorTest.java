import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(value= MockitoJUnitRunner.class)
public class ArrayReversorTest {

    @Mock
    private ArrayFlattener arrayFlattener;

    @Test
    public void testArrayReversor() {
        int[][] inputArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] expectedFlat = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int[] expected = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        ArrayReversor arrayReversor = new ArrayReversor(arrayFlattener);
        when(arrayFlattener.flattenArray(inputArray)).thenReturn(expectedFlat);

        int[] result = arrayReversor.arrayReverse(inputArray);
        Assert.assertArrayEquals(expected, result);
        verify(arrayFlattener).flattenArray(inputArray);

    }

    @Test
    public void testArrayReversorNull() {
        ArrayReversor arrayReversor = new ArrayReversor(null);
        int[][] inputArray = null;
        int[] expected = {};
        int[] result = arrayReversor.arrayReverse(inputArray);
        Assert.assertArrayEquals(expected, result);
    }
}
