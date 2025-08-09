import java.util.Scanner;

public class P3817 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();

        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        long sum = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] + arr[i + 1] <= x) {
                continue;
            } else {
                long temp = arr[i] + arr[i + 1] - x;
                if (temp < arr[i + 1]) {
                    arr[i + 1] = arr[i + 1] - temp;
                    sum += temp;
                } else {
                    arr[i + 1] = 0;
                    sum += temp;
                }
            }
        }
        System.out.println(sum);
    }
}
