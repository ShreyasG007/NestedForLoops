package nested;

public class Pattern_Twelve {
	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				if(i%2==0) {
					System.out.print("0\t");
				}
				else {
					System.out.print("1\t");
				}
				
			}
			System.out.println();
		}
	}
}
