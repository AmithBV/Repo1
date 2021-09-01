package data;

public class String1 {

	public static void main(String[] args) {
//		String str="abc";
//		char c[]=str.toCharArray();
//		for(int i=c.length-1;i>=0;i--) {
//			System.out.println(c[i]);
//		}

//		int[] a= {1,2,3};
//		int[] b= {1,2,3};
//		int[] c=new int[3];
//		for(int i=0;i<a.length;i++) {
//			c[i]=a[i]+b[i];
//		}
		
		String str="madam";
		StringBuffer sb1=new StringBuffer(str);
		String rev=sb1.reverse().toString();
		System.out.println(rev);
	}

}
