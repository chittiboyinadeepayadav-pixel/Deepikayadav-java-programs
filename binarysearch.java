import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of cities: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " sorted elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element to search:");
        int key = sc.nextInt();
        int left = 0, right = n - 1;
        int pos = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == key) {
                pos = mid;
                break;
            } else if (arr[mid] < key) {
                left = mid + 1; 
            } else {
                right = mid - 1; 
            }
        }
        if (pos == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + pos);
        }
        sc.close();
    }
}
