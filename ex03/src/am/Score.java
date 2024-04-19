package am;

public class Score {
	
	//필드(속성)
	String name;
	int kor;
	int eng;
	int mat;
	
	//생성자
	public Score() {
		super();
		// TODO Auto-generated constructor stub
	}	
	
	public Score(String name, int kor, int eng, int mat) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	//메서드
	public int total() { //합계
		int total = kor + eng + mat;
		return total;
	}
	
	public double avg() { //평균
		int total = kor + eng + mat;
		double avg = total/3;
		return avg;
		//return (kor + eng + mat)/3.;
	}
	
	public void print() {
		System.out.printf("이름 : %s\t국어 성적 : %d\t영어 성적 : %d\t수학 성적 : %d\t성적 합계 : %d\t평균 : %.2f\t학점 : %s\n", 
				name, kor, eng, mat, total(), avg(), grade());
	}
	
	public String grade() {
		String grade = "F";
		if(avg()>=90) {
			if(avg()>=95) {
				grade="A+";
			}
			else {
				grade="A0";
			}
		}
		else if(avg()>=80) {
			if(avg()>=85) {
				grade="B+";
			}
			else {
				grade="B0";
			}
		}
		else if(avg()>=70) {
			if(avg()>=75) {
				grade="C+";
			}
			else {
				grade="C0";
			}
		}	
		else if(avg()>=60) {
			if(avg()>=65) {
				grade="D+";
			}
			else {
				grade="D0";
			}
		}
		else {
			grade="F";
		}
		return grade;
	}


}
