import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter start: ");
        int start = scanner.nextInt();
        System.out.print("Enter end: ");
        int end = scanner.nextInt();

        for (int n = start; n <= end; n++) {
            boolean prime = true;
            if (n < 2) {
                prime = false;
            }
            for (int d = 2; d < n; d++) {
                if (n % d == 0) {
                    prime = false;
                }
            }
            if (prime) {
                System.out.print(n + " ");
            }
        }
        System.out.println();
    }
}