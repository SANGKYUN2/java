package juso;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		JusoDAO dao = new JusoDAO();
		boolean run = true;
		while (run) {
			System.out.println("\n**********************주소관리**********************");
			System.out.println("-------------------------------------------------");
			System.out.println("1. 주소등록 | 2. 주소조회 | 3. 주소목록 | 4. 주소삭제 | 0. 종료");
			System.out.println("-------------------------------------------------");
			System.out.print("메뉴를 선택하세요. => ");
			String menu = s.nextLine();
		
			switch (menu) {
			
			case "1" : //주소등록 출력
				Juso ju = new Juso();
				//새로운 번호 구하기
				ArrayList<Juso> list = dao.list();
				Juso juso1 = list.get(list.size()-1);
				int newNo = juso1.getNo() + 1;
				System.out.print("\n번호를 입력하세요. => " + newNo);
				ju.setNo(newNo);
				System.out.println("");
//				String no = s.nextLine();
//				if(no=="") break;
//				ju.setNo(Integer.parseInt(no));
				//나머지 데이터 입력
				System.out.print("이름을 입력하세요. => ");
				String name = s.nextLine();
				if(name=="") break;
				ju.setName(name);
				
				System.out.print("전화를 입력하세요. => ");
				String phone = s.nextLine();
				if(phone=="") break;
				ju.setPhone(phone);
				
				System.out.print("주소를 입력하세요. => ");
				String address = s.nextLine();
				if(address=="") break;
				ju.setAddress(address);
				
				dao.insert(ju);
				System.out.println("주소등록 완료");
				break;
				
			case "2" : //주소조회 출력
				System.out.print("\n조회할 이름을 입력하세요. => ");
				name = s.nextLine();
				Juso juso = dao.read(name);
				
				if(juso.getNo() == 0) {
					System.out.println(name + "님이 존재하지 않습니다.");
				}
				else {
					System.out.println("번호 : " + juso.getNo());
					System.out.println("이름 : " + juso.getName());
					System.out.println("전화 : " + juso.getPhone());
					System.out.println("주소 : " + juso.getAddress());
				}
	
				break;
				
			case "3" : //주소목록 출력
				ArrayList<Juso> array = dao.list(); //10번
				for(Juso j:array) {
					System.out.println(j.toString());
				}
				break;
				
			case "4" : //주소삭제 출력
				System.out.print("\n삭제할 번호를 입력하세요. => ");
				String sno = s.nextLine();
				if(sno=="") break;
				juso = dao.read(sno);
				if(juso.getNo()==0) {
					System.out.println(sno + "번이 존재하지 않습니다.");
				}
				else {
					dao.delete(Integer.parseInt(sno));
					System.out.println(juso.getName() + "님의 데이터가 삭제되었습니다.");
				}
				
				break;

			case "0" :
				run = false;
				break;
				
			default :
				System.out.println("0~4번 메뉴를 선택하세요.");
				break;
		
			}//switch

		}//while
		System.out.println("프로그램을 종료합니다.");
	}//method

}//class
