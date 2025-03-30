package org.joonzis.test;
//Grade.java				
//필드 - int kor, int eng, int mat, double average, char grade
//메소드 - Constructor, getAverage : 평균을 리턴, getGrade : 학점을 리턴
//** 학점 : 90이상 A, 80이상 B, 70이상 C, 60이상 D, 60미만 F 

public class Test06_Grade {

	int kor, eng, mat;
	double average;
	char grade;
	
	public Test06_Grade() {}
	public Test06_Grade(int kor, int eng, int mat) {
		this.kor=kor;
		this.eng=eng;
		this.mat=mat;
	}
	double getAverage() {
		return average=(kor+eng+mat)/3.0;
	}
	char getGrade() {
		if(average>=90) {
			return grade='A';
		}else if (average>=80) {
			return grade='B';
		}else if (average>=70) {
			return grade='C';
		}else if (average>=60) {
			return grade='D';
		}else {
			return grade='F';
		}
	}
//	double getAverage() {					전역변수 되도록 건드리지 말기
//		return (kor+eng+mat)/3.0;
//	}
//	char getGrade() {
//		if(getAverage()>=90) {
//			return 'A';
//		}else if (getAverage()>=80) {
//			return 'B';
//		}else if (getAverage()>=70) {
//			return 'C';
//		}else if (getAverage()>=60) {
//			return 'D';
//		}else {
//			return 'F';
//		}
//	}
}
