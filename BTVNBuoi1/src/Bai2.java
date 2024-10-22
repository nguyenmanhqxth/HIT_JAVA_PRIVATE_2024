package BTVNBuoi1;

import java.util.Scanner;

public class Bai2 {
    public static int calculateProductOfDigits(int number) {
        int product = 1;
        while (number > 0) {
            int digit = number % 10;
            product *= digit;
            number /= 10;
        }
        return product;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên: ");
        int inputNumber = scanner.nextInt();
        int result = calculateProductOfDigits(inputNumber);
        System.out.println("Kết quả là: " + result);

        scanner.close();
    }
}
