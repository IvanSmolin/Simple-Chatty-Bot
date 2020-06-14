import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int length = 0;

        do {
            number = scanner.nextInt();
            length++;
        } while (number != 0);

        System.out.println(length - 1);
    }
}