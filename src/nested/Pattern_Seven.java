package nested;

public class Pattern_Seven {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(i+"\t");
			}
			System.out.println("");
		}
	}
}
