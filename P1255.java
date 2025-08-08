import java.util.Scanner;
import java.math.BigInteger;

public class P1255 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 使用 BigInteger 数组来存储斐波那契数列
        BigInteger[] arr = new BigInteger[N + 1];

        // 初始化前两项
        if (N >= 1) {
            arr[1] = BigInteger.ONE;
        }
        if (N >= 2) {
            arr[2] = BigInteger.valueOf(2);
        }

        // 计算斐波那契数列
        for (int i = 3; i <= N; i++) {
            arr[i] = arr[i - 1].add(arr[i - 2]);
        }

        // 输出第 N 项
        System.out.println(arr[N]);

        sc.close();
    }
}
