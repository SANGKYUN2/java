package product;

import java.text.DecimalFormat;

public class ProductVO { //자바빈
	private String code;
	private String name;
	private int price;
	private int sum;

	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
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
	
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,###원");
		String fmtPrice = df.format(price);
		return "상품 관리 프로그램 [ 상품번호 = " + code + ", 상품명 = " + name + ", 상품가격 = " + fmtPrice + " ]";
	}
	public int getSum() {
		// TODO Auto-generated method stub
		return sum;
	}

	
	

}
