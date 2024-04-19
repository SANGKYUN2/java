package ex01;

import java.util.Scanner;

public class Sub10 {
	public static void run() {
		
		Scanner scan = new Scanner(System.in);
		boolean run = true;

		String[] names = new String[100]; 
		int[] prices = new int[100];
		int[] qnts = new int[100];
		int count = 0;
		
		
		
		while(run) {
			System.out.println("===========================");
			System.out.println("1. 매출등록 | 2. 매출현황 | 0. 종료");
			System.out.println("===========================");
			System.out.print("선택 > ");
			String menu = scan.nextLine();
			
			switch(menu) {
			case "1" :
				System.out.print("이름 > ");
				String name = scan.nextLine();
				names[count] = name;
				
				System.out.print("단가 > ");
				int price = Integer.parseInt(scan.nextLine());
				prices[count] = price;
				
				System.out.print("수량 > ");
				int qnt = Integer.parseInt(scan.nextLine());
				qnts[count] = qnt;
				System.out.println("등록 완료");
				count = count + 1;

				break;
				
			case "2" :
				if (count == 0) {
					System.out.println("등록된 상품이 없습니다.");
				}
				else {
					for(int i=0; i<count; i++) {
						int sum = prices[i] * qnts[i];
						System.out.printf("%s\t%d만원\t%d개\t%d만원\n", names[i], prices[i], qnts[i], sum);
						System.out.println("===========================");
					}
				}
				break;
				
			case "0" :
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
			
			default :
				System.out.println("0~2번 메뉴를 선택하세요!");
		
		}//switch
		
		}//while

	}//메소드
}//클래스
