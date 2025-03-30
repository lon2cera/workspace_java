package org.joonzis.test;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

//로또 & 빙고 (빙고가 어려우면 로또부터 해보기)
//Set을 이용하여 5 X 5 Bingo 배열을 생성하시오. (1 ~ 25)
//Set에 랜덤 생성 -> Bingo 2차원 배열에 저장 
public class Test02 {
	public static void main(String[] args) {
		
		Random ran=new Random();
		System.out.println("<BINGO>");
		Set<Integer> set = new LinkedHashSet<Integer>();
		
		while(set.size() < 25) {
			set.add(ran.nextInt(25)+1);
		}
		
		int[][] bingo = new int[5][5];
		
		Iterator<Integer> itr = set.iterator();
		
		for (int i = 0; i < bingo.length; i++) {
			for (int j = 0; j < bingo[i].length; j++) {
				bingo[i][j] = itr.next();
				System.out.print(bingo[i][j] + "\t");
			}
			System.out.println();
		}
	
	
		
	}	
}
