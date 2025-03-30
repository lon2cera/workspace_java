package org.joonzis.test;

//Score 클래스 					필드 : int kor, eng, mat
//							메소드 : Constructor, toString(), equals()
//Score 인스턴스를 2개 생성하고, 동등 비교(세과목이 모두 같으면 동등) 결과 출력
//각 인스턴스 정보는 toString 메소드를 통해 출력
class Score{
	private int kor, eng, mat;
	
	public Score() {}
	public Score(int kor, int eng, int mat) {
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	@Override
	public String toString() {
		return "kor : "+kor+", eng : "+eng+", mat : "+mat;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj != null&&obj instanceof Score) {
			Score another=(Score)obj;
			return kor==another.kor&&eng==another.eng&&mat==another.mat;
		}else {
			return false;
		}
	}
}
public class Test01 {
	public static void main(String[] args) {
		
		Score score1=new Score(70,80,90);
		Score score2=new Score(70,80,90);
		
		if(score1.equals(score2)) {
			System.out.println("동등");
		}
		System.out.println("score1 : "+score1);
		System.out.println("score2 : "+score2);
		
		
		
	}
}
