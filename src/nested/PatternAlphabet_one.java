package nested;

public class PatternAlphabet_one {

	public static void main(String[] args) {
		for(char i='A';i <'E';i++) {
			for(char j='A';j<=i;j++) {
				System.out.print(j+"\t");
			}
			System.out.println();
		}

	}

}
