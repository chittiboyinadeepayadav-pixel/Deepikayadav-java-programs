import java.util.Scanner;
public class NeonNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int sq = number * number;
        int sum = 0;
        while (sq > 0) {
            sum = sum + (sq % 10);
            sq = sq / 10;
        }
        if (sum == number) {
            System.out.println("Neon Number");
        } else {
            System.out.println("Not Neon Number");
        }
        input.close();
    }
}
