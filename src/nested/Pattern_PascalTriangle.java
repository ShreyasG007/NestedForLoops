package nested;

public class Pattern_PascalTriangle {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			int number = 1;

			
			for (int j = 0; j < 5 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print(number + " ");
				number = number * (i - j) / (j + 1);
			}
			System.out.println();
		}
	}
}
