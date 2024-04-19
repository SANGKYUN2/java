package ex01;

public class Sub06 {
	public static void run() {
		//반복문
		
		//반복문(for)
		int sum = 0;
		
		for(int i=1; i<=100; i=i+1) { //1씩 증가 시켜서 i에 저장
			sum = sum + i; //i에 대한 합계를 sum에 저장
		}
		
		System.out.println("1부터 100까지 더한 값은 : " + sum);
		
		sum = 0;
		for(int i=1; i<=100; i=i+2) {
			sum = sum + i;
		}
		
		System.out.println("1부터 100까지 홀수를 더한 값은 : " + sum);
		
		sum = 0;
		for(int i=0; i<=100; i=i+2) {
			sum = sum + i;
		}
		
		System.out.println("1부터 100까지 짝수를 더한 값은 : " + sum);
			
		//반복문(while)
		int i = 1;
		sum = 0;

		while(i<=100) {
			sum = sum + i;
			i = i+1;
		}
		
		System.out.println("1부터 100까지 더한 값은 : " + sum);
		
		i = 1;
		sum = 0;
		
		while(i<=100) {
			sum = sum + i;
			i = i + 2;
		}
		
		System.out.println("1부터 100까지 홀수를 더한 값은 : " + sum);
		
		i = 0;
		sum = 0;
		
		while(i<=100) {
			sum = sum + i;
			i = i + 2;
		}
		
		System.out.println("1부터 100까지 짝수를 더한 값은 : " + sum);
		
	}

}
