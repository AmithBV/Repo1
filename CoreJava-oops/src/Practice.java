import java.util.Iterator;

public class Practice {
	int num1;
	int num2;
	int m=48;

	public int test() {
	int[] a= {12,36,22,19,45};
	
	for (int i = 0; i < a.length-2; i++) {
		for (int j = i+1; j < a.length-1; j++) {
			if(a[i]+a[j]==m) {
				num1=a[i];
				num2=a[j];
				System.out.println("First number picked is "+num1);
				System.out.println("Second number picked is "+num2);
				return 1;
			}
		}
		
	}
	return -1;
	
		}
	public static void main(String[] args) {
		Practice p=new Practice();
		int returnValue=p.test();
		System.out.println(returnValue);
	}
	


}


