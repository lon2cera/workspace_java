package org.joonzis.test;
//현재 날짜를 StringBuffer, Calendar 클래스를 이용하여
//"2019년 10월 21일 월요일 오후 1시 10분" 과 같은 형식으로 완성하고 출력하시오.
//StringBuffer.append() 이용
//String[] weeks = {"","일","월","화","수","목","금","토"};

import java.util.Calendar;

public class Test07 {
	public static void main(String[] args) {
		
		StringBuffer c=new StringBuffer();
		Calendar cal=Calendar.getInstance();
		String[] weeks = {"","일","월","화","수","목","금","토"};
		
		c.append(cal.get(Calendar.YEAR)+"년 ");
		c.append((cal.get(Calendar.MONTH))+1+"월 ");
		c.append(cal.get(Calendar.DATE)+"일 ");
		c.append(weeks[cal.get(Calendar.DAY_OF_WEEK)]+"요일");
		if(cal.get(Calendar.AM_PM)==1) {
			c.append(" 오후");
		} else {
			c.append(" 오전");
		}
//		c.append((cal.get(Calendar.AM_PM))==1?" 오후":" 오전");
		c.append(cal.get(Calendar.HOUR)+"시 ");
		c.append(cal.get(Calendar.MINUTE)+"분"); 
		
		
		System.out.println(c);
		
		
	}
}
