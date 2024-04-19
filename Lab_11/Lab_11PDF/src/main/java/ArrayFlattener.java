import java.util.ArrayList;
import java.util.List;

public class ArrayFlattener {
    public int[] flattenArray(int[][] array) {
        if (array == null) {
            return new int[0];
        }

        List<Integer> flattenedList = new ArrayList<>();
        for (int[] innerArray : array) {
            for (int num : innerArray) {
                flattenedList.add(num);
            }
        }

        int[] flattenedArray = new int[flattenedList.size()];
        for (int i = 0; i < flattenedList.size(); i++) {
            flattenedArray[i] = flattenedList.get(i);
        }

        return flattenedArray;
    }
}
