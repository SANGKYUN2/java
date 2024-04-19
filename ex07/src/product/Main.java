package product;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import sale.Sub;

public class Main {
	
	public static void main(String[] args) {
		ProductDAO dao = new ProductDAO();
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 목요일 오후 수업입니다.");
		System.out.println("오늘은 " + sdf.format(today));

		while(run) {
			System.out.println("\n=====================================================");
			System.out.println("1.상품등록|2.상품조회|3.상품목록|4.상품삭제|5.상품수정|6.매출관리|0.종료");
			System.out.println("=====================================================");
			System.out.print("메뉴를 선택하세요. => ");
			String menu= scanner.nextLine();

			switch(menu) {

			case "1" : //상품등록
				ProductVO vo1 = new ProductVO();
				vo1.setCode(dao.getCode());
				System.out.println("\n상품코드 : " + vo1.getCode());
				System.out.print("상품 이름을 입력하세요. => ");
				String name1=scanner.nextLine();
				if(name1=="") {
					System.out.println("상품 등록을 취소합니다.");
					break;
				}
				else {
					vo1.setName(name1);
				}
				while(true) {
					System.out.print("상품 가격을 입력하세요. => ");
					String price1 = scanner.nextLine();

					if(price1=="") {
						System.out.println("상품등록을 취소합니다.");
						break;
					}

					if(isNumber(price1)) { //가격이 숫자이면 
						vo1.setPrice(Integer.parseInt(price1));
						System.out.println(vo1.toString());
						dao.insert(vo1);
						System.out.println("상품이 등록되었습니다.");
						break;
					}

				}

				break;

			case "2" : //상품조회
				while(true) {
					System.out.print("\n조회할 상품 코드를 입력하세요. => ");
					String code2 = scanner.nextLine();
					if(code2=="") {
						System.out.println("조회 작업을 취소합니다.\n");
						break;	
					}

					ProductVO vo2 = dao.read(code2);
					if(vo2.getCode()==null) {
						System.out.println(code2 + "번 상품이 존재하지 않습니다. ");

					}
					else {
						System.out.println(vo2.toString());
					}
				}

			case "3" : //상품목록
				ArrayList<ProductVO> array = dao.list();
				for(ProductVO vo:array) {
					System.out.println(vo.toString());
				}
				break;

			case "4" : //상품삭제
				System.out.print("\n삭제할 코드를 입력하세요. => ");
				String code4 = scanner.nextLine();
				ProductVO vo4 = dao.read(code4);
				if(vo4.getCode()==null) {
					System.out.println(code4 + "번 상품이 존재하지 않습니다.");
				}
				else {
					System.out.println(vo4.toString());
					System.out.print("삭제하시겠습니까?(y)");
					String sel = scanner.nextLine();
					if(sel.equals("Y") || sel.equals("y")) {
						//데이터베이스 삭제
						if(dao.delete(code4)) {
							System.out.println("상품 정보를 삭제했습니다.");
						}
						else {
							System.out.println("상품 정보를 삭제하지 못했습니다.");
						}
					}
					else {
						System.out.println("삭제를 취소합니다.");
					}
				}
				break;

			case "5" : //상품수정
				System.out.print("수정할 상품 코드를 입력하세요. => ");
				String code5 = scanner.nextLine();
				ProductVO vo5 = dao.read(code5);
				if(vo5.getCode()==null) {
					System.out.println(code5 + "번 상품이 존재하지 않습니다.");
					break;
				}
				else {
					System.out.print("상품 이름 : " + vo5.getName() + " => ");
					String name5 = scanner.nextLine();
					if(!name5.equals("")) vo5.setName(name5);
					while(true) {
						System.out.print("상품 단가 : " + vo5.getPrice() + " => ");
						String price5 = scanner.nextLine();
						if(price5.equals("")) { //엔터를 쳤을때 그대로 나옴
							break;
						}

						if(isNumber(price5)) { //무언가 입력 문자? 숫자?
							vo5.setPrice(Integer.parseInt(price5)); //숫자면 입력한 값을 넣어줌
							break;
						}



					}//가격입력 while
				
					
					System.out.println(vo5.toString());
					System.out.print("정말로 수정하시겠습니까?(y)");
					String sel5=scanner.nextLine();
					if(sel5.equals("Y") || sel5.equals("y")) {
						dao.update(vo5);
						System.out.println("상품이 수정되었습니다.");
					}
					else {
						System.out.println("수정을 취소합니다.");
					}
				}

				break;
				
			case "6" :
				Sub.run();
				break;

			case "0" :
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;

			default:
				System.out.println("0~6 메뉴를 입력하세요!");
				break;

			}//switch

		}//while

	}//method

	public static boolean isNumber(String str) {
		try {
			Integer.parseInt(str);
			return true;
		}
		catch (Exception e) {
			System.out.println("숫자로 입력하세요.");
			return false;
		}
	}
	
	public static ProductVO read(String code) {
		ProductDAO dao = new ProductDAO();
		ProductVO vo =  dao.read(code);
		if(vo.getCode()==null) {
			System.out.println(code + "번 상품이 존재하지 않습니다.");
		}
		return vo;
	}

}//class




