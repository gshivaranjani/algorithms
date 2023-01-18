import java.util.Arrays;
import java.util.Collections;

public class KLargest {
    public static void main(String[] args) {
        Integer[] arr = new Integer[] {1, 23, 12, 9, 30, 2, 50};
        int k = 3;
        kLargest(arr, k);

        int[] prim_array = { 1, 23, 12, 9, 30, 2, 50 };
        Integer[] obj_array = Arrays.stream(prim_array).boxed().toArray(
                Integer[] ::new);
    }

    public static void kLargest(Integer[] a,int n) {
        Arrays.sort(a, Collections.reverseOrder());

        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");

        Arrays.sort(a);
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}
