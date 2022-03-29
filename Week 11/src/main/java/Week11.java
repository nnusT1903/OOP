import java.util.List;

public class Week11 {
    /**
     * Generic Bubble Sort.
     *
     * @param list The given List of Generics T.
     * @param <T>  Specific Generics Type.
     * @return List after Sorting in Ascending Order.
     */

    public static <T extends Comparable<T>> List<T> sortGeneric(List<T> list) {
        T temp;
        boolean flag = false;
        for (int i = 0; i < list.size() - 1; i++) {
            flag = false;
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j).compareTo(list.get(j + 1)) > 0) {
                    temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
        return list;
    }

}
