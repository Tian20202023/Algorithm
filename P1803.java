import java.util.Scanner;
import java.util.Comparator;
import java.util.Arrays;

//贪心算法中会议安排的核心思想就是
//1、将会议按照结束时间由小到大排列
//2、在确定第一场会议的基础上寻找下一场开始时间在此会议结束时间之后的会议
public class P1803 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        // 将会议按照结束时间升序排列
        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[1] - b[1];
            }
        });

        int cnt = 1;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i][0] >= arr[j][1]) {
                cnt++;
                j = i;
            }
        }
        System.out.println(cnt);

    }
}
