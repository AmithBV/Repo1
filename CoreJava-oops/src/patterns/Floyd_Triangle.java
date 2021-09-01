package patterns;

public class Floyd_Triangle {

	public static void main(String[] args) {
		int line=5;
		int space=0;
		int star=1;
		for (int i = 0; i < line; i++) {
			
		
		for (int j = 0; j < space; j++) {
		System.out.print(" ");	
		}
		for (int k = 0; k < star; k++) {
			System.out.print("* ");
		}
		System.out.println();
		star++;
		}
	}

}
