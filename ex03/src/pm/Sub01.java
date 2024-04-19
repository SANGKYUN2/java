package pm;

import java.util.*;

public class Sub01 {
	
	public static void run() {
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Sale> sales = new ArrayList<>();
		Sale s1 = new Sale();
		s1.code="100";
		s1.name="냉장고";
		s1.price=350;
		s1.qnt=15;
		sales.add(s1);
		
		Sale s2 = new Sale("101", "세탁기", 270, 25);
		sales.add(s2);
		
		
		while(run) {
			System.out.println("\n╭───────────────────────────────────────────────────────────────╮");
			System.out.println("  1 매출 등록 | 2. 매출 목록 | 3. 상품 조회 | 4. 매출 삭제 | 0. 프로그램 종료 ");
			System.out.println("╰───────────────────────────────────────────────────────────────╯");
			System.out.print("선택 ➤ ");
			String menu = sc.nextLine();
			System.out.println("");
			
			switch(menu) {
			
			case "1" : //매출 등록
				Sale s3 = new Sale(); //s3라는 객체
				Sale last = sales.get(sales.size()-1);
				int code = Integer.parseInt(last.code) + 1; //String -> int
				s3.code=String.valueOf(code); //int -> String
				System.out.println("상품 코드를 입력하세요. ➤ " + s3.code);
				System.out.print("상품 이름을 입력하세요. ➤ ");
				s3.name=sc.nextLine();
				if(s3.name=="") break;
				while(true) {
					System.out.print("상품 가격을 입력하세요. ➤ ");
					String price = sc.nextLine();
					if(checkNumber(price)) {
						s3.price = Integer.parseInt(price);
						break;
					}
				}
				
				while(true) {
					System.out.print("상품 수량을 입력하세요. ➤ ");
					String qnt = sc.nextLine();
					if(checkNumber(qnt)) {
						s3.qnt = Integer.parseInt(qnt);
						break;
					}
				}
				
				sales.add(s3);
				System.out.print("상품이 등록되었습니다.\n");
				
				break;
				
			case "2" : //매출 목록 출력
				int tot_qnt = 0;
				int tot_sum = 0;
				for(Sale s:sales) {
					s.print_land();
					tot_qnt = tot_qnt + s.qnt;
					tot_sum = tot_sum + s.sum();
					
				}
				System.out.println("\n=====================================================");
				System.out.printf("\t\t총 판매 수량 : %d개\n", tot_qnt);
				System.out.printf("\t\t총 판매 금액 : %,d만원\n", tot_sum);
				System.out.println("=====================================================");
				System.out.println(sales.size() + "개 상품이 존재합니다.");
				
				break;
				
			case "3" ://상품조회
				while(true) {
					System.out.print("상품명/코드를 입력하세요 ➤ ");
					String sname=sc.nextLine();
					if(sname=="") break;
					boolean find = false;
					for(Sale s:sales) {
						if(s.name.equals(sname) || s.code.equals(sname)) {
							s.print_port();
							System.out.println("");
							find = true;
						}
					}
					if(!find)
						System.out.println(sname + " 상품이 존재하지 않습니다.\n");
				}
				break;
				
			case "4" :
				while (true) {
					System.out.print("삭제할 상품명/코드를 입력하세요 ➤ ");
						
					String rname = sc.nextLine();
					boolean delete = false;
					if(rname=="") break;
					for(Sale s:sales) {
						if(s.name.equals(rname) || s.code.equals(rname)) {
						s.print_port();
						delete = true;
							System.out.print("삭제하시겠습니까? (예/아니요)");
							String answer = sc.nextLine();
							if(answer.equals("예") || answer.equals("아니요")) {
								sales.remove(s);
								System.out.println(rname + " 상품을 삭제하셨습니다.\n");
								if (answer.equals("아니요")) {
									break;
								}
							}
							else {
								System.out.println("삭제를 취소하였습니다.\n");
							}
								
						}
					}
					if(!delete) {
							System.out.println(rname + "님이 존재하지 않습니다.\n");
					}
					
				}
				
			case "0" :
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
				
			default :
				System.out.println("0~4번 메뉴를 선택하세요.");
				break;
			}//switch
		
		}//while
	}//method
	
	//숫자인지 아닌지 판별하는 메서드
	public static boolean checkNumber(String str) {
		try {
			int num = Integer.parseInt(str);
			return true;
		}
		catch(Exception e) { //문자를 입력 받아서 숫자로 바꿈
			System.out.println("숫자로 입력하세요.");
			return false;
		}

		
	}
}//class

//메소드에 static이 없을 경우
//Sub01.sub = new Sub01();
//sub.run();