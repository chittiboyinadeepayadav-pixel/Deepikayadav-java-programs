import java.util.Scanner;
public class InsertElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n + 1]; // +1 for extra space
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter element to insert: ");
        int element = sc.nextInt();
        System.out.print("Enter position (1 to " + (n + 1) + "): ");
        int pos = sc.nextInt();
        if (pos < 1 || pos > n + 1) {
            System.out.println("Invalid position!");
        } else {
            for (int i = n; i >= pos; i--) {
                arr[i] = arr[i - 1];
            }
            arr[pos - 1] = element;
            n++;
            System.out.println("Array after insertion:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        sc.close();
    }
}
