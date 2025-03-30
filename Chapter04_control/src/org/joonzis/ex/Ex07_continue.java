package org.joonzis.ex;

public class Ex07_continue {
	public static void main(String[] args) {
		
		// while문을 이용해서 1~10까지 출력(3의 배수는 제외)
		
		int num=0;
		while(num<10) {
			num++;
			if(num%3==0) {
				continue;
			}
			System.out.println(num);
		}

		
		for(int i=1;i<11;i++) {
			if(i%3==0) {
			continue;
			}
			System.out.println(i);
		}
	}
}
