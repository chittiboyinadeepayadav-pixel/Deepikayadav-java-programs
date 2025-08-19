public class SpaceComplexity {
    // O(1) - Constant space
    public static void constantSpace(int n) {
        int sum = 0;  
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("O(1) Space Example: Sum = " + sum);
    }
    public static void linearSpace(int n) {
        int[] arr = new int[n]; // array of size n (uses extra memory)
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        System.out.print("O(n) Space Example: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int n = 5; 
        constantSpace(n);  
        linearSpace(n);    
    }
}
