public class RecursiveBubbleSort {
    public static void main(String[] args) {
        int arr[] = { 5, 1, 4, 2, 8 };

        bubbleSort(arr,arr.length);

        for(int i : arr) {
            System.out.println(i);
        }
    }

    public static void bubbleSort(int[] a,int n) {
        if(n==0 || n==1)
            return;

        for(int i=0;i<n-1;i++) {
            if(a[i]>a[i+1]) {
                int temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
            }
        }
        bubbleSort(a,n-1);
    }
}
