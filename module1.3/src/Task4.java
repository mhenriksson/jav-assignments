import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int points = 0;

        while (points < 10) {
            points = 0;
            for (int i = 0; i < 10; i++) {
                int x = (int) (Math.random() * 10) + 1;
                int y = (int) (Math.random() * 10) + 1;
                System.out.print(x + " * " + y + " = ");

                if (scanner.nextInt() == x * y) {
                    System.out.println("correct");
                    points++;
                } else {
                    System.out.println("incorrect");
                }
            }
            System.out.println("Points: " + points + "/10");
        }
        System.out.println("congratulations, you have mastered the multiplication tables!");
    }
}