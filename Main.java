
import java.util.Scanner;

public class Main {

	public static float getNumber(String text) {
		try {
			return Float.parseFloat(text);
		} catch (NumberFormatException e) {
			System.err.println("Please enter a number, defaulting to 0!");

			return 0f;
		}
	}

	public static float getInput(Scanner scanner, String text) {
		System.out.print(text);
		String input = scanner.nextLine();

		return getNumber(input);
	}

	public static void perform() {
		Scanner scanner = new Scanner(System.in);

		float firstNumber = getInput(scanner, "Enter the first number: ");
		float secondNumber = getInput(scanner, "Enter the second number: ");

		System.out.println(
				String.format(
						"%s + %s = %s",
						firstNumber,
						secondNumber,
						(firstNumber + secondNumber)

				));

		System.out.println(
				String.format(
						"%s - %s = %s",
						firstNumber,
						secondNumber,
						(firstNumber - secondNumber)));

		System.out.println(
				String.format(
						"%s * %s = %s",
						firstNumber,
						secondNumber,
						(firstNumber * secondNumber)));

		System.out.println(
				String.format(
						"%s / %s = %s",
						firstNumber,
						secondNumber,
						(firstNumber / secondNumber)));
	}

	public static void main(String args[]) {
		perform();
	}
}
