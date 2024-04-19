package am;

import java.util.Scanner;

public class Sub02 {
	public static void run() {
		Scanner scan = new Scanner(System.in);
		System.out.println("매출현황");
		boolean run = true;
		
		String[] names = new String[100];
		int[] prices = new int[100];
		int[] qnts = new int[100];
		names[0] = "냉장고";
		prices[0] = 350;
		qnts[0] = 15;
		names[1] = "세탁기";
		prices[1] = 250;
		qnts[1] = 17;
		int count = 2;
		
		
		
		while (run) {
			System.out.println("╭─────────────────────ฅ^•ﻌ•^ฅ─────────────────────╮");
			System.out.println("\t1 매출 등록 | 2. 매출 현황 | 0. 프로그램 종료 ");
			System.out.println("╰─────────────────────ฅ^•ﻌ•^ฅ─────────────────────╯");
			System.out.print("선택 ➤ ");
			String menu = scan.nextLine();
			
			switch (menu) {
			
			case "1" :
				System.out.print("상품 이름 ➤ ");
				String name = scan.nextLine();
				System.out.print("상품 단가 ➤ ");
				String price = scan.nextLine();
				System.out.print("판매 수량 ➤ ");
				String qnt = scan.nextLine();
				
				names[count] = name;
				prices[count] = Integer.parseInt(price);
				qnts[count] = Integer.parseInt(qnt);
				System.out.println(name + "상품이 등록되었습니다.");
				count = count + 1;
				
				
				break;
				
			case "2" :
				int tot_sum=0;
				int tot_qnt=0;
				for(int i=0; i<count; i++) {
					int sum = prices[i] * qnts[i];
					System.out.printf("| 제품명 : %s | 상품 가격 : %d만원 | 수량 : %d개 | 총 가격 : %,d만원 | \n", 
							names[i], prices[i], qnts[i], sum);
					
					tot_sum = tot_sum + sum;
					tot_qnt = tot_qnt + qnts[i];
				}
				System.out.println("╭──────────────────ฅ^•ﻌ•^ฅ──────────────╮");
				System.out.printf(" 총 수량 : %d개   | 총 판매액 : %,d만원  | \n", tot_qnt, tot_sum);
				System.out.println("╰──────────────────ฅ^•ﻌ•^ฅ──────────────╯");
				System.out.println(count + "개 상품이 등록되었습니다.");

				break;
				
			case "0" :
				run = false;
				break;
				
				default :
					System.out.println("0~2번 메뉴를 선택하세요!");
					break;
				
				
			}//switch
		}//while
		System.out.println("프로그램을 종료합니다.");
	}//메소드

}//클래스
