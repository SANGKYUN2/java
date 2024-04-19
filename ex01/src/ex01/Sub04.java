package ex01;

public class Sub04 {
	public static void run () {
		
		//산술 연산자
		int num1 = 11;
		int num2 = 3;
		
		int sum = num1 + num2; //더하기 연산자
		System.out.println(num1 + " + " + num2 + " = " + sum);
		
		int sub = num1 - num2; //빼기 연산자
		System.out.println(num1 + " - " + num2 + " = " + sub);
		
		int mul = num1 * num2; //곱하기 연산자
		System.out.println(num1 + " * " + num2 + " = " + mul);
		
		float div = (float)num1 / num2; //나누기 연산자, 정수랑 정수를 나눌때 정수가 나온다. 그럴때는 float or double 을 사용해서 한쪽을 실수로 만든다.
		System.out.println(num1 + " / " + num2 + " = " + div);
		
		//관계 연산자
		boolean result = num1 > num2;  //> 왼쪽이 오른쪽 보다 크다
		System.out.println(num1 + "이 " + num2 + "보다 크다. : " + result);
		
		result = num1 < num2;  //< 왼쪽이 오른쪽 보다 작다
		System.out.println(num1 + "이 " + num2 + "보다 작다. : " + result);
		
		result = num1 == num2;  //== 왼쪽과 오른쪽은 같다
		System.out.println(num1 + "과 " + num2 + "은 같다. : " + result);
		
		result = num1 != num2; //!= 왼쪽과 오른쪽은 같지 않다
		System.out.println(num1 + "과 " + num2 + "은 같지않다. : " + result);
		
		//논리 연산자(and:&&, or:||, not:!)
		boolean b1 = true;
		boolean b2 = false;
		
		result = b1 && b2;  //and는 두개가 true 일때 true
		System.out.println(result);
		
		result = b1 || b2;  //or는 두개가 false 일때 flase
		System.out.println(result);
		
		result = !b1;  //not은 true 이면 false, false 이면 true
		System.out.println(result);
		
		
		
	}


}
