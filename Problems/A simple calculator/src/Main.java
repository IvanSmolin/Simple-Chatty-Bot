import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final long firstNumber = scanner.nextLong();
        final String operation = scanner.next();
        final long secondNumber = scanner.nextLong();

        switch (operation) {
            case "+" :
                System.out.println(firstNumber + secondNumber);
                break;
            case "-" :
                System.out.println(firstNumber - secondNumber);
                break;
            case "/" :
                if (secondNumber == 0) {
                    System.out.println("Division by 0!");
                } else {
                    System.out.println(firstNumber / secondNumber);
                }
                break;
            case "*" :
                System.out.println(firstNumber * secondNumber);
                break;
            default:
                System.out.println("Unknown operator");
        }
    }
}