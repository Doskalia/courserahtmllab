import java.util.Scanner;

    public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        if (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            if (scanner.hasNextInt()) {
                int b = scanner.nextInt();
                System.out.println(a + b);
            } else {
                System.out.println();
            }
        } else {
            System.out.println();
        }
    }
}
