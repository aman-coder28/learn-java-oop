import java.util.Scanner;

public class Compare {
    static float getNumber(String text) {
        try {
            return Float.valueOf(text);
        } catch (Exception e) {
            System.err.println("Please enter a number, defaulting to 0!");
            
            return 0f;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double firstNumber = getNumber(scanner.nextLine());

        System.out.print("Enter the second number: ");
        double secondNumber = getNumber(scanner.nextLine());

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
