import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Set<String> imiona = new HashSet<>();

        System.out.println("Wpisuj imiona (znak \" - \" konczy wpisywanie)");
        String name = scan.nextLine();

        while (!name.equals("-")) {
            name = scan.nextLine();
            imiona.add(name);
            if (name.equals("-")) {
                System.out.println("Wpisano znak \" - \", zakonczon wprowadzanie imion");
            }
        }
        System.out.println("-------------------------------------------");
        System.out.println("Unikalne imiona wprowadzone do bazy: ");
        for (String x : imiona) {
            System.out.println(x);
        }
    }
}