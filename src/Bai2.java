import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        if (a == b && b == c && c == d) {
            System.out.print("Không tồn tại số lớn thứ hai");
            return;
        }

        int max1 = a;
        max1 = b > max1 ? b : max1;
        max1 = c > max1 ? c : max1;
        max1 = d > max1 ? d : max1;

        int max2 = -max1;
        if (max2 < a && a < max1) max2 = a;
        if (max2 < b && b < max1) max2 = b;
        if (max2 < c && c < max1) max2 = c;
        if (max2 < d && d < max1) max2 = d;

        System.out.print("Số lớn thứ hai: " + max2);
    }
}
