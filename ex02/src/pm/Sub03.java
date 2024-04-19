package pm;

import java.util.ArrayList;
import java.util.Scanner;

public class Sub03 {
	public static void run() {
		boolean run = true;
		Scanner s = new Scanner(System.in);
		ArrayList<String> jusos = new ArrayList<>();
		ArrayList<String> names = new ArrayList<>();
		names.add("라이언");
		jusos.add("카카오 프렌즈");
		names.add("춘식이");
		jusos.add("고구마 상자");
		
		while (run) {
			System.out.println("\n╭────────────────────────ฅ^•ﻌ•^ฅ────────────────────────╮");
			System.out.println(" 1. 주소 등록 | 2. 이름 검색 | 3. 주소 목록 | 4. 주소 삭제 | 0. 종료");
			System.out.println("╰────────────────────────ฅ^•ﻌ•^ฅ────────────────────────╯");
			System.out.print("선택 ➤ ");
			String menu = s.nextLine();
			
			switch (menu) {
			
			case "1" : //주소 등록
				System.out.print("이름 ➤ ");
				names.add(s.nextLine());
				System.out.print("주소 ➤ ");
				jusos.add(s.nextLine());
				System.out.println("이름과 주소가 입력되었습니다!");
				break;
				
			case "2" : //이름 검색
				while (true) {
					System.out.print("\n이름을 검색하세요 : ");
					String sname = s.nextLine();
					if(sname=="") {
						System.out.println("이름 검색을 종료합니다.");
						break;
					}
					boolean find = false;
					for(int i=0; i<names.size(); i++) {
						String name = names.get(i);
						if (sname.equals(name)) {
							System.out.println(name + "님은 " + jusos.get(i) + "에 거주하고 있습니다.");
							find = true;
						}
					}
					if(!find) {
						System.out.println(sname + "님이 존재하지 않습니다.");
					}
				}
				break;
				
			case "3" : //주소목록
				for(int i=0; i<names.size(); i++) {
					System.out.printf("이름 : %s | 주소 : %s\n", names.get(i), jusos.get(i));
				}
				System.out.println(jusos.size() + "명이 존재합니다.");
				break;
				
			case "4" : //주소 삭제
	
				
				while (true) {
					System.out.print("\n어떤 사람의 주소를 삭제하시겠습니까?? ");
					String rname = s.nextLine();
					boolean find = false;
					for(int i=0; i<names.size(); i++) {
						String name = names.get(i);
						if (rname.equals(name)) {
							System.out.println(name + "님의 주소는 " + jusos.get(i) + "입니다.");
							find = true;
							System.out.print("삭제하시겠습니까?? (예/아니요) ");
							String answer = s.nextLine();
							if (answer.equals("예")) {
								names.remove(i);
								jusos.remove(i);
								System.out.println(name + "님의 주소를 삭제하셨습니다.");
								if (answer.equals("아니요")) {
									break;
								}
							}
							else {
								System.out.println("삭제를 취소하였습니다.");
							}
						}
					}
					if(!find) {
						System.out.println(rname + "님이 존재하지 않습니다.");
					}

				}
		
			case "0" : //종료
				run = false;
				System.out.println("\n프로그램을 종료합니다.\n");
				break;
				
			default :
				System.out.println("0~4번 메뉴를 선택하세요.\n");
				break;
			}
		}
	}
}
