package patterns;

public class Pattern_BOX {

	public static void main(String[] args) {
		int line=5;
		int star=5;
		int space=0;
		for (int i = 0; i < line; i++) {
			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < star; k++) {
				System.out.print("* ");
			}
			System.out.println();
			
			
		}

	}

}
