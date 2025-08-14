import java.util.Scanner;
public class RomanToInteger {
    public static int getValue(char ch) {
        if (ch == 'I') return 1;
        if (ch == 'V') return 5;
        if (ch == 'X') return 10;
        if (ch == 'L') return 50;
        if (ch == 'C') return 100;
        if (ch == 'D') return 500;
        if (ch == 'M') return 1000;
        return 0; // for safety
    }
    public static int romanToInt(String roman) {
        int total = 0;
        int prevValue = 0;
        for (int i = roman.length() - 1; i >= 0; i--) {
            int value = getValue(roman.charAt(i));
            if (value < prevValue) {
                total -= value; 
            } else {
                total += value; 
            }
            prevValue = value;
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roman numeral: ");
        String roman = sc.nextLine().toUpperCase();
        int number = romanToInt(roman);
        System.out.println("Integer value: " + number);
        sc.close();
    }
}
