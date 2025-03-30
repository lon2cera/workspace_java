package org.joonzis.ex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex04_HashSet {
	public static void main(String[] args) {
		
		Set<String> set=new HashSet<String>();
		
		set.add("C");
		set.add("Spring");
		set.add("Java");
		set.add("DB");
		set.add("JSP");
		set.add("Wep");
		set.add("Java");	// 중복 저장 시도
		
		Iterator<String> itr=set.iterator();
		while(itr.hasNext()) {
			String str=itr.next();
			if (str.equals("Spring")) {
				itr.remove();
			}
		}
		
//		set.remove("Spring");	// set을 이용한 특정 객체 삭제
//		set.removeAll(set);		// set을 이용한 전체 객체 삭제
		
		System.out.println(set);
		
		
		
		
		
	}
}
