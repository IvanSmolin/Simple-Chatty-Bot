import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        boolean isAsc = true;
        boolean isDesc = true;

        while (true) {
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            if (isAsc && number < n) {
                isAsc = false;
            } else if (isDesc && number > n) {
                isDesc = false;
            }

            n = number;
        }

        System.out.println(isAsc || isDesc);
    }
}