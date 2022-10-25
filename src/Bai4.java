import java.util.Scanner;
import java.lang.Math;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        while (n <= 0) {
            n = scanner.nextInt();
        }

        int dem = 0;
        while (n > 0) {
            int so = n % 10;
            int can = (int)Math.sqrt(so);
            if (can * can == so) {
                dem += 1;
                System.out.print(so + " ");
            }

            n /= 10;
        }

        if (dem == 0) {
            System.out.print("No");
        }
    }
}
