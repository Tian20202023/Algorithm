import java.util.Scanner;

public class HalfFind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        while (sc.hasNextInt()) {
            int x = sc.nextInt();
            int res = findNumber(x, arr, 0, arr.length - 1);
            System.out.print(res + " ");
        }

    }

    public static int findNumber(int x, int[] arr, int i, int j) {
        if (i > j) {
            return -1;
        }

        int mid = (i + j) / 2;
        if (arr[mid] > x) {
            return findNumber(x, arr, i, mid - 1);
        } else if (arr[mid] < x) {
            return findNumber(x, arr, mid + 1, j);
        } else {
            if (mid == 0 || arr[mid - 1] != x) {
                return mid + 1;
            } else {
                return findNumber(x, arr, i, mid - 1);
            }
        }

    }
}