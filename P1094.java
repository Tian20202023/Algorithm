import java.util.Scanner;
import java.util.Arrays;

public class P1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int l = 0;
        int r = n - 1;
        int cnt = 0;
        while (l < r) {
            if (arr[r] + arr[l] > w) {
                cnt++;
                r--;
            } else {
                cnt++;
                l++;
                r--;
            }
        }
        if (l == r) {
            cnt++;
        }
        System.out.println(cnt);
    }
}
