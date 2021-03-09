import java.util.Scanner;

public class RecInsertion {

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = scanner.nextInt();
        int[] input = new int[n];
        System.out.println("Enter the elements for an array");
        for (int i = 0; i < n; i++) {
            input[i] = scanner.nextInt();
        }
        scanner.close();
        insertionSort(input,n);

        for (int i = 0; i < n; i++) {
            System.out.print(input[i] + " ");
        }
    }
    public static void insertionSort(int[] input,int num) {
        if(num<2)
            return;
        System.out.println(num);
        insertionSort(input,num-1);
        System.out.println(num);
        int newElement = input[num-1];
        int j;
        for(j = num-1; j > 0 && input[j-1]>newElement; j--) {
            input[j] = input[j-1];
        }
        input[j] = newElement;


    }

}
