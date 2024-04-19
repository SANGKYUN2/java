package am;

import java.util.ArrayList;

public class Sub02 {
	public static void run() {
//		System.out.println("\n클래스란?");
//		
//		System.out.println("\n-----------s1 객체-----------");
//		Student s1 = new Student(); //Student(클래스) s1(객체) Student()(생성자)
//		s1.no = "103";
//		s1.name = "라이언";
//		s1.juso = "카카오 프렌즈";
//		s1.phone = "010-1472-5836";
//		s1.print();
//		
//		System.out.println("\n-----------s2 객체-----------");
//		Student s2 = new Student("123", "춘식이"); //생성자2
//		s2.juso = "고구마 상자";
//		s2.phone = "010-4862-7913";
//		s2.print();
//		
//		System.out.println("\n-----------s3 객체-----------");
//		Student s3 = new Student("753", "어피치", "복숭아", "010-4931-7812"); //생성자3
//		s3.print();
//		
//		System.out.println("\n-----------s4 객체-----------");
//		Score s4 = new Score("춘식이", 98, 75, 45); //생성자3
//		s4.print();
//	}
//
//}
		
		ArrayList<Student> students = new ArrayList<>();
		
		students.add(new Student("100", "라이언", "인천", "010-1111-1111"));
		students.add(new Student("100", "라이언", "인천", "010-1111-1111"));
		students.add(new Student("100", "라이언", "인천", "010-1111-1111"));
		
		for(Student s:students) { //scores에 있는걸 s에 넣는것
			s.print();
		}
		
		System.out.println("");
		for(int i =0; i<students.size(); i++) {
			Student s = students.get(i);
			s.print();
		}
		
	}

}

