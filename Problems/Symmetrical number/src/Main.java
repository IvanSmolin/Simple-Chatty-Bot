import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int bufNumber = number;
        int result = 0;

        while (bufNumber / 10 != 0 || bufNumber % 10 != 0) {
            result = result * 10 + bufNumber % 10;
            bufNumber /= 10;
        }

        if (number % 10 == 0 && number / 10 == result || number == result) {
            System.out.println(1);
        } else {
            System.out.println(4);
        }
    }
}