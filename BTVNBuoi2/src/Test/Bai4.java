package Test;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử trong mảng: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Nhập L và R (1 <= L <= R <= " + n + "): ");
        int L = scanner.nextInt() - 1;
        int R = scanner.nextInt() - 1;
        int sum = 0;
        for (int j = L; j <= R; j++) {
            sum += arr[j];
        }

            System.out.println("Tổng từ " + (L + 1) + " đến " + (R + 1) + ": " + sum);

        scanner.close();
    }
}
