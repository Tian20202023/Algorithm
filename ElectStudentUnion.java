import java.util.Scanner;

public class ElectStudentUnion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short N = sc.nextShort();
        int M = sc.nextInt();
        int[] count = new int[N + 1];
        for (int i = 0; i < M; i++) {
            count[sc.nextShort()]++;
        }
        for (int i = 1; i <= N; i++) {
            String s = "";
            for (int j = 0; j < count[i]; j++) {
                s += i + " ";
            }
            System.out.print(s);
        }
    }
}
