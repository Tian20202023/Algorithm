import java.util.Scanner;

public class PartialBackpack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float N = sc.nextFloat();
        float T = sc.nextFloat();
        float[] m = new float[1000];
        float[] v = new float[1000];
        float[] x = new float[1000];
        for (int i = 0; i < N; i++) {
            m[i] = sc.nextFloat();
            v[i] = sc.nextFloat();
        }

        System.out.println(String.format("%.2f", Backpack(T, m, v, x)));
    }

    public static float Backpack(float T, float[] m, float[] v, float[] x) {
        /*
         * T表示背包剩余容量
         * m数组表示物品重量
         * v数组表示物品价值
         * x数组用于存储最佳方案
         */
        int n = m.length;
        float sumV = 0;// 总价值
        int k = 0;
        // 将m，v数组按照单位价值由大到小排序
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((v[i] / m[i]) < (v[j] / m[j])) {
                    float temp1 = v[i];
                    v[i] = v[j];
                    v[j] = temp1;
                    float temp2 = m[i];
                    m[i] = m[j];
                    m[j] = temp2;
                }
            }
        }
        // 初始化x数组
        for (int i = 0; i < n; i++) {
            x[i] = 0;
        }

        // 将最佳方案填入x数组
        for (k = 0; k < n; k++) {
            if (m[k] > T)
                break;

            x[k] = 1;
            T = T - m[k];
            sumV += v[k];
        }

        if (k < n) {
            x[k] = T / m[k];
            sumV = sumV + T * (v[k] / m[k]);
        }
        return sumV;
    }
}
