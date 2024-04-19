package sale;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import product.*;


public class Sub {
	public static void run() { //void 리턴할것이 없으면
		SaleDAO dao = new SaleDAO();
		ProductDAO pdao = new ProductDAO();
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,###원");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		while(run) {
			System.out.println("\n=========================================");
			System.out.println("1.판매등록|2.판매조회|3.판매현황|4.판매삭제|0.종료");
			System.out.println("=========================================");
			System.out.print("메뉴를 입력하세요. => ");
			String menu= scanner.nextLine();
			System.out.println("");
			switch(menu) {
			
			case "1" :
				System.out.print("상품 코드를 입력하세요. => ");
				String code1=scanner.nextLine();
				ProductVO vo1 = pdao.read(code1); //ProductVO 객체인 vo1에 상품 정보를 얻기 위해 pdao.read(code1) 메서드를 호출하는 부분입니다. 
				if(vo1.getCode()==null) {
					System.out.println(code1 + "번 상품이 존재하지 않습니다.");
				}
				else {
					SaleVO svo = new SaleVO();
					svo.setCode(code1);
					
					System.out.println("상품명 : " + vo1.getName());
					String today = sdf.format(new Date()); //오늘 날짜 생성
					
					System.out.print("판매 날짜 : " + today + " => ");
					String date = scanner.nextLine();
					if(date!="") {
						svo.setSale_date(date);
					}
					else {
						System.out.println(today);
					}
					System.out.print("판매 가격 : " + vo1.getPrice() + " => ");
					String price = scanner.nextLine();
					if(price!="") {
						svo.setPrice(Integer.parseInt(price));
					}
					else {
						svo.setPrice(vo1.getPrice());
					}
					System.out.print("판매 수량 : ");
					String qnt = scanner.nextLine();
					if(qnt!="") {
						svo.setQnt(Integer.parseInt(qnt));
					}
					else {
						svo.setQnt(1);
					}


					System.out.println(svo.toString());
					dao.insert(svo);
					System.out.println("매출이 등록되었습니다.");
				}
				break;
				
			case "2" : //판매조회
				System.out.print("조회할 상품 코드를 입력하세요. = > ");
				String code2 = scanner.nextLine();
				ProductVO vo2 = pdao.read(code2);
				if(vo2.getCode()==null) {
					System.out.println(code2 + "번 상품이 존재하지 않습니다.");
				}
				else {
					System.out.println("상품 이름 : " + vo2.getName());
					System.out.println("상품 단가 : " + df.format(vo2.getPrice()));
					System.out.println("상품 금액 : " + df.format(vo2.getSum()));
				}
				break;
				
			case "3" : //판매현황
				System.out.println("\t\t\t상품 판매 현황\t\t\n");
					for(SaleVO vo3 : dao.list()) {
						System.out.printf("%s\t%s(%s)\t%d개\t%,d원\n",
								vo3.getSale_date(), vo3.getName(), vo3.getCode(), vo3.getQnt()
								,vo3.getPrice());
					
				}
				break;
				
			case "4" :
				
				break;
				
			case "0" :
				System.out.println("판매 관리를 종료합니다.");
				run = false;
				break;
				
			default:
				System.out.println("0~4 메뉴를 입력하세요!");
				break;
			}//switch   
		}//while
	}

	private static Object getSum() {
		// TODO Auto-generated method stub
		return null;
	}//method
}

