package test;

import java.util.Scanner;

public class T02 {
	public static void run() {
		Scanner scanner = new Scanner(System.in);
		 boolean run = true;
			while(run) {
				System.out.println("=========================================================");
				System.out.println("1. 100까지 합계 | 2. 100까지 홀수 합계 | 3. 100까지 짝수 합계 | 0. 종료");
				System.out.println("=========================================================");
				System.out.print("선택 > ");
				String menu = scanner.nextLine(); 
	
				if (menu.equals("1")) {
					int sum = 0;
					for(int i=1; i<=100; i=i+1) { //1씩 증가 시켜서 i에 저장
						sum = sum + i; //i에 대한 합계를 sum에 저장
					}
					System.out.println("1. 100까지 합계 : " + sum);
				}
				else if (menu.equals("2")) {
					int sum = 0;
					for(int i=1; i<=100; i=i+2) {
						sum = sum + i;
					}
					System.out.println("2. 100까지 홀수 합계 : " + sum);
				}
				else if (menu.equals("3")) {
					int sum = 0;
					for(int i=0; i<=100; i=i+2) {
						sum = sum + i;
					}
					System.out.println("3. 100까지 짝수 합계 : " + sum);
				}
				else if (menu.equals("0")) {
					run = false;
					System.out.println("프로그램을 종료합니다.");
				}
				else {
					System.out.println("0~3번 메뉴를 선택하세요!");
				}
			}//while
			scanner.close();
	}//method
}//class
