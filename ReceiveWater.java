import java.util.Scanner;
import java.util.HashMap; // 引入 HashMap 类
import java.util.Map;

public class ReceiveWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Integer> Person = new HashMap<Integer, Integer>();
        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            Person.put(i, x);
        }

        int[] res = Person.entrySet().stream().sorted((a, b) -> a.getValue() - b.getValue()).mapToInt(Map.Entry::getKey)
                .toArray();
        for (int i = 0; i < n; i++) {
            System.out.print(res[i] + " ");
        }
        System.out.println();
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Person.get(res[i]) * (n - i - 1);
        }
        double result = sum / n;
        String formattedResult = String.format("%.2f", result);
        System.out.println(formattedResult);

    }
}