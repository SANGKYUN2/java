package am;

import java.util.ArrayList;
import java.util.Scanner;

public class Sub02 {
	public static void run() {
		
		boolean run = true;
		Scanner s = new Scanner(System.in);
		ArrayList<Juso> jusos = new ArrayList<>();
		Juso juso1 = new Juso("라이언", "010-8520-4560", "카카오 프렌즈");
		jusos.add(juso1);
		juso1 = new Juso("춘식이", "010-1310-7978", "고구마 상자");
		jusos.add(juso1);
		juso1 = new Juso("어피치", "010-7531-9513", "복숭아 상자");
		jusos.add(juso1);
		
		
		while(run) {
			
			System.out.println("\nㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("| 1. 주소등록 | 2. 주소조회 | 3. 주소목록 | 4. 주소삭제 | 0. 종료 |");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.print("메뉴를 선택하세요. -> ");
			String menu = s.nextLine();
			
			switch(menu) {
			
			case "1" : //1. 주소 등록
				Juso juso = new Juso();
				System.out.print("\n1이름을 입력하세요. -> ");
				String name = s.nextLine();
				juso.setName(name);
				
				System.out.print("번호를 입력하세요. -> ");
				String phone = s.nextLine();
				juso.setPhone(phone);
				
				System.out.print("주소를 입력하세요. -> ");
				String address = s.nextLine();
				juso.setAddress(address);
				jusos.add(juso);
				
				System.out.print(juso.toString() + "\n" + "등록 완료 !\n");
				System.out.println("등록된 주소 데이터 : " + jusos.size());
				break;
				
			case "2" : //2. 주소 조회
				while(true) {
					System.out.print("\n검색할 이름을 입력하세요. -> ");
					String sname = s.nextLine();
					if(sname=="") break;
					boolean find = false;
					for(Juso j:jusos) {
						if(sname.equals(j.getName())) {
							System.out.println("주소 : " + j.getAddress());
							System.out.println("번호 : " + j.getPhone());
							find = true;
						}//if
	
					}//for
					if(find==false) 					
						System.out.println(sname + "님은 존재하지 않습니다.");
				}//while
				break;
			case "3" : //3. 주소 목록
				for(Juso j:jusos) {
					System.out.printf("\n이름 : %s\n번호 : %s\n주소 : %s\n", j.getName(), j.getPhone(), j.getAddress());
				}
				System.out.println("\n등록된 주소 데이터 : " + jusos.size());
				
				break;
				
			case "4" : //4. 주소 삭제
				System.out.print("\n삭제할 이름을 입력하세요. -> ");
				String rname = s.nextLine();
				boolean delete = false;
				for(Juso j:jusos) {
					if(rname.equals(j.getName())) {
						System.out.println("주소 : " + j.getAddress());
						System.out.println("번호 : " + j.getPhone());
						delete = true;
						System.out.print("삭제하시겠습니까?? (예/아니요) -> ");
						String answer = s.nextLine();
						if(answer.equals("예")) {
							jusos.remove(j);
							System.out.println(rname + "님의 데이터가 삭제 되었습니다!");
							break;
						}
						else {
							System.out.println(rname + "님의 데이터가 삭제 취소 되었습니다!");
						}
					}
				}
				if(delete==false)
					System.out.println(rname + "님은 존재하지 않습니다.");
				break;

			case "0" :
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
				
			default :
				System.out.println("0~4번 메뉴를 선택하세요.");
				break;
				
			}//switch
			
		}//while

	}//run 
}//class
