package org.joonzis.test;

import java.util.Arrays;

//문자열/정수/실수 타입의 배열을 전달하고 데이터 타입을 체크하여
//해당 데이터 타입과 해당 배열의 데이터들을 출력
//class TypeCheckClass - 필드 : T[] arr
//   					  메소드 : String checkType(T[] arr)
//   					  -> 타입에 따라서 "문자형 입니다.", "정수형 입니다" 등등 리턴
//   					  , 
//   					  toString()
//   					  -> 배열 데이터, 데이터 형태 출력
class TypeCheckClass <T> {
	private T[] arr;
	
	@SuppressWarnings("unchecked")
	public TypeCheckClass() {
		arr=(T[])(new Object[3]);
	}
	public String checkType(T[] arr) {
		this.arr=arr;
		if(arr instanceof String[]) {
			return "문자형 입니다.";
		}else if(arr instanceof Integer[]) {
			return "정수형 입니다";
		}else {
			return "실수형 입니다";
		}
	}
	@Override
	public String toString() {
		StringBuffer sb=new StringBuffer();
		sb.append("배열 데이터 : ").append(Arrays.toString(arr)).append("\n").append("형태 : ").append(checkType(arr));
		return sb.toString();
		
	}
	
}
public class Test01 {
	public static void main(String[] args) {
		
		TypeCheckClass<String> tcc1=new TypeCheckClass<String>();
		TypeCheckClass<Integer> tcc2=new TypeCheckClass<Integer>();
		TypeCheckClass<Double> tcc3=new TypeCheckClass<Double>();
		
		String[] arr1= {"a","b","c"};
		Integer[] arr2= {1,2,3};
		Double[] arr3= {1.2,2.3,3.4};
		
		
		tcc1.checkType(arr1);
		tcc2.checkType(arr2);
		tcc3.checkType(arr3);
		
 		
		
		System.out.println(tcc1.toString());
		System.out.println(tcc2.toString());
		System.out.println(tcc3.toString());
		
		
		
		
	}
}
