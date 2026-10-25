import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give the lenght of the first leg (a): ");
        double a = Double.parseDouble(scanner.nextLine());

        System.out.print("give the length of the second leg (b): ");
        double b = Double.parseDouble(scanner.nextLine());

        double c = Math.sqrt(a * a + b * b);

        System.out.println("The length of the hypotenuse is " + c);
    }
}

