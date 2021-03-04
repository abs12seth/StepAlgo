import java.util.Scanner;

public class ShellSort {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = scanner.nextInt();
        int[] input = new int[n];
        System.out.println("Enter the elements for an array");
        for (int i = 0; i < n; i++) {
            input[i] = scanner.nextInt();
        }
        scanner.close();

        for(int gap = n/2; gap >0; gap = gap/2) {

            for(int i = gap;i<n;i++) {
                int newElement = input[i];
                int j = i;
                while (j>=gap && input[j-gap]>newElement) {
                    input[j] = input[j-gap];
                    j = j - gap;
                }
                input[j] = newElement;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(input[i] + " ");
        }
    }

}
