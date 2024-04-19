package am;


public class Car { //자바빈
	//필드 (속성)
	
	private int no;
	private String company;
	private String model;
	private String color;
	private int distance;
	private String date;
	
	public Car() {
		
	}
	
	
	public Car(int no, String company, String model, String color, int distance, String date) {
		super();
		this.no = no;
		this.company = company;
		this.model = model;
		this.color = color;
		this.distance = distance;
		this.date = date;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}


	@Override
	public String toString() {
		return "자동차 관리 프로그램 [ 번호 = " + no + ", 회사 = " + company + ", 모델 = " + model + ", 색상 = " + color + ", 거리 = "
				+ distance + ", 년식 = " + date + " ]";
	}
	
	
	

}//메소드

//생성자2
//public Car(String company, String model, String color, int distance) {
//	super();
//	this.company = company;
//	this.model = model;
//	this.color = color;
//	this.distance = distance;
//}

//public void print() {
//System.out.printf("\n회사 : %s\n", company);
//System.out.printf("모델 : %s\n", model);
//System.out.printf("색상 : %s\n", color);
//System.out.printf("주행거리 : %d\n", distance);
//System.out.printf("년식 : %s\n", date);
//
//}
