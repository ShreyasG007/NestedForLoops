package nested;

public class PatternAlphabet_Two {

	public static void main(String[] args) {
		char i,j;
		
		
		for(i='A';i<='E';i++) {
			for(j='E';j>=i;j--) {
				System.out.print(j+"\t");
			}
			System.out.println();
		}
		
	}

}
