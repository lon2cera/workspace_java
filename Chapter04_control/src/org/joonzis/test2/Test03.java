package org.joonzis.test2;

public class Test03 {
	public static void main(String[] args) {
		
		int a=2;
		for(int i=1;i<10;i++) {
			System.out.println(a+"x"+i+"="+a*i);
			if(i==9) {
				a=a+1;
				i=0;
			}
			if(a==10) {
				break;
			}
		}
		
	}
}

//		for(int i=2;i<10;i++) {
//			for(int a=1;a<10;a++) {
//				System.out.println(i+"x"+a+"="+a*i);
//			}
//		}


//		int b=1;
//		while(a<10) {
//			System.out.println(a+"x"+b+"="+a*b);
//			b++;
//			if(b==10) {
//				b=1; a=a+1;
//			}
//		}