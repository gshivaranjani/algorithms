public class BubbleSort {

    public static void main(String[] args) {
        int arr[] = { 5, 1, 4, 2, 8 };

        arr = bubbleSort(arr);
       for(int i : arr)
           System.out.println(i);

    }

    public static int[] bubbleSort(int a[]) {
        for(int i=0;i<a.length;i++) {
            for(int j=0;j<a.length-i-1;j++) {
                if(a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        return a;
    }
}
