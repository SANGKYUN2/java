package sale;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date; //format 주려고 util date

import product.ProductVO;

public class SaleVO extends ProductVO { //자바빈 productvo를 상속
	private int seq;
	private String code;
	private String sale_date;
	private int qnt;
	
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getSale_date() {
		return sale_date;
	}
	public void setSale_date(String sale_date) {
		this.sale_date = sale_date;
	}
	public int getQnt() {
		return qnt;
	}
	public void setQnt(int qnt) {
		this.qnt = qnt;
	
	
	}//method


	
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,###");
		String fmtPrice = df.format(getPrice());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년MM월dd일");
		//String fmtDate = sdf.format(sale_date);
		int sum = getPrice() * qnt;
		String fmtSum = df.format(sum);
		return "상품 코드 = " + code + ", 판매 날짜 = " + getSale_date() + ", 판매 수량 = " + qnt 
				+ ", 상품 이름 = " + getName() + ", 상품 가격 = " + fmtPrice + ", 상품 금액 = " + fmtSum;
	}
	
	

	
	
	
}
