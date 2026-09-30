import java.util.Scanner;

public class Calculator {

	public Calculator() {}

	private float getNumber(String text) {
		try {
			return Float.valueOf(text);
		} catch (Exception e) {
			System.err.println("Please enter a number, defaulting to 0!");
			return 0f;
		}
	}

	private float getInput(Scanner scanner, String text) {
		System.out.print(text);
		String input = scanner.nextLine();

		return getNumber(input);
	}

	public void calculateFromStdIn(Scanner scanner) {
		var firstNumber = getInput(scanner, "Enter the first number: ");

		System.out.print("Enter an operator (+, -, x, /): ");
		char input =
			scanner.nextLine().length() != 0 ? scanner.nextLine().charAt(0) : 'a';

		var secondNumber = getInput(scanner, "Enter the second number: ");

		switch (input) {
			case '+':
				System.err.println(
					String.format(
						"%s %s %s = %s",
						firstNumber,
						input,
						secondNumber,
						firstNumber + secondNumber
					)
				);
				break;
			case '-':
				System.err.println(
					String.format(
						"%s %s %s = %s",
						firstNumber,
						input,
						secondNumber,
						firstNumber - secondNumber
					)
				);
				break;
			case 'x':
				System.err.println(
					String.format(
						"%s %s %s = %s",
						firstNumber,
						input,
						secondNumber,
						firstNumber * secondNumber
					)
				);
				break;
			case '/':
				System.err.println(
					String.format(
						"%s %s %s = %s",
						firstNumber,
						input,
						secondNumber,
						firstNumber / secondNumber
					)
				);
				break;
			default:
				System.err.println("Please enter a valid operator (+, -, x, /)");
				break;
		}
	}
}
