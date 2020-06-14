import java.util.Scanner;

public class Main {

    public static double getTriangleArea(double a, double b, double c) {
        double s = (a + b + c) / 2;

        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static double getRectangleArea(double a, double b) {
        return a * b;
    }

    public static double getCircleArea(double r) {
        return 3.14 * r * r;
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final String type = scanner.nextLine();
        double a;
        double b;
        double c;
        double r;

        switch (type) {
            case "triangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                c = scanner.nextDouble();
                System.out.println(getTriangleArea(a, b, c));
                break;
            case "rectangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                System.out.println(getRectangleArea(a, b));
                break;
            case "circle":
                r = scanner.nextDouble();
                System.out.println(getCircleArea(r));
                break;
            default:
        }
    }
}