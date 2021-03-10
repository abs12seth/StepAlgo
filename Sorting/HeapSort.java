import java.util.Scanner;

public class HeapSort {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        HeapSort hs = new HeapSort();
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = scan.nextInt();
        }

        hs.hsort(arr,n);

        for(int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }


    }

    void minheapify(int[] arr,int i, int n){
        int smallest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if(left < n && arr[left] > arr[smallest])
            smallest = left;
        if(right < n && arr[right] > arr[smallest])
            smallest = right;
        if(smallest != i) {
            swap(arr,i, smallest);
            minheapify(arr, smallest, n);
        }
    }

    void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    void hsort(int[] arr, int n){
        for(int i=n/2-1; i>=0; i--){
            minheapify(arr,i,n);
        }
        for(int i=n-1; i>=0; i--){
            swap(arr,0, i);
            minheapify(arr,0,i);
        }
    }



}
