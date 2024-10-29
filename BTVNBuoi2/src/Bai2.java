import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int result = maxSubarraySum(arr, k);
        System.out.println(result);

        scanner.close();
    }
    public static int maxSubarraySum(int[] arr, int k) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = 0; i < arr.length; i++){
            currentSum += arr[i];
            if (i >= k - 1){
                maxSum = Math.max(maxSum, currentSum);
                currentSum -= arr[i - (k - 1)];
            }
        }
        return maxSum;
    }
}
