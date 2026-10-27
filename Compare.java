import java.util.Scanner;

public class Compare {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double firstNumber = scanner.hasNextDouble() ? scanner.nextDouble() : 0;

        System.out.print("Enter the second number: ");
        double secondNumber = scanner.hasNextDouble() ? scanner.nextDouble() : 0;

        if (firstNumber > secondNumber) {
            System.out.println(firstNumber + " is greater than " + secondNumber);
        } else if (firstNumber < secondNumber) {
            System.out.println(firstNumber + " is less than " + secondNumber);
        } else {
            System.out.println("The numbers are equal");
        }

        scanner.close();
    }
}
