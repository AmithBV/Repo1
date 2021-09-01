package patterns;
import java.util.Iterator;

public class letter {

	public static void main(String[] args) {
		System.out.println("Hi");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 11; j++) {
				if(j==0||j==4||i==0&&j<5||i==2&&j<5||j==6||j==10||j-i==6)
				System.out.print("* ");
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
			
		}
		System.out.println();
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				if(i==0||i==2||j==0||j==4)
//				System.out.print("* ");
//				else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
		}
	}


