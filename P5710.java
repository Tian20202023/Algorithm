import java.util.Scanner;

public class P5710 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        // 判断各个条件
        boolean isEvenAndInRange = (x % 2 == 0) && (x > 4 && x <= 12);
        boolean isEven = (x % 2 == 0);
        boolean isInRange = (x > 4 && x <= 12);

        // 小 A 喜欢既是偶数且大于 4 且不大于 12 的整数
        int likesXiaA = isEvenAndInRange ? 1 : 0;

        // Uim 喜欢至少符合其中一个性质的整数
        int likesUim = (isEven || isInRange) ? 1 : 0;

        // 小 B 喜欢刚好有符合其中一个性质的整数
        int likesXiaoB = (isEven ^ isInRange) ? 1 : 0;

        // 正妹喜欢不符合这两个性质的整数
        int likesZhengMei = (!isEven && !isInRange) ? 1 : 0;

        // 输出结果
        System.out.println(likesXiaA + " " + likesUim + " " + likesXiaoB + " " + likesZhengMei);

        scanner.close();
    }
}
