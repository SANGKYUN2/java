package pm;

import java.util.Scanner;

public class test {
	
	public static void run() {
		Scanner s = new Scanner(System.in);
		

		

		boolean run = true;
		
		while(run) {
			System.out.println("╭─────────────────────ฅ^•ﻌ•^ฅ─────────────────────╮");
			System.out.println("\t1 매출 등록 | 2. 매출 현황 | 0. 프로그램 종료 ");
			System.out.println("╰─────────────────────ฅ^•ﻌ•^ฅ─────────────────────╯");
			System.out.print("선택 ➤ ");
			String menu = s.nextLine();
			
			switch(menu) {
			
			case "1" :
				break;
				
			case "2" :
				break;
				
			case "0" :
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
				
			default :
				System.out.println("0~2번 메뉴를 선택하세요.");
				break;
			}
		
		}
		
	}

}
