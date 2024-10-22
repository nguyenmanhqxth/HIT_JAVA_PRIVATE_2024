package BTVNBuoi1;

import java.util.Scanner;

public class Bai1 {
    public static String convertToBase(int decimalNumber, int base) {
        final String DIGITS = "0123456789ABCDEF";
        StringBuilder result = new StringBuilder();
        if (decimalNumber == 0) {
            return "0";
        }
        while (decimalNumber > 0) {
            int remainder = decimalNumber % base;
            result.insert(0, DIGITS.charAt(remainder));
            decimalNumber /= base;
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số thập phân: ");
        int decimalNumber = scanner.nextInt();
        System.out.print("Nhập hệ cơ số (2-16): ");
        int base = scanner.nextInt();
        if (base < 2 || base > 16) {
            System.out.println("Hệ cơ số không hợp lệ! Vui lòng nhập từ 2 đến 16.");
        } else {
            String result = convertToBase(decimalNumber, base);
            System.out.println("Số thập phân " + decimalNumber + " chuyển sang hệ " + base + " là: " + result);
        }

        scanner.close();
    }
}
