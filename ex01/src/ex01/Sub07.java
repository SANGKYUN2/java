package ex01;

import java.util.Scanner;

public class Sub07 {
	public static void run() {
		Scanner scan = new Scanner(System.in);
		boolean run = true; //while은 run이 ture일때 무한 반복
		while(run) {
			System.out.println("=========================================================");
			System.out.println("1. 100까지 합계 | 2. 100까지 홀수 합계 | 3. 100까지 짝수 합계 | 0. 종료");
			System.out.println("=========================================================");
			System.out.print("선택 > ");
			String menu = scan.nextLine();
			
			switch(menu) {
			case "1":
				int sum = 0;
				for(int i=1; i<=100; i=i+1) { //1씩 증가 시켜서 i에 저장
					sum = sum + i; //i에 대한 합계를 sum에 저장
				}
				System.out.println("1. 100까지 합계 : " + sum);
				break;
				
			case "2":
				sum = 0;
				for(int i=1; i<=100; i=i+2) {
					sum = sum + i;
				}
				System.out.println("2. 100까지 홀수 합계 : " + sum);
				break;
				
			case "3":
				sum = 0;
				for(int i=0; i<=100; i=i+2) {
					sum = sum + i;
				}
				System.out.println("3. 100까지 짝수 합계 : " + sum);
				break;
				
			case "0":
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
				
			default :
				System.out.println("0~3번 메뉴를 선택하세요!");
			
			
			}//switch
		}//while
	}//method
}//class
