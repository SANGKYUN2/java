package pm;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("2024-04-09 자바 수업");
		Scanner s = new Scanner(System.in);
		boolean run = true;
		while (run) {
			System.out.println("╭───────────────/ᐠ_ ꞈ _ᐟ\\NYA───────────────╮");
			System.out.println(" 1. 이름 | 2. 숫자 | 3. 주소 | 0. 프로그램 종료 ");
			System.out.println("╰───────────────/ᐠ_ ꞈ _ᐟ\\NYA───────────────╯");
			System.out.print("선택 ➤ ");

			String menu = s.nextLine();
			switch (menu) {
			
			case "1" :
				Sub01.run();
				break;
				
				
			case "2" :
				Sub02.run();
				break;
				
			case "3" :
				Sub03.run();
				break;
				
			case "4" :
				test.run();
				break;

			case "0" :
				run = false;
				break;
				
			default :
				System.out.println("0~2번 메뉴를 선택하세요!");
				break;
			}
		

		}
		System.out.println("프로그램을 종료합니다.");
	}


}