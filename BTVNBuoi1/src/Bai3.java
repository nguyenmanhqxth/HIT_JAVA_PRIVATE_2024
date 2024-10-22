package BTVNBuoi1;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Nhập 5 số nguyên:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        int max1 = numbers[0];
        int max2 = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2 && num != max1) {
                max2 = num;
            }
        }
        System.out.println("Giá trị lớn nhất là: " + max1);
        System.out.println("Giá trị lớn thứ hai là: " + (max2 == Integer.MIN_VALUE ? "Không có giá trị lớn thứ hai" : max2));

        scanner.close();
    }
}
