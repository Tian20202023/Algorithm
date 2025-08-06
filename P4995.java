import java.util.Scanner;
import java.util.Arrays;

public class P4995 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int l = 0;
        int r = arr.length - 1;
        long result = arr[r] * arr[r];
        while (r > l) {
            result += Math.pow((arr[r] - arr[l]), 2);
            r--;
            result += Math.pow((arr[r] - arr[l]), 2);
            l++;
        }
        System.out.println(result);
    }
}
