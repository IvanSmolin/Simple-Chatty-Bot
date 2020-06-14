import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int number = 1;
        int count = 0;
        boolean isEnded = false;

        while (!isEnded) {
            for (int i = 1; i <= number; i++) {
                System.out.print(number + " ");

                if (++count == n) {
                    isEnded = true;
                    break;
                }
            }

            number++;
        }
    }
}