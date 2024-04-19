package am;

import java.util.Scanner;

public class Sub03 {
	public static void run() {
		System.out.println("주소 관리");
		Scanner s = new Scanner(System.in);
		String[] names = new String[100];
		String[] jusos = new String[100];
		String[] phones = new String[100];
		int count = 0;
		
		boolean run = true;
		while (run) {
			System.out.println("╭─────────────────────ฅ^•ﻌ•^ฅ─────────────────────╮");
			System.out.println("\t1. 주소 등록 | 2. 주소 현황 | 0. 프로그램 종료       ");
			System.out.println("╰─────────────────────ฅ^•ﻌ•^ฅ─────────────────────╯");
			System.out.print("선택 ➤ ");
			String menu = s.nextLine();
			
			switch (menu) {
			
			case "1" :
				while(true) {
					System.out.print("이름 ➤ ");
					String name=s.nextLine();
					if(name=="") {
						System.out.println("입력을 종료합니다.");
						break;
					}
					System.out.print("전화 ➤ ");
					String phone=s.nextLine();
					if(phone=="") {
						System.out.println("입력을 종료합니다.");
						break;
					}
					System.out.print("주소 ➤ ");
					String juso=s.nextLine();
					if(juso=="") {
						System.out.println("입력을 종료합니다.");
						break;
					}
					names[count] = name;
					phones[count] = phone;
					jusos[count] = juso;
					System.out.println(name + " 주소가 등록되었습니다.");
					count++;
				}//while
				
				break;
				
				
			case "2" :
				if(count==0) {
					System.out.println("등록된 주소가 없습니다.");
				}
				else {
					for(int i=0; i<count; i++) {
						System.out.printf("이름 : %s 주소 : %s 전화 : %s\n", names[i], jusos[i], phones[i]);
					}
					System.out.println("\n" + count + "명이 존재합니다.");
				}
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