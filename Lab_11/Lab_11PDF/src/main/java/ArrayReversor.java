
public class ArrayReversor {

    private ArrayFlattener arrayFlattener;

    public ArrayReversor(ArrayFlattener arrayFlattener) {
        this.arrayFlattener = arrayFlattener;
    }

    public int[] arrayReverse(int[][] array) {
        if (array == null) {
            return new int[0];
        }

        int[] flatArray = arrayFlattener.flattenArray(array);
        int length = flatArray.length;
        int[] reversedArray = new int[length];

        for (int i = 0; i < length; i++) {
            reversedArray[i] = flatArray[length - 1 - i];
        }

        return reversedArray;
    }
}
