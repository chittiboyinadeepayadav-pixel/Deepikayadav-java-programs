public class TimeComplexity{
    public static void constantTime() {
        System.out.println("O(1): Just one step");
    }
    public static void linearTime(int n) {
        System.out.print("O(n): ");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void quadraticTime(int n) {
        System.out.println("O(n^2):");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("(" + i + "," + j + ") ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 4; // change this number to see differences
        constantTime();     
        linearTime(n);       
        quadraticTime(n);
    }
}
