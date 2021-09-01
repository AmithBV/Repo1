
public class Practice2 {
	int num1;
	int num2;
	int num3;
	int m = 70;
	public int test() {
		int[] a = { 12, 36, 22, 19, 45 };

		for (int i = 0; i < a.length - 2; i++) {
			for (int j = i + 1; j < a.length - 1; j++) {
				for (int k = i + 2; k < a.length; k++) {

					if (a[i] + a[j] + a[k] == m) {
						num1 = a[i];
						num2 = a[j];
						num3 = a[k];
						System.out.println(m);
						System.out.println("First number picked is " + num1);
						System.out.println("Second number picked is " + num2);
						System.out.println("third number picked is " + num3);
						return 1;
					}
				}
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Practice2 p = new Practice2();
		int returnValue = p.test();
		System.out.println(returnValue);
	}

}
