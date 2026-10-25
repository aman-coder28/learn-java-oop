import java.util.Scanner;

public class coefficients {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter coefficients a, b, and c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();

		if (a == 0) {
			System.out.println("The coefficient a must not be zero for a quadratic equation.");
			input.close();
			return;
		}

		double discriminant = b * b - 4 * a * c;

		if (discriminant >= 0) {
			double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
			double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
			System.out.println("Root 1: " + root1);
			System.out.println("Root 2: " + root2);
		} else {
			double realPart = -b / (2 * a);
			double imaginaryPart = Math.sqrt(-discriminant) / Math.abs(2 * a);
			System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
			System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
		}

		input.close();
	}
}
