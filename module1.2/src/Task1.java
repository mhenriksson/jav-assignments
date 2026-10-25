import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = Double.parseDouble(scanner.nextLine());

        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.printf("%.1f °F is %.1f °C%n", fahrenheit, celsius);
    }
}

