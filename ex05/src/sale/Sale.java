package sale;

public class Sale {
	private int code;
	private String name;
	private int price;
	private int qnt;
	
	
	public Sale() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Sale(int code, String name, int price, int qnt) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
		this.qnt = qnt;
	}
	
	public int getCode() {
		return code;
	}


	public void setCode(int code) {
		this.code = code;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getQnt() {
		return qnt;
	}


	public void setQnt(int qnt) {
		this.qnt = qnt;
	}


	@Override
	public String toString() {
		return "판매 관리 프로그램 [번호 = " + code + ", 이름 = " + name + ", 가격 = " + price + ", 수량 = " + qnt + " ]";
	}
	
	

}
