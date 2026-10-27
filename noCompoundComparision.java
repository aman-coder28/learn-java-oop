public class noCompoundComparision {
	public static void main(String[] args) {
		final int grade = 55;
		int second = 0;

		if (grade <= 59) {
			if (grade >= 50) {
				second += 1;
			}
		} 

		int num = 75;
		int sum = 0;
        
		if (num > 100) {
			System.out.println("Out of Range");
		} else if (num < 0) {
			System.out.println("Out of Range");
		} else {
			sum += num;
		}

		int M = 65;
		int N = 70;
		int T = 150;
		int y;
		if (M > 60) {
			if (N > 60) {
				y = 1;
			} else {
				if (T > 200) {
					y = 1;
				} else {
					y = 0;
				}
			}
		} else {
			if (T > 200) {
				y = 1;
			} else {
				y = 0;
			}
		}
	}
}
