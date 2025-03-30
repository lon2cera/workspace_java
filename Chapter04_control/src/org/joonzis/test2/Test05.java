package org.joonzis.test2;

public class Test05 {
	public static void main(String[] args) {
		
		int a=0;
		for(int i=1;i<101;i++) {
			a=a+i;
			if(i==100) {
				System.out.println(a);
			}
		}
	}
}

//		int b=1;
//		while(b<101) {
//			a=a+b;
//			b++;
//			if(b==101) {
//				System.out.println(a);
//			}
//		}

//		1~100 홀짝 따로 합
//		int sum1=0;
//		int sum2=0;
//		for(int i=1;i<=100;i++) {
//			if(i%2==0) {
//				sum1+=i;
//			}else {
//				sum2+=i;
//			}
//		}
//		System.out.println(sum1);
//		System.out.println(sum2);