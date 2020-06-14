import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long m = scanner.nextLong();
        int n = 1;
        long fact = 1;

        while (fact <= m) {
            n++;
            fact *= n;
        }

        System.out.println(n);
    }
}