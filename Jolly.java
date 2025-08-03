import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Jolly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            list.add(x);
        }
        ArrayList<Integer> sub = new ArrayList<Integer>();
        for (int i = 0; i < n - 1; i++) {
            sub.add(Math.abs(list.get(i + 1) - list.get(i)));
        }
        Collections.sort(sub);

        for (int i = 0; i < sub.size(); i++) {
            System.out.print(sub.get(i) + " ");
        }
        System.out.println();

        for (int i = 0; i < n - 1; i++) {
            if (sub.get(i) != i + 1) {
                System.out.println("Not jolly");
                return;
            }
        }
        System.out.println("Jolly");
        return;
    }
}