import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int count = 0;
        double average = 0;

        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) {
                average += i;
                count++;
            }
        }

        System.out.println(average / count);
    }
}