import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String[] firstNames = {"Mikko", "Nelli", "Hannu", "Leena", "Lumi"};
        String[] lastNames = {"Henkka", "Kylä", "Korhonen"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many names do you want? ");
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            int first = (int) (Math.random() * firstNames.length);
            int last = (int) (Math.random() * lastNames.length);
            System.out.println(firstNames[first] + " " + lastNames[last]);
        }
    }
}