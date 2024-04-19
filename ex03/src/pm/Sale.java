package pm;

public class Sale {
	
	//필드
	String code;
	String name;
	int price;
	int qnt;
	
	//생성자2
	public Sale(String code, String name, int price, int qnt) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
		this.qnt = qnt;
	}
	
	//기본생성자
	public Sale() {
		// TODO Auto-generated constructor stub
	}
	

	//금액을 구하는 메서드
	public int sum() {
		int sum = price * qnt;
		return sum;
	}
	

	//내용을 가로 출력
	public void print_land() {
		System.out.printf("상품 코드 : %s\t상품 이름 : %s\t상품 가격 : %,d만원\t상품 수량 : %d개\t총 가격 : %,d만원\n", 
				code, name, price, qnt, sum());
	}
	
	//내용을 세로 출력
	public void print_port() {
		System.out.printf("상품 코드 : %s\n", code); 
		System.out.printf("상품 이름 : %s\n", name);
		System.out.printf("상품 가격 : %,d만원\n", price);
		System.out.printf("상품 수량 : %d개\n", qnt);
		System.out.printf("총 가격 : %,d만원\n", sum());
	}
	

}
