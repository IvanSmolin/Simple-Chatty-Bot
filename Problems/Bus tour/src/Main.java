import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = scanner.nextInt();
        int bridges = scanner.nextInt();

        for (int i = 1; i <= bridges; i++) {
            int bridge = scanner.nextInt();

            if (bridge <= height) {
                System.out.println("Will crash on bridge " + i);
                return;
            }
        }

        System.out.println("Will not crash");
    }
}