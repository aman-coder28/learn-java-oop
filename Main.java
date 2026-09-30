import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Calculator Calc = new Calculator();

		Scanner scanner = new Scanner(System.in);

		Calc.calculateFromStdIn(scanner);
	}

	static String cap(String text) {
		var first = text.substring(0, 1).toUpperCase();

		return first + text.substring(1, text.length());
	}

	static int power(int x, int y) {
		if (y <= 1) {
			return x;
		}

		return x * power(x, y - 1);
	}
}
