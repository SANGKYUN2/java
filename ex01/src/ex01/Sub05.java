package ex01;

public class Sub05 {
	public static void run() {
		//제어문
		
		//제어문(if)
		int score = 77;
		String grade = "";
		
		if (score >= 90) {
			if (score >= 95) {
				grade = "A+";
			}
			else {
				grade = "A0";
			}
		}
		else if (score >= 80) {
			if (score >= 85) {
				grade = "B+";
			}
			else {
				grade = "B0";
			}
		}
		else if (score >= 70) {
			if (score >= 75) {
				grade = "C+";
			}
			else {
				grade = "C0";
			}
		}		
		else if (score >= 60) {
			if (score >= 65) {
				grade = "D+";
			}
			else {
				grade = "D0";
			}
		}
		else {
			grade = "F";
			
		}
		
		System.out.println(score + "의 학점 : " + grade);
		
		
		//제어문(switch)
		int time = 21;
		switch(time) {
		case 6:
			System.out.println("기상");
			break;
		case 9:
			System.out.println("출근");
			break;
		case 12:
			System.out.println("점심");
			break;
		case 18:
			System.out.println("퇴근");
			break;
		default:
			System.out.println("..........");
		}
		

		
		
	}

}
