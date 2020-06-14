import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double m = scanner.nextInt();
        double p = scanner.nextInt();
        double k = scanner.nextInt();
        int years = 0;

        while (m < k) {
            m += m * p / 100;
            years++;
        }

        System.out.println(years);
    }
}