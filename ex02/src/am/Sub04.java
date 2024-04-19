package am;

import java.util.Scanner;

public class Sub04 {
	
	public static void run() {
		
		Scanner s = new Scanner(System.in);
		
		boolean run = true;
		System.out.println("은행 입출금 관리 프로그램");
		
		String[] accountNumbers = new String[100];
		String[] names = new String[100];
		String[] pwds = new String[100];
		int[] balances = new int[100];
		int count = 0;
	
		
		
		while (run) {
			System.out.println("1. 계좌계설");
			System.out.println("2. 전체 계좌 조회");
			System.out.println("0. 종료");
			System.out.print("항목을 선택하세요.");
			
			String menu = s.nextLine();

			switch (menu) {
			
			
			case "1" :
				System.out.print("계좌번호 ➤ ");
				String accountNumber = s.nextLine();
				accountNumbers[count] = accountNumber;
				
				System.out.print("이름 ➤ ");
				String name = s.nextLine();
				names[count] = name;
				
				System.out.print("비밀번호 ➤ ");
				String pwd = s.nextLine();
				pwds[count] = pwd;
				
				System.out.print("잔고 ➤ ");
				String balance = s.nextLine();
				balances[count] = Integer.parseInt(balance);
				System.out.println(name + "님의 계좌가 등록되었습니다.\n");
				count = count + 1;
			
				break;
				
			case "2" :
				for (int i=0; i<count; i++) {
					
					System.out.printf("계좌번호 : %s 이름 : %s 비밀번호 : %s 잔고 : %d원\n", 
							accountNumbers[i], names[i], pwds[i], balances[i]);
				}
				break;

			case "0" :
				run = false;
				break;
				
			default :
				System.out.println("0~2번 메뉴를 고르세요.");
				break;
				
			}//switch

		}//while

	}//메소드
	
}//클래스
