package ex01;

public class Sub03 {
	public static void run() {
		//정수 타입
		int num1 = 10;
		
		//실수 타입
		float num2 = 11.5f;
		double num3 = 12.5;
		
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		System.out.println("num3 = " + num3);
		
		//형변환(정수 -> 실수)
//		num2 = num1; //오른쪽에 있는 값이 왼쪽으로 들어감
//		System.out.println("num2 = " + num2);
	
//		num3 = num1;
//		System.out.println("num3 = " + num3);
	
		//형변환(실수 -> 정수)
		num1 = (int)num2;
		System.out.println("num1 = " + num1);
		
		num1 = (int)num3;
		System.out.println("num1 = " + num1);
		
		
		
		//문자 타입
		char str1 = 'A'; //한글자만 저장 가능 큰따옴표X 작은따옴표O
		String str2 = "홍길동"; //한글자 이상 저장 가능 큰따옴표O 작은따옴표X
		
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);
		
		//논리 타입(boolean)
		boolean bool1 = true; //true or false 만 소문자로 입력 가능
		boolean bool2 = false;
		System.out.println("bool1 = " + bool1);
		System.out.println("bool2 = " + bool2);
		
		
	}

}
