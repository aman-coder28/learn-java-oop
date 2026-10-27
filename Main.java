
import java.util.Scanner;

public class Main {
	public static float getNumber(Scanner scanner, String text) {
		System.out.print(text);

		return scanner.hasNextDouble() ? scanner.nextDouble() : 0;
	}

	public static void Calculate() {
		Scanner scanner = new Scanner(System.in);

		float firstNumber = getNumber(scanner, "Enter the first number: ");
		float secondNumber = getNumber(scanner, "Enter the second number: ");

		System.out.println(
				firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));

		System.out.println(
				firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
		System.out.println(
				firstNumber + " x " + secondNumber + " = " + (firstNumber * secondNumber));
		System.out.println(
				firstNumber + " / " + secondNumber + " = " + (secondNumber != 0 ? firstNumber + secondNumber : 0));
	}

	public static void main(String args[]) {
		perform();
	}
}
